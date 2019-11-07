package Entidades;

import java.util.List;

import Enumerados.EstadoPoliza;

import javax.persistence.*;

@Entity
public class PolizaSemestral {
	@Id
	private String nroPoliza;
	private String vigenciaDesde;
	private String vigenciaHasta;
	private String domicilioRiesgo;
	@OneToOne
	@JoinColumn(name = "estadoPoliza")
	private EstadoPoliza estadoPoliza;
	private float prima;
	private float montoTotal;
	private float descuentoUnidad;
	private String patente;
	private String motor;
	private String chasis;
	@Column (name="kmsPorAnio")
	private int kmAnio;
	private int anio;
	private float premio;
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "polizasemestral")
	private List<Cuota> cuotas;
	@OneToOne
	@JoinColumn (name="aniomodelo")
	private Anio idAnio;
	@OneToOne
	@JoinColumn (name="medidasseguridad")
	private MedidasSeguridad medidasSeguridad;
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "polizasemestral")
	
	
	
	private List<HijoDeclarado> hijos;
	@ManyToOne
	@JoinColumn (name="tipocobertura")
	private TipoCobertura tipoCobertura;

	@OneToOne
	@JoinColumn (name="valoresporcentualespoliza")
	private ValoresPorcentualesPoliza valoresPorcentualesPoliza;
	@ManyToOne
	@JoinColumn (name="cliente")
	private Cliente nroCliente;
	private float bonificacion; 
	
	
	
	public PolizaSemestral(String nroPoliza, String vigenciaDesde, String vigenciaHasta, String domicilioRiesgo,
			EstadoPoliza estadoPoliza, float prima, float montoTotal, float descuentoUnidad, String patente,
			String motor, String chasis, int kmAnio, int anio, float premio, List<Cuota> cuotas, Anio idAnio,
			MedidasSeguridad medidasSeguridad, List<HijoDeclarado> hijos, TipoCobertura tipoCobertura,
			ValoresPorcentualesPoliza valoresPorcentualesPoliza, Cliente nroCliente, float bonificacion) {
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
		this.idAnio = idAnio;
		this.medidasSeguridad = medidasSeguridad;
		this.hijos = hijos;
		this.tipoCobertura = tipoCobertura;
		this.valoresPorcentualesPoliza = valoresPorcentualesPoliza;
		this.nroCliente = nroCliente;
		this.bonificacion = bonificacion;
	}
	
	public PolizaSemestral(String vigenciaDesde, String vigenciaHasta, Localidad localidad,
			EstadoPoliza estadoPoliza, float montoTotal, String patente,
			String motor, String chasis, int kmAnio, int anio, List<Cuota> cuotas, Anio idAnio,
			MedidasSeguridad medidasSeguridad, List<HijoDeclarado> hijos, TipoCobertura tipoCobertura,
			ValoresPorcentualesPoliza valoresPorcentualesPoliza, Cliente nroCliente) {
		super();
		this.nroPoliza = this.generarNroPoliza();
		this.vigenciaDesde = vigenciaDesde;
		this.vigenciaHasta = vigenciaHasta;
		this.domicilioRiesgo = this.generarDomicilio(localidad);
		this.estadoPoliza = estadoPoliza;
		this.montoTotal = montoTotal;
		this.patente = patente;
		this.motor = motor;
		this.chasis = chasis;
		this.kmAnio = kmAnio;
		this.anio = anio;
		this.cuotas = cuotas;
		this.idAnio = idAnio;
		this.medidasSeguridad = medidasSeguridad;
		this.hijos = hijos;
		this.tipoCobertura = tipoCobertura;
		this.valoresPorcentualesPoliza = valoresPorcentualesPoliza;
		this.nroCliente = nroCliente;
	}
	
	public String generarNroPoliza() {
		
		double n = Math.random()*1002102124;
		return Double.toString(n);
	}
	
	public String generarDomicilio(Localidad localidad) {
		return localidad.getProvincia().getNombre()+" - "+localidad.getProvincia();
	}
	
	public PolizaSemestral() {
		
	}
	
	public float getBonificacion() {
		return bonificacion;
	}
	public void setBonificacion(float bonificacion) {
		this.bonificacion = bonificacion;
	}
	
	

	@Override
	public String toString() {
		return "PolizaSemestral [nroPoliza=" + nroPoliza + "]";
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
	
	

	
}
