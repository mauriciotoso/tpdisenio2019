package Entidades;

import java.util.List;

import Enumerados.EstadoPoliza;

import javax.persistence.*;

public abstract class Poliza{
	
	@Id
	private String nroPoliza;
	private String vigenciaDesde;
	private String vigenciaHasta;
	private String domicilioRiesgo;
	private EstadoPoliza estadoPoliza;
	private float prima;
	private float montoTotal;
	private float descuentoUnidad;
	private String patente;
	private String motor;
	private String chasis;
	private int kmAnio;
	private int anio;
	private float premio;
	private List<Cuota> cuotas;
	private Anio anioModelo;
	private MedidasSeguridad medidasSeguridad;
	private List<HijoDeclarado> hijos;
	private TipoCobertura tipoCobertura;
	private SolicitudPoliza solicitudPoliza;
	private ValoresPorcentualesPoliza valoresPorcentualesPoliza;
	private Cliente cliente;
	

	public Poliza(String nroPoliza, String vigenciaDesde, String vigenciaHasta, String domicilioRiesgo,
			EstadoPoliza estadoPoliza, float prima, float montoTotal, float descuentoUnidad, String patente,
			String motor, String chasis, int kmAnio, int anio, float premio, List<Cuota> cuotas, Anio anioModelo,
			MedidasSeguridad medidasSeguridad, List<HijoDeclarado> hijos, TipoCobertura tipoCobertura,
			SolicitudPoliza solicitudPoliza, ValoresPorcentualesPoliza valoresPorcentualesPoliza, Cliente cliente) {
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
		this.anio = anio;
		this.premio = premio;
		this.cuotas = cuotas;
		this.anioModelo = anioModelo;
		this.medidasSeguridad = medidasSeguridad;
		this.hijos = hijos;
		this.tipoCobertura = tipoCobertura;
		this.solicitudPoliza = solicitudPoliza;
		this.valoresPorcentualesPoliza = valoresPorcentualesPoliza;
		this.cliente = cliente;
	}

	public String getNroPoliza() {
		return nroPoliza;
	}

	public void setNroPoliza(String nroPoliza) {
		this.nroPoliza = nroPoliza;
	}

	public String getVigenciaDesde() {
		return vigenciaDesde;
	}

	public void setVigenciaDesde(String vigenciaDesde) {
		this.vigenciaDesde = vigenciaDesde;
	}

	public String getVigenciaHasta() {
		return vigenciaHasta;
	}

	public void setVigenciaHasta(String vigenciaHasta) {
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

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
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
		return anioModelo;
	}

	public void setAnioModelo(Anio anioModelo) {
		this.anioModelo = anioModelo;
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

	public SolicitudPoliza getSolicitudPoliza() {
		return solicitudPoliza;
	}

	public void setSolicitudPoliza(SolicitudPoliza solicitudPoliza) {
		this.solicitudPoliza = solicitudPoliza;
	}

	public ValoresPorcentualesPoliza getValoresPorcentualesPoliza() {
		return valoresPorcentualesPoliza;
	}

	public void setValoresPorcentualesPoliza(ValoresPorcentualesPoliza valoresPorcentualesPoliza) {
		this.valoresPorcentualesPoliza = valoresPorcentualesPoliza;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}
