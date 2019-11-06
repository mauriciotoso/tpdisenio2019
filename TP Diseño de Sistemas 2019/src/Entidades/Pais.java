package Entidades;

import javax.persistence.*;

@Entity
public class Pais {
	
	@Id
	private int idPais;
	@Column (name="pais")
	private String nombre;
	
	public Pais(int idPais, String nombre) {
		super();
		this.idPais = idPais;
		this.nombre = nombre;
	}
	
	public Pais() {
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdPais() {
		return idPais;
	}

	public void setIdPais(int idPais) {
		this.idPais = idPais;
	}
	
	
}
