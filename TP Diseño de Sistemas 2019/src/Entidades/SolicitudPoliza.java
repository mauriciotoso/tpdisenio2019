package Entidades;

import java.util.Date;
import java.util.List;

public class SolicitudPoliza {
	
	private int idSolicituPoliza;
	private int anio;
	private String patente;
	private String motor;
	private String chasis;
	private int kmAnio;
	private int nroSiniestros;
	private Date vigenciaDesde;
	private Date vigenciaHasta;
	private MedidasSeguridad medidasSeguridad;
	private List<HijoDeclarado> hijos;
	private TipoCobertura tipoCobertura;
	private Poliza poliza;
	
	public SolicitudPoliza(int idSolicituPoliza, int anio, String patente, String motor, String chasis, int kmAnio,
			int nroSiniestros, Date vigenciaDesde, Date vigenciaHasta, MedidasSeguridad medidasSeguridad,
			List<HijoDeclarado> hijos, TipoCobertura tipoCobertura, Poliza poliza) {
		super();
		this.idSolicituPoliza = idSolicituPoliza;
		this.anio = anio;
		this.patente = patente;
		this.motor = motor;
		this.chasis = chasis;
		this.kmAnio = kmAnio;
		this.nroSiniestros = nroSiniestros;
		this.vigenciaDesde = vigenciaDesde;
		this.vigenciaHasta = vigenciaHasta;
		this.medidasSeguridad = medidasSeguridad;
		this.hijos = hijos;
		this.tipoCobertura = tipoCobertura;
		this.poliza = poliza;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
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

	public int getNroSiniestros() {
		return nroSiniestros;
	}

	public void setNroSiniestros(int nroSiniestros) {
		this.nroSiniestros = nroSiniestros;
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

	public int getIdSolicituPoliza() {
		return idSolicituPoliza;
	}

	public void setIdSolicituPoliza(int idSolicituPoliza) {
		this.idSolicituPoliza = idSolicituPoliza;
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

	public Poliza getPoliza() {
		return poliza;
	}

	public void setPoliza(Poliza poliza) {
		this.poliza = poliza;
	}
	
}
