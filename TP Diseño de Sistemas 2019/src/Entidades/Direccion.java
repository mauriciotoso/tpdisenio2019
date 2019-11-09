package Entidades;

import javax.persistence.*;

@Entity
public class Direccion {
	
	@Id
	@SequenceGenerator(name="seq-gen",sequenceName="sec_iddireccion", initialValue=1, allocationSize=1)
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq-gen")
	private int idDireccion;
	private String calle;
	private String numero;
	private String piso;
	@Column (name="nrodepto")
	private String departamento;
	private String codigoPostal;
	@OneToOne
	@JoinColumn (name="idlocalidad")
	private Localidad localidad;


	public Direccion() {}
	
	public Direccion(int idDireccion, String calle, String numero, String piso, String departamento,
			String codigoPostal, Localidad localidad) {
		super();
		this.idDireccion = idDireccion;
		this.calle = calle;
		this.numero = numero;
		this.piso = piso;
		this.departamento = departamento;
		this.codigoPostal = codigoPostal;
		this.localidad = localidad;
	}


	public Direccion(String calle, String numero, String piso, String departamento,
			String codigoPostal, Localidad localidad) {
		this.calle = calle;
		this.numero = numero;
		this.piso = piso;
		this.departamento = departamento;
		this.codigoPostal = codigoPostal;
		this.localidad = localidad;
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

	public int getIdDireccion() {
		return idDireccion;
	}

	public void setIdDireccion(int idDireccion) {
		this.idDireccion = idDireccion;
	}

	public Localidad getLocalidad() {
		return localidad;
	}

	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}
	
	
	
}
