package DTO;

public class DireccionDTO {
	private String calle;
	private String numero;
	private String piso;
	private String departamento;
	private String codigoPostal;
	
	public DireccionDTO(String calle, String numero, String piso, String departamento, String codigoPostal) {
		super();
		this.calle = calle;
		this.numero = numero;
		this.piso = piso;
		this.departamento = departamento;
		this.codigoPostal = codigoPostal;
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
	
	

}
