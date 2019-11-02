package DTO;

import java.util.Date;

import Enumerados.*;

public class HijoDTO {
	
	private Date fechaNacimiento;
	private Sexo sexo;
	private EstadoCivil estadoCivil;

	public HijoDTO(Date fechaNacimiento, Sexo sexo, EstadoCivil estadoCivil) {
		super();
		this.fechaNacimiento = fechaNacimiento;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
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

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	

}
