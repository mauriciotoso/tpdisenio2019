package Entidades;

import java.util.Date;
import java.util.List;

import Enumerados.*;
import javax.persistence.*;

@Entity
public class Cliente {
	
	@Id
	private String nroCliente;
	private Date fechaNacimiento;
	private String nombre;
	private String apellido;
	private TipoDocumento tipoDocumento;
	private String nroDocumento;
	private String nroCuil;
	private Sexo sexo;
	private CondicionIVA condicionIVA;
	private String correoElectronico;
	private EstadoCivil estadoCivil;
	private String profesion; 
	private String anioRegistro;
	private EstadoCliente etadoCliente;
	private int nroSiniestros;
	private Direccion direccion;
	private List<Poliza> polizas;
	
	public Cliente(String nroCliente, Date fechaNacimiento, String nombre, String apellido, TipoDocumento tipoDocumento,
			String nroDocumento, String nroCuil, Sexo sexo, CondicionIVA condicionIVA, String correoElectronico,
			EstadoCivil estadoCivil, String profesion, String anioRegistro, EstadoCliente etadoCliente,
			int nroSiniestros, Direccion direccion, List<Poliza> polizas) {
		super();
		this.nroCliente = nroCliente;
		this.fechaNacimiento = fechaNacimiento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipoDocumento = tipoDocumento;
		this.nroDocumento = nroDocumento;
		this.nroCuil = nroCuil;
		this.sexo = sexo;
		this.condicionIVA = condicionIVA;
		this.correoElectronico = correoElectronico;
		this.estadoCivil = estadoCivil;
		this.profesion = profesion;
		this.anioRegistro = anioRegistro;
		this.etadoCliente = etadoCliente;
		this.nroSiniestros = nroSiniestros;
		this.direccion = direccion;
		this.polizas = polizas;
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

	public CondicionIVA getCondicionIVA() {
		return condicionIVA;
	}

	public void setCondicionIVA(CondicionIVA condicionIVA) {
		this.condicionIVA = condicionIVA;
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

	public EstadoCliente getEtadoCliente() {
		return etadoCliente;
	}

	public void setEtadoCliente(EstadoCliente etadoCliente) {
		this.etadoCliente = etadoCliente;
	}

	public int getNroSiniestros() {
		return nroSiniestros;
	}

	public void setNroSiniestros(int nroSiniestros) {
		this.nroSiniestros = nroSiniestros;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public List<Poliza> getPolizas() {
		return polizas;
	}

	public void setPolizas(List<Poliza> polizas) {
		this.polizas = polizas;
	}
	
	
	
}
