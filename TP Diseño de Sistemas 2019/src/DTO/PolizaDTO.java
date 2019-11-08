package DTO;

import java.util.Date;
import java.util.List;

import Enumerados.EstadoPoliza;

public class PolizaDTO {

	private String nroPoliza;
	private String localidad;
	private String provincia;
	private String pais;
	private String marca;
	private String modelo;
	private int anioModelo;
	private String motor;
	private String chasis;
	private String patente;
	private int kmAnio;
	private float montoTotal;
	private int nroSiniestros;
	private String tipoCobertura;
	private String tipoPoliza;
	private Date fechaInicio;
	private Date fechaFin;
	private String formaPago;
	private float valorPorcentualCobertura;
	private int anio;
	private MedidasSeguridadDTO medidasSeguridad;
	private List<CuotaDTO> cuotas;
	private List<HijoDTO> hijos;
	private ClienteDTO cliente;
	private ValorPorcentualDTO valoresPorcentualesDTO;
	private String estadoPoliza;
	
	public PolizaDTO() {
		
	}
	
	public PolizaDTO(String nroPoliza, String localidad, String provincia, String pais, String marca, String modelo,
			int anioModelo, String motor, String chasis, String patente, int kmAnio, float montoTotal,
			int nroSiniestros, String tipoCobertura, String tipoPoliza, Date fechaInicio, Date fechaFin,
			String formaPago, float valorPorcentualCobertura, int anio, MedidasSeguridadDTO medidasSeguridad,
			List<CuotaDTO> cuotas, List<HijoDTO> hijos, ClienteDTO cliente, ValorPorcentualDTO valoresPorcentualesDTO, String estadoPoliza) {
		super();
		this.nroPoliza = nroPoliza;
		this.localidad = localidad;
		this.provincia = provincia;
		this.pais = pais;
		this.marca = marca;
		this.modelo = modelo;
		this.anioModelo = anioModelo;
		this.motor = motor;
		this.chasis = chasis;
		this.patente = patente;
		this.kmAnio = kmAnio;
		this.montoTotal = montoTotal;
		this.nroSiniestros = nroSiniestros;
		this.tipoCobertura = tipoCobertura;
		this.tipoPoliza = tipoPoliza;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.formaPago = formaPago;
		this.valorPorcentualCobertura = valorPorcentualCobertura;
		this.anio = anio;
		this.medidasSeguridad = medidasSeguridad;
		this.cuotas = cuotas;
		this.hijos = hijos;
		this.cliente = cliente;
		this.valoresPorcentualesDTO = valoresPorcentualesDTO;
		this.estadoPoliza = estadoPoliza;
	}

	public String getEstadoPoliza() {
		return estadoPoliza;
	}

	public void setEstadoPoliza(String estadoPoliza) {
		this.estadoPoliza = estadoPoliza;
	}

	public String getNroPoliza() {
		return nroPoliza;
	}

	public void setNroPoliza(String nroPoliza) {
		this.nroPoliza = nroPoliza;
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

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
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

	public int getNroSiniestros() {
		return nroSiniestros;
	}

	public void setNroSiniestros(int nroSiniestros) {
		this.nroSiniestros = nroSiniestros;
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

	public String getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}

	public float getValorPorcentualCobertura() {
		return valorPorcentualCobertura;
	}

	public void setValorPorcentualCobertura(float valorPorcentualCobertura) {
		this.valorPorcentualCobertura = valorPorcentualCobertura;
	}

	public int getAnioModelo() {
		return anioModelo;
	}

	public void setAnioModelo(int anioModelo) {
		this.anioModelo = anioModelo;
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

	public float getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(float montoTotal) {
		this.montoTotal = montoTotal;
	}

	@Override
	public String toString() {
		return "PolizaDTO [nroPoliza=" + nroPoliza + ", localidad=" + localidad + ", provincia=" + provincia + ", pais="
				+ pais + ", marca=" + marca + ", modelo=" + modelo + ", anioModelo=" + anioModelo + ", motor=" + motor
				+ ", chasis=" + chasis + ", patente=" + patente + ", kmAnio=" + kmAnio + ", montoTotal=" + montoTotal
				+ ", nroSiniestros=" + nroSiniestros + ", tipoCobertura=" + tipoCobertura + ", tipoPoliza=" + tipoPoliza
				+ ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", formaPago=" + formaPago
				+ ", valorPorcentualCobertura=" + valorPorcentualCobertura + ", anio=" + anio + ", medidasSeguridad="
				+ medidasSeguridad + ", cuotas=" + cuotas + ", hijos=" + hijos + ", cliente=" + cliente
				+ ", valoresPorcentualesDTO=" + valoresPorcentualesDTO + ", estadoPoliza=" + estadoPoliza + "]";
	}
	
	
	
}
