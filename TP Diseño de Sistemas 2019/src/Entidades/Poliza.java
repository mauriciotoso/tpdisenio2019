package Entidades;

import java.util.Date;

import Enumerados.EstadoPoliza;

public abstract class Poliza{

	private String nroPoliza;
	private Date vigenciaDesde;
	private Date vigenciaHasta;
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
	
	public Poliza(String nroPoliza, Date vigenciaDesde, Date vigenciaHasta, String domicilioRiesgo,
			EstadoPoliza estadoPoliza, float prima, float montoTotal, float descuentoUnidad, String patente,
			String motor, String chasis, int kmAnio, int anio, float premio) {
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
	
}
