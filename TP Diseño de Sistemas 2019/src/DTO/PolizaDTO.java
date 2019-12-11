package DTO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import Entidades.*;

public class PolizaDTO {

	private String nroPoliza;
	private int idlocalidad;
	private String localidad;
	private String provincia;
	private String pais;
	private String marca;
	private String modelo;
	private int idAnioModelo;
	private String motor;
	private String chasis;
	private String patente;
	private int kmAnio;
	private float montoTotal;
	private int nroSiniestros;
	private int idTipoCobertura;
	private String tipoCobertura;
	private String tipoPoliza;
	private Date fechaInicio;
	private Date fechaFin;
	private MedidasSeguridadDTO medidasSeguridad;
	private List<CuotaDTO> cuotas;
	private List<HijoDTO> hijos;
	private ClienteDTO cliente;
	private ValorPorcentualDTO valoresPorcentualesDTO;
	private int idEstadoPoliza;
	private String estadoPoliza;
	
	public PolizaDTO() {}
	
	public PolizaDTO(String nroPoliza, int idlocalidad, String localidad, String provincia, String pais, String marca,
			String modelo, int idAnioModelo, String motor, String chasis, String patente, int kmAnio, float montoTotal,
			int nroSiniestros, int idTipoCobertura, String tipoCobertura, String tipoPoliza, Date fechaInicio,
			Date fechaFin, MedidasSeguridadDTO medidasSeguridad, List<CuotaDTO> cuotas, List<HijoDTO> hijos,
			ClienteDTO cliente, ValorPorcentualDTO valoresPorcentualesDTO, int idEstadoPoliza, String estadoPoliza) {
		super();
		this.nroPoliza = nroPoliza;
		this.idlocalidad = idlocalidad;
		this.localidad = localidad;
		this.provincia = provincia;
		this.pais = pais;
		this.marca = marca;
		this.modelo = modelo;
		this.idAnioModelo = idAnioModelo;
		this.motor = motor;
		this.chasis = chasis;
		this.patente = patente;
		this.kmAnio = kmAnio;
		this.montoTotal = montoTotal;
		this.nroSiniestros = nroSiniestros;
		this.idTipoCobertura = idTipoCobertura;
		this.tipoCobertura = tipoCobertura;
		this.tipoPoliza = tipoPoliza;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.medidasSeguridad = medidasSeguridad;
		this.cuotas = cuotas;
		this.hijos = hijos;
		this.cliente = cliente;
		this.valoresPorcentualesDTO = valoresPorcentualesDTO;
		this.idEstadoPoliza = idEstadoPoliza;
		this.estadoPoliza = estadoPoliza;
	}

	public PolizaDTO(Localidad localidad, Anio anio, String motor, String chasis, String patente, int kmAnio,
			int nroSiniestros, MedidasSeguridadDTO medidasSeguridad,
			ClienteDTO cliente) {
		
		this.nroPoliza = "-";
		this.idlocalidad = localidad.getIdLocalidad();
		this.localidad = localidad.getNombre();
		this.provincia = localidad.getProvincia().getNombre();
		this.pais = localidad.getProvincia().getPais().getNombre();
		this.marca = anio.getModelo().getMarca().getMarca();
		this.modelo = anio.getModelo().getNombre();
		this.idAnioModelo = anio.getIdAnio();
		this.motor = motor;
		this.chasis = chasis;
		this.patente = patente;
		this.kmAnio = kmAnio;
		this.nroSiniestros = nroSiniestros;
		this.medidasSeguridad = medidasSeguridad;
		this.cliente = cliente;
	}
	
