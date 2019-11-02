package DTO;

import java.util.Date;
import Enumerados.*;

public class ClienteDTO {
	
	private String nroCliente;
	private Date fechaNacimiento;
	private String nombre;
	private String apellido;
	private TipoDocumento tipoDocumento;
	private String nroDocumento;
	private String nroCuil;
	private Sexo sexo;
	private CondicionIVA condicionIva;
	private String correoElectronico;
	private EstadoCivil estadoCivil;
	private String profesion;
	private int anioRegistro;
	private EstadoCliente estadoCliente;
	private int nroSiniestros;
	
	
	public ClienteDTO(String nroCliente, Date fechaNacimiento, String nombre, String apellido,
			TipoDocumento tipoDocumento, String nroDocumento, String nroCuil, Sexo sexo, CondicionIVA condicionIva,
			String correoElectronico, EstadoCivil estadoCivil, String profesion, int anioRegistro,
			EstadoCliente estadoCliente, int nroSiniestros) {
		super();
		this.nroCliente = nroCliente;
		this.fechaNacimiento = fechaNacimiento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipoDocumento = tipoDocumento;
		this.nroDocumento = nroDocumento;
		this.nroCuil = nroCuil;
		this.sexo = sexo;
		this.condicionIva = condicionIva;
		this.correoElectronico = correoElectronico;
		this.estadoCivil = estadoCivil;
		this.profesion = profesion;
		this.anioRegistro = anioRegistro;
		this.estadoCliente = estadoCliente;
		this.nroSiniestros = nroSiniestros;
	}


	public String getNroCliente() {
		return nroCliente;
	}


	public void setNroCliente(String nroCliente) {
		this.nroCliente = nroCliente;
	}


	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}


	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}


	public String getNroDocumento() {
		return nroDocumento;
	}


	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}


	public String getNroCuil() {
		return nroCuil;
	}


	public void setNroCuil(String nroCuil) {
		this.nroCuil = nroCuil;
	}


	public Sexo getSexo() {
		return sexo;
	}


	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}


	public CondicionIVA getCondicionIva() {
		return condicionIva;
	}


	public void setCondicionIva(CondicionIVA condicionIva) {
		this.condicionIva = condicionIva;
	}


	public String getCorreoElectronico() {
		return correoElectronico;
	}


	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}


	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}


	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}


	public String getProfesion() {
		return profesion;
	}


	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}


	public int getAnioRegistro() {
		return anioRegistro;
	}


	public void setAnioRegistro(int anioRegistro) {
		this.anioRegistro = anioRegistro;
	}


	public EstadoCliente getEstadoCliente() {
		return estadoCliente;
	}


	public void setEstadoCliente(EstadoCliente estadoCliente) {
		this.estadoCliente = estadoCliente;
	}


	public int getNroSiniestros() {
		return nroSiniestros;
	}


	public void setNroSiniestros(int nroSiniestros) {
		this.nroSiniestros = nroSiniestros;
	}

	
}
