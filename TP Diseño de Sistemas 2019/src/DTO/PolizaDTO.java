package DTO;

import java.util.List;

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
	private int nroSiniestros;
	private String tipoCobertura;
	private String tipoPoliza;
	private String fechaInicio;
	private String fechaFin;
	private String formaPago;
	private float valorPorcentualCobertura;
	private int anio;
	private MedidasSeguridadDTO medidasSeguridad;
	private List<CuotaDTO> cuotas;
	private List<HijoDTO> hijos;
	private ClienteDTO cliente;
	private ValorPorcentualDTO valoresPorcentualesDTO;
	
	

	
	public PolizaDTO(String nroPoliza, String localidad, String provincia, String pais, String marca, String modelo,
			int anioModelo, String motor, String chasis, String patente, int kmAnio, int nroSiniestros,
			String tipoCobertura, String tipoPoliza, String fechaInicio, String fechaFin, String formaPago,
			float valorPorcentualCobertura, int anio, MedidasSeguridadDTO medidasSeguridad, List<CuotaDTO> cuotas,
			List<HijoDTO> hijos, ClienteDTO cliente, ValorPorcentualDTO valoresPorcentualesDTO) {
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

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
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
