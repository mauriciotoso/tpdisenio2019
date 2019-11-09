package Entidades;

import java.util.List;
import javax.persistence.*;

@Entity
public class SolicitudPoliza {
	
	@Id
	@SequenceGenerator(name="seq-gen",sequenceName="sec_idsolicitud", initialValue=1, allocationSize=1)
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq-gen")
	private int idSolicitudPoliza;
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
	@JoinColumn(name = "nropoliza")
	private Poliza poliza;
	
	public SolicitudPoliza(int idSolicituPoliza, String patente, String motor, String chasis, int kmAnio,
			MedidasSeguridad medidasSeguridad, List<HijoDeclarado> hijos, TipoCobertura tipoCobertura,
			Poliza poliza) {
		super();
		this.idSolicitudPoliza = idSolicituPoliza;
		this.patente = patente;
		this.motor = motor;
		this.chasis = chasis;
		this.kmAnio = kmAnio;
		this.medidasSeguridad = medidasSeguridad;
		this.hijos = hijos;
		this.tipoCobertura = tipoCobertura;
		this.poliza = poliza;
	}
	
	public SolicitudPoliza(String patente, String motor, String chasis, int kmAnio,
			MedidasSeguridad medidasSeguridad, List<HijoDeclarado> hijos, TipoCobertura tipoCobertura,
			Poliza poliza) {
		super();
		this.patente = patente;
		this.motor = motor;
		this.chasis = chasis;
		this.kmAnio = kmAnio;
		this.medidasSeguridad = medidasSeguridad;
		this.hijos = hijos;
		this.tipoCobertura = tipoCobertura;
		this.poliza = poliza;
	}
	
	public SolicitudPoliza() {
		
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

	public int getIdSolicitudPoliza() {
		return idSolicitudPoliza;
	}

	public void setIdSolicitudPoliza(int idSolicitudPoliza) {
		this.idSolicitudPoliza = idSolicitudPoliza;
	}

	public Poliza getPoliza() {
		return poliza;
	}

	public void setPoliza(Poliza poliza) {
		this.poliza = poliza;
	}
	
	
}