	public PolizaDTO(Poliza pol) {
		if(pol!=null) {
		this.nroPoliza = pol.getNroPoliza();
		
		ArrayList<CuotaDTO> cuotasDTO = new ArrayList<CuotaDTO>();
		for (Cuota cuota: pol.getCuotas()) {
			CuotaDTO c = new CuotaDTO(cuota);
			cuotasDTO.add(c);
		}
		ArrayList<HijoDTO> hijosDTO = new ArrayList<HijoDTO>();
		for (HijoDeclarado hijo: pol.getHijos()) {
			HijoDTO h = new HijoDTO(hijo);
			hijosDTO.add(h);
		}
		
		this.motor = pol.getMotor();
		this.chasis = pol.getChasis();
		this.patente = pol.getPatente();
		this.kmAnio = pol.getKmAnio();
		this.montoTotal = pol.getMontoTotal();
		this.nroSiniestros = pol.getNroSiniestros();
		this.tipoPoliza = pol.getTipoPoliza();
		this.fechaInicio = pol.getVigenciaDesde();
		this.fechaFin = pol.getVigenciaHasta();
		this.medidasSeguridad = new MedidasSeguridadDTO(pol.getMedidasSeguridad());
		this.cuotas = cuotasDTO;
		this.hijos = hijosDTO;
		this.cliente = new ClienteDTO(pol.getNroCliente());
		this.valoresPorcentualesDTO = new ValorPorcentualDTO(pol.getValoresPorcentualesPoliza());
		//this.idEstadoPoliza = idEstadoPoliza;
		this.estadoPoliza = pol.getEstadoPoliza().toString();
		this.marca=pol.getAnioModelo().getModelo().getMarca().getMarca();
		this.modelo=pol.getAnioModelo().getModelo().getNombre();
		this.idAnioModelo=pol.getIdAnio().getIdAnio();
		
		
		}
	}

	public String getNroPoliza() {
		return nroPoliza;
	}

	public void setNroPoliza(String nroPoliza) {
		this.nroPoliza = nroPoliza;
	}

	public int getIdlocalidad() {
		return idlocalidad;
	}

