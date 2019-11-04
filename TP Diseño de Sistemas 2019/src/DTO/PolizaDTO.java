package DTO;

import java.util.Date;
import java.util.List;

import Entidades.Anio;

public class PolizaDTO {

	private String nroPoliza;
	private String domicioRiesgo;
	private String marca;
	private String modelo;
	private Anio anio;
	private String motor;
	private String chasis;
	private String patente;
	private String kmAnio;
	private int nroSiniestros;
	private String tipoCobertura;
	private String tipoPoliza;
	private Date fechaInicio;
	private Date fechaFin;
	private String formaPago;
	private float valorPorcentualCobertura;
	private int anioModelo;
	private MedidasSeguridadDTO medidasSeguridad;
	private List<CuotaDTO> cuotas;
	private List<HijoDTO> hijos;
	private ClienteDTO cliente;
	private ValorPorcentualDTO valoresPorcentualesDTO;
	
	

	public PolizaDTO(String nroPoliza, String domicioRiesgo, String marca, String modelo, Anio anio, String motor,
			String chasis, String patente, String kmAnio, int nroSiniestros, String tipoCobertura, String tipoPoliza,
			Date fechaInicio, Date fechaFin, String formaPago, float valorPorcentualCobertura, int anioModelo,
			MedidasSeguridadDTO medidasSeguridad, List<CuotaDTO> cuotas, List<HijoDTO> hijos, ClienteDTO cliente,
			ValorPorcentualDTO valoresPorcentualesDTO) {
		super();
		this.nroPoliza = nroPoliza;
		this.domicioRiesgo = domicioRiesgo;
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.motor = motor;
		this.chasis = chasis;
		this.patente = patente;
		this.kmAnio = kmAnio;
		this.nroSiniestros = nroSiniestros;
		this.tipoCobertura = tipoCobertura;
		this.tipoPoliza = tipoPoliza;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.formaPago = formaPago;
		this.valorPorcentualCobertura = valorPorcentualCobertura;
		this.anioModelo = anioModelo;
		this.medidasSeguridad = medidasSeguridad;
		this.cuotas = cuotas;
		this.hijos = hijos;
		this.cliente = cliente;
		this.valoresPorcentualesDTO = valoresPorcentualesDTO;
	}

	public String getNroPoliza() {
		return nroPoliza;
	}

	public void setNroPoliza(String nroPoliza) {
		this.nroPoliza = nroPoliza;
	}

	public String getDomicioRiesgo() {
		return domicioRiesgo;
	}

	public void setDomicioRiesgo(String domicioRiesgo) {
		this.domicioRiesgo = domicioRiesgo;
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

	public Anio getAnio() {
		return anio;
	}

	public void setAnio(Anio anio) {
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

	public String getKmAnio() {
		return kmAnio;
	}

	public void setKmAnio(String kmAnio) {
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
	
	
}
