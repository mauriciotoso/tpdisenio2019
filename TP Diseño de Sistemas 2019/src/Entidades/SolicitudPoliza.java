package Entidades;

import java.util.List;
import javax.persistence.*;

@Entity
public class SolicitudPoliza {
	
	@Id
	private int idSolicitudPoliza;
	private int anio;
	private String patente;
	private String motor;
	private String chasis;
	private int kmAnio;
	@OneToOne
	@JoinColumn(name = "medidasseguridad")
	private MedidasSeguridad medidasSeguridad;
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "solicitudpoliza")
	private List<HijoDeclarado> hijos;
	@ManyToOne
	@JoinColumn(name = "tipocobertura")
	private TipoCobertura tipoCobertura;
	@OneToOne
	@JoinColumn(name = "polizamensual")
	private PolizaMensual polizaMensual;
	@OneToOne
	@JoinColumn(name = "polizasemestral")
	private PolizaSemestral polizaSemestral;
	
	public SolicitudPoliza(int idSolicituPoliza, int anio, String patente, String motor, String chasis, int kmAnio,
			MedidasSeguridad medidasSeguridad, List<HijoDeclarado> hijos, TipoCobertura tipoCobertura,
			PolizaMensual polizaMensual, PolizaSemestral polizaSemestral) {
		super();
		this.idSolicitudPoliza = idSolicituPoliza;
		this.anio = anio;
		this.patente = patente;
		this.motor = motor;
		this.chasis = chasis;
		this.kmAnio = kmAnio;
		this.medidasSeguridad = medidasSeguridad;
		this.hijos = hijos;
		this.tipoCobertura = tipoCobertura;
		this.polizaMensual = polizaMensual;
		this.polizaSemestral = polizaSemestral;
	}
	
	public SolicitudPoliza() {
		
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



	public int getIdSolicituPoliza() {
		return idSolicitudPoliza;
	}

	public void setIdSolicituPoliza(int idSolicituPoliza) {
		this.idSolicitudPoliza = idSolicituPoliza;
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

	public PolizaMensual getPolizaMensual() {
		return polizaMensual;
	}

	public void setPolizaMensual(PolizaMensual polizaMensual) {
		this.polizaMensual = polizaMensual;
	}

	public PolizaSemestral getPolizaSemestral() {
		return polizaSemestral;
	}

	public void setPolizaSemestral(PolizaSemestral polizaSemestral) {
		this.polizaSemestral = polizaSemestral;
	}
	
}
