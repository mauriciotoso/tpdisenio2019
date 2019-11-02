package Entidades;

import java.util.Date;

import Enumerados.EstadoCivil;
import Enumerados.Sexo;

public class HijoDeclarado {

	private Date fechaNacimiento;
	private Sexo sexo;
	private EstadoCivil etadoCivil;
	
	public HijoDeclarado(Date fechaNacimiento, Sexo sexo, EstadoCivil etadoCivil) {
		super();
		this.fechaNacimiento = fechaNacimiento;
		this.sexo = sexo;
		this.etadoCivil = etadoCivil;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public EstadoCivil getEtadoCivil() {
		return etadoCivil;
	}

	public void setEtadoCivil(EstadoCivil etadoCivil) {
		this.etadoCivil = etadoCivil;
	}
	
	
}