	public void setIdlocalidad(int idlocalidad) {
		this.idlocalidad = idlocalidad;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getIdAnioModelo() {
		return idAnioModelo;
	}

	public void setIdAnioModelo(int idAnioModelo) {
		this.idAnioModelo = idAnioModelo;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getChasis() {
		return chasis;
	}

	public void setChasis(String chasis) {
		this.chasis = chasis;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public int getKmAnio() {
		return kmAnio;
	}

	public void setKmAnio(int kmAnio) {
		this.kmAnio = kmAnio;
	}

	public float getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(float montoTotal) {
		this.montoTotal = montoTotal;
	}

	public int getNroSiniestros() {
		return nroSiniestros;
	}

	public void setNroSiniestros(int nroSiniestros) {
		this.nroSiniestros = nroSiniestros;
	}

	public int getIdTipoCobertura() {
		return idTipoCobertura;
	}

	public void setIdTipoCobertura(int idTipoCobertura) {
		this.idTipoCobertura = idTipoCobertura;
	}

	public String getTipoCobertura() {
		return tipoCobertura;
	}

	public void setTipoCobertura(String tipoCobertura) {
		this.tipoCobertura = tipoCobertura;
	}

	public String getTipoPoliza() {
		return tipoPoliza;
	}

	public void setTipoPoliza(String tipoPoliza) {
		this.tipoPoliza = tipoPoliza;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public MedidasSeguridadDTO getMedidasSeguridad() {
		return medidasSeguridad;
	}

	public void setMedidasSeguridad(MedidasSeguridadDTO medidasSeguridad) {
		this.medidasSeguridad = medidasSeguridad;
	}

	public List<CuotaDTO> getCuotas() {
		return cuotas;
	}

	public void setCuotas(List<CuotaDTO> cuotas) {
		this.cuotas = cuotas;
	}

	public List<HijoDTO> getHijos() {
		return hijos;
	}

	public void setHijos(List<HijoDTO> hijos) {
		this.hijos = hijos;
	}

	public ClienteDTO getCliente() {
		return cliente;
	}

	public void setCliente(ClienteDTO cliente) {
		this.cliente = cliente;
	}

	public ValorPorcentualDTO getValoresPorcentualesDTO() {
		return valoresPorcentualesDTO;
	}

	public void setValoresPorcentualesDTO(ValorPorcentualDTO valoresPorcentualesDTO) {
		this.valoresPorcentualesDTO = valoresPorcentualesDTO;
	}

	public int getIdEstadoPoliza() {
		return idEstadoPoliza;
	}

	public void setIdEstadoPoliza(int idEstadoPoliza) {
		this.idEstadoPoliza = idEstadoPoliza;
	}

	public String getEstadoPoliza() {
		return estadoPoliza;
	}

	public void setEstadoPoliza(String estadoPoliza) {
		this.estadoPoliza = estadoPoliza;
	}

	@Override
	public String toString() {
		return "PolizaDTO [nroPoliza=" + nroPoliza + ", idlocalidad=" + idlocalidad + ", localidad=" + localidad
				+ ", provincia=" + provincia + ", pais=" + pais + ", marca=" + marca + ", modelo=" + modelo
				+ ", idAnioModelo=" + idAnioModelo + ", motor=" + motor + ", chasis=" + chasis + ", patente=" + patente
				+ ", kmAnio=" + kmAnio + ", montoTotal=" + montoTotal + ", nroSiniestros=" + nroSiniestros
				+ ", idTipoCobertura=" + idTipoCobertura + ", tipoCobertura=" + tipoCobertura + ", tipoPoliza="
				+ tipoPoliza + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", medidasSeguridad="
				+ medidasSeguridad + ", cuotas=" + cuotas + ", hijos=" + hijos + ", cliente=" + cliente
				+ ", valoresPorcentualesDTO=" + valoresPorcentualesDTO + ", idEstadoPoliza=" + idEstadoPoliza
				+ ", estadoPoliza=" + estadoPoliza + "]";
	}
	
	public ArrayList<CuotaDTO> getCuotasA(){
		
		ArrayList<CuotaDTO> cuotasA = new ArrayList<CuotaDTO>();
		Date hoy = new Date();
		ArrayList<CuotaDTO> cuotasPol =(ArrayList<CuotaDTO>) this.getCuotas();
		
		for(CuotaDTO cuo: cuotasPol) {
			Date diaCuota = cuo.getUltimoDiaPago();
			if(diaCuota!=null) {
			if(diaCuota.before(hoy) && !cuo.isEstaPago()) 
				cuotasA.add(cuo);
			}
		}
		return cuotasA;
	}
	public Object[][] getDatosCuotasA(int cantColum){
		ArrayList<CuotaDTO> cuotasA = this.getCuotasA();
		Object[][] aux = new Object[cuotasA.size()][cantColum];
		for(int i=0; i<cuotasA.size();i++) {
			aux[i][0]= Integer.toString(cuotasA.get(i).getNroCuota());
			aux[i][1]= Float.toString(cuotasA.get(i).getImporteCuota());
			float importeActual= cuotasA.get(i).getImporteCuota()+cuotasA.get(i).getRecargosPorMora();
			aux[i][2]= Float.toString(importeActual);
		}
		
		return aux;
	}
	

	public ArrayList<CuotaDTO> getCuotasF(){
		ArrayList<CuotaDTO> cuotasA = new ArrayList<CuotaDTO>();
		Date hoy = new Date();
		for(CuotaDTO cuo:this.getCuotas()) {
			if(cuo.getUltimoDiaPago().after(hoy) && !cuo.isEstaPago()) 
				cuotasA.add(cuo);
		}
		return cuotasA;
	}
	public Object[][] getDatosCuotasF(){
		ArrayList<CuotaDTO> cuotasF = this.getCuotasF();
		Object[][] aux=new Object[cuotasF.size()][3];
		for(int i=0; i<cuotasF.size();i++) {
			aux[i][0]= Integer.toString(cuotasF.get(i).getNroCuota());
			aux[i][1]= Float.toString(cuotasF.get(i).getImporteCuota());
			float importeActual= cuotasF.get(i).getImporteCuota()-cuotasF.get(i).getBonificacion();
			aux[i][2]= Float.toString(importeActual);
		}
		
		return aux;
	}
		
}
