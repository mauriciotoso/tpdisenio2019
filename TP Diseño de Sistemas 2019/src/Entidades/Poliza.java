package Entidades;

import java.util.Date;
import java.util.List;
import Enumerados.*;
import javax.persistence.*;

@Entity
public class Poliza{
	
	@Id
	private String nroPoliza;
	private Date vigenciaDesde;
	private Date vigenciaHasta;
	private String domicilioRiesgo;
	@OneToOne
	@JoinColumn (name="estadoPoliza")
	private EstadoPoliza estadoPoliza;
	private float prima;
	private float montoTotal;
	private float descuentoUnidad;
	private String patente;
	private String motor;
	private String chasis;
	@Column (name="kmsPorAnio")
	private int kmAnio;
	private float premio;
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "nropoliza")
	private List<Cuota> cuotas;
	@OneToOne
	@JoinColumn (name="idanio")
	private Anio idAnio;
	private String tipoPoliza;
	private int nroSiniestros;
	@OneToOne
	@JoinColumn (name="idmedidasseguridad")
	private MedidasSeguridad medidasSeguridad;
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "nropoliza")
	private List<HijoDeclarado> hijos;
	@ManyToOne
	@JoinColumn (name="idtipocobertura")
	private TipoCobertura tipoCobertura;
	@OneToOne
	@JoinColumn (name="idvalorporcentual")
	private ValoresPorcentualesPoliza valoresPorcentualesPoliza;
	@ManyToOne
	@JoinColumn (name="nrocliente")
	private Cliente nroCliente;
	
	public Poliza(){}
	
	public Poliza(String nroPoliza, Date vigenciaDesde, Date vigenciaHasta, String domicilioRiesgo,
			EstadoPoliza estadoPoliza, float prima, float montoTotal, float descuentoUnidad, String patente,
			String motor, String chasis, int kmAnio, float premio, List<Cuota> cuotas, Anio idAnio, String tipoPoliza,
			int nroSiniestros, MedidasSeguridad medidasSeguridad, List<HijoDeclarado> hijos,
			TipoCobertura tipoCobertura, ValoresPorcentualesPoliza valoresPorcentualesPoliza, Cliente nroCliente) {
		super();
		this.nroPoliza = nroPoliza;
		this.vigenciaDesde = vigenciaDesde;
		this.vigenciaHasta = vigenciaHasta;
		this.domicilioRiesgo = domicilioRiesgo;
		this.estadoPoliza = estadoPoliza;
		this.prima = prima;
		this.montoTotal = montoTotal;
		this.descuentoUnidad = descuentoUnidad;
		this.patente = patente;
		this.motor = motor;
		this.chasis = chasis;
		this.kmAnio = kmAnio;
		this.premio = premio;
		this.cuotas = cuotas;
		this.idAnio = idAnio;
		this.tipoPoliza = tipoPoliza;
		this.nroSiniestros = nroSiniestros;
		this.medidasSeguridad = medidasSeguridad;
		this.hijos = hijos;
		this.tipoCobertura = tipoCobertura;
		this.valoresPorcentualesPoliza = valoresPorcentualesPoliza;
		this.nroCliente = nroCliente;
	}
	

	public Poliza(long nroPoliza,Date vigenciaDesde, Date vigenciaHasta, Localidad localidad,
			EstadoPoliza estadoPoliza, String patente,
			String motor, String chasis, int kmAnio, List<Cuota> cuotas, Anio idAnio, String tipoPoliza,
			int nroSiniestros, MedidasSeguridad medidasSeguridad, List<HijoDeclarado> hijos,
			TipoCobertura tipoCobertura, ValoresPorcentualesPoliza valoresPorcentualesPoliza, Cliente nroCliente) {
		super();
		this.nroPoliza = this.generarNroPoliza(nroPoliza);
		this.vigenciaDesde = vigenciaDesde;
		this.vigenciaHasta = vigenciaHasta;
		this.domicilioRiesgo = this.generarDomicilio(localidad);
		this.estadoPoliza = estadoPoliza;
		this.patente = patente;
		this.motor = motor;
		this.chasis = chasis;
		this.kmAnio = kmAnio;
		this.cuotas = cuotas;
		this.idAnio = idAnio;
		this.tipoPoliza = tipoPoliza;
		this.nroSiniestros = nroSiniestros;
		this.medidasSeguridad = medidasSeguridad;
		this.hijos = hijos;
		this.tipoCobertura = tipoCobertura;
		this.valoresPorcentualesPoliza = valoresPorcentualesPoliza;
		this.nroCliente = nroCliente;

	}
	
	public String generarNroPoliza(long nro) {
		String sucursal="0000";
		String nroPoliza = String.valueOf(nro);
		String secuenciaRenovacion="00";
		
		String aux="";
		for(int i=0;i<(7-nroPoliza.length());i++) {
			aux=aux+"0";
		}
		
		return sucursal+"-"+aux+nroPoliza+"-"+secuenciaRenovacion;
	}
	
	public String generarDomicilio(Localidad localidad) {
		return localidad.getNombre()+", "+localidad.getProvincia().getNombre();
	}

	public String getNroPoliza() {
		return nroPoliza;
	}

	public void setNroPoliza(String nroPoliza) {
		this.nroPoliza = nroPoliza;
	}

	public Date getVigenciaDesde() {
		return vigenciaDesde;
	}

	public void setVigenciaDesde(Date vigenciaDesde) {
		this.vigenciaDesde = vigenciaDesde;
	}

	public Date getVigenciaHasta() {
		return vigenciaHasta;
	}

	public void setVigenciaHasta(Date vigenciaHasta) {
		this.vigenciaHasta = vigenciaHasta;
	}

	public String getDomicilioRiesgo() {
		return domicilioRiesgo;
	}

	public void setDomicilioRiesgo(String domicilioRiesgo) {
		this.domicilioRiesgo = domicilioRiesgo;
	}

	public EstadoPoliza getEstadoPoliza() {
		return estadoPoliza;
	}

	public void setEstadoPoliza(EstadoPoliza estadoPoliza) {
		this.estadoPoliza = estadoPoliza;
	}

	public float getPrima() {
		return prima;
	}

	public void setPrima(float prima) {
		this.prima = prima;
	}

	public float getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(float montoTotal) {
		this.montoTotal = montoTotal;
	}

	public float getDescuentoUnidad() {
		return descuentoUnidad;
	}

	public void setDescuentoUnidad(float descuentoUnidad) {
		this.descuentoUnidad = descuentoUnidad;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
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

	public int getKmAnio() {
		return kmAnio;
	}

	public void setKmAnio(int kmAnio) {
		this.kmAnio = kmAnio;
	}

	public float getPremio() {
		return premio;
	}

	public void setPremio(float premio) {
		this.premio = premio;
	}

	public List<Cuota> getCuotas() {
		return cuotas;
	}

	public void setCuotas(List<Cuota> cuotas) {
		this.cuotas = cuotas;
	}

	public Anio getAnioModelo() {
		return idAnio;
	}

	public void setAnioModelo(Anio anioModelo) {
		this.idAnio = anioModelo;
	}

	public MedidasSeguridad getMedidasSeguridad() {
		return medidasSeguridad;
	}

	public void setMedidasSeguridad(MedidasSeguridad medidasSeguridad) {
		this.medidasSeguridad = medidasSeguridad;
	}

	public List<HijoDeclarado> getHijos() {
		return hijos;
	}

	public void setHijos(List<HijoDeclarado> hijos) {
		this.hijos = hijos;
	}

	public TipoCobertura getTipoCobertura() {
		return tipoCobertura;
	}

	public void setTipoCobertura(TipoCobertura tipoCobertura) {
		this.tipoCobertura = tipoCobertura;
	}

	public ValoresPorcentualesPoliza getValoresPorcentualesPoliza() {
		return valoresPorcentualesPoliza;
	}

	public void setValoresPorcentualesPoliza(ValoresPorcentualesPoliza valoresPorcentualesPoliza) {
		this.valoresPorcentualesPoliza = valoresPorcentualesPoliza;
	}

	public Cliente getCliente() {
		return nroCliente;
	}

	public void setCliente(Cliente cliente) {
		this.nroCliente = cliente;
	}

	public Anio getIdAnio() {
		return idAnio;
	}

	public void setIdAnio(Anio idAnio) {
		this.idAnio = idAnio;
	}

	public String getTipoPoliza() {
		return tipoPoliza;
	}

	public void setTipoPoliza(String tipoPoliza) {
		this.tipoPoliza = tipoPoliza;
	}

	public Cliente getNroCliente() {
		return nroCliente;
	}

	public void setNroCliente(Cliente nroCliente) {
		this.nroCliente = nroCliente;
	}
	public int getNroSiniestros() {
		return nroSiniestros;
	}
	public void setNroSiniestros(int nroSiniestros) {
		this.nroSiniestros = nroSiniestros;
	}
	@Override
	public String toString() {
		return "Poliza [nroPoliza=" + nroPoliza + ", vigenciaDesde=" + vigenciaDesde + ", vigenciaHasta="
				+ vigenciaHasta + ", domicilioRiesgo=" + domicilioRiesgo + ", estadoPoliza=" + estadoPoliza + ", prima="
				+ prima + ", montoTotal=" + montoTotal + ", descuentoUnidad=" + descuentoUnidad + ", patente=" + patente
				+ ", motor=" + motor + ", chasis=" + chasis + ", kmAnio=" + kmAnio + ", premio=" + premio + ", cuotas="
				+ cuotas + ", idAnio=" + idAnio + ", tipoPoliza=" + tipoPoliza + ", nroSiniestros=" + nroSiniestros
				+ ", medidasSeguridad=" + medidasSeguridad + ", hijos=" + hijos + ", tipoCobertura=" + tipoCobertura
				+ ", valoresPorcentualesPoliza=" + valoresPorcentualesPoliza + ", nroCliente=" + nroCliente + "]";
	}
	
	public void actualizarGenerada() {
		this.setEstadoPoliza(new EstadoPoliza(1,"GENERADA"));
	}
}
