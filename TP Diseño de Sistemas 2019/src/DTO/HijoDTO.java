package DTO;

import java.util.Date;

import Enumerados.*;

public class HijoDTO {
	
	private String fechaNacimiento;
	private Sexo sexo;
	private EstadoCivil estadoCivil;

	public HijoDTO(String fechaNacimiento, Sexo sexo, EstadoCivil estadoCivil) {
		super();
		this.fechaNacimiento = fechaNacimiento;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
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
