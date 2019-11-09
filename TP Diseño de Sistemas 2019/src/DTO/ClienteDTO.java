package DTO;

import java.util.Date;

import Entidades.Cliente;
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
	private String anioRegistro;
	private EstadoCliente estadoCliente;
	private DireccionDTO direccionDTO;
	
	public ClienteDTO(String nroCliente,Date fechaNacimiento, String nombre, String apellido,
			TipoDocumento tipoDocumento, String nroDocumento, String nroCuil, Sexo sexo, CondicionIVA condicionIva,
			String correoElectronico, EstadoCivil estadoCivil, String profesion, String anioRegistro,
			EstadoCliente estadoCliente, DireccionDTO direccionDTO) {
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
		this.direccionDTO = direccionDTO;
	}

	public ClienteDTO(Cliente c) {
		this.nroCliente = c.getNroCliente();
		this.fechaNacimiento = c.getFechaNacimiento();
		this.nombre = c.getNombre();
		this.apellido = c.getApellido();
		this.tipoDocumento = c.getTipoDocumento();
		this.nroDocumento = c.getNroDocumento();
		this.nroCuil = c.getNroCuil();
		this.sexo = c.getSexo();
		this.condicionIva = c.getCondicionIVA();
		this.correoElectronico = c.getCorreoElectronico();
		this.estadoCivil = c.getEstadoCivil();
		this.profesion = c.getProfesion();
		this.anioRegistro = c.getAnioRegistro();
		this.estadoCliente = c.getEtadoCliente();
		this.direccionDTO = new DireccionDTO(c.getDireccion());
	}

	@Override
	public String toString() {
		return "ClienteDTO [nroCliente=" + nroCliente + ", fechaNacimiento=" + fechaNacimiento + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", tipoDocumento=" + tipoDocumento + ", nroDocumento=" + nroDocumento
				+ ", nroCuil=" + nroCuil + ", sexo=" + sexo + ", condicionIva=" + condicionIva + ", correoElectronico="
				+ correoElectronico + ", estadoCivil=" + estadoCivil + ", profesion=" + profesion + ", anioRegistro="
				+ anioRegistro + ", estadoCliente=" + estadoCliente + ", direccionDTO=" + direccionDTO + "]";
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

	public String getAnioRegistro() {
		return anioRegistro;
	}

	public void setAnioRegistro(String anioRegistro) {
		this.anioRegistro = anioRegistro;
	}

	public EstadoCliente getEstadoCliente() {
		return estadoCliente;
	}

	public void setEstadoCliente(EstadoCliente estadoCliente) {
		this.estadoCliente = estadoCliente;
	}

	public DireccionDTO getDireccionDTO() {
		return direccionDTO;
	}

	public void setDireccionDTO(DireccionDTO direccionDTO) {
		this.direccionDTO = direccionDTO;
	}

	
}
