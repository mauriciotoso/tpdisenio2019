package DTO;

import Entidades.Direccion;

public class DireccionDTO {
	private String calle;
	private String numero;
	private String piso;
	private String departamento;
	private String codigoPostal;
	private String localidad;
	private String provincia;
	private String pais;
	
	public DireccionDTO(String calle, String numero, String piso, String departamento, String codigoPostal,
			String localidad, String provincia, String pais) {
		super();
		this.calle = calle;
		this.numero = numero;
		this.piso = piso;
		this.departamento = departamento;
		this.codigoPostal = codigoPostal;
		this.localidad = localidad;
		this.provincia = provincia;
		this.pais = pais;
	}
	
	public DireccionDTO(Direccion d) {
		this.calle = d.getCalle();
		this.numero = d.getNumero();
		this.piso = d.getPiso();
		this.departamento = d.getDepartamento();
		this.codigoPostal = d.getCodigoPostal();
		this.localidad = d.getLocalidad().getNombre();
		this.provincia = d.getLocalidad().getProvincia().getNombre();
		this.pais = d.getLocalidad().getProvincia().getPais().getNombre();	
	}

	public String mostrarDomicilio () {
		String dom = this.calle+" "+this.numero+", "+this.localidad+", "+this.provincia;
		
		return dom;
	}
	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getPiso() {
		return piso;
	}

	public void setPiso(String piso) {
		this.piso = piso;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
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
	

}
