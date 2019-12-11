package DTO;

import java.util.Date;

import Entidades.HijoDeclarado;
import Enumerados.*;

public class HijoDTO {
	
	private Date fechaNacimiento;
	private Sexo sexo;
	private EstadoCivil estadoCivil;

	public HijoDTO() {
		
	}
	
	public HijoDTO(Date fechaNacimiento, Sexo sexo, EstadoCivil estadoCivil) {
		super();
		this.fechaNacimiento = fechaNacimiento;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
	}
	
	public HijoDTO(HijoDeclarado h) {
		this.fechaNacimiento = h.getFechaNacimiento();
		this.sexo = h.getSexo();
		this.estadoCivil = h.getEtadoCivil();
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

	@Override
	public String toString() {
		return "HijoDTO [fechaNacimiento=" + fechaNacimiento + ", sexo=" + sexo + ", estadoCivil=" + estadoCivil + "]";
	}
	

}
