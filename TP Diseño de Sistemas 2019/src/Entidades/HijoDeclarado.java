package Entidades;

import Enumerados.EstadoCivil;
import Enumerados.Sexo;
import javax.persistence.*;
import DTO.*;

@Entity
public class HijoDeclarado {
	
	@Id
	@Column (name="idhijo")
	@SequenceGenerator(name="seq-gen",sequenceName="sec_id", initialValue=2, allocationSize=1)
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq-gen")
	private int idHijoDeclarado;
	private String fechaNacimiento;
	private Sexo sexo;
	private EstadoCivil estadoCivil;

	public HijoDeclarado(int idHijoDeclarado2, String fechaNacimiento2, Sexo sexo, EstadoCivil estado) {
		this.idHijoDeclarado = idHijoDeclarado2;
		this.fechaNacimiento = fechaNacimiento2;
		this.sexo = sexo;
		this.estadoCivil = estado;
	}
	
	public HijoDeclarado() {
		
	}

	
	public HijoDeclarado(HijoDTO hijoDTO) {
		this.fechaNacimiento = hijoDTO.getFechaNacimiento();
		this.sexo = hijoDTO.getSexo();
		this.estadoCivil = hijoDTO.getEstadoCivil();	
	}

	
	
	@Override
	public String toString() {
		return "HijoDeclarado [idHijoDeclarado=" + idHijoDeclarado + ", fechaNacimiento=" + fechaNacimiento + ", sexo="
				+ sexo + ", estadoCivil=" + estadoCivil + "]";
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

	public EstadoCivil getEtadoCivil() {
		return estadoCivil;
	}

	public void setEtadoCivil(EstadoCivil etadoCivil) {
		this.estadoCivil = etadoCivil;
	}

	public int getIdHijoDeclarado() {
		return idHijoDeclarado;
	}

	public void setIdHijoDeclarado(int idHijoDeclarado) {
		this.idHijoDeclarado = idHijoDeclarado;
	}
	
	
}
