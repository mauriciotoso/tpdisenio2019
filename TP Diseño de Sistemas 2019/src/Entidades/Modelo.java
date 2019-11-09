package Entidades;

import javax.persistence.*;

@Entity
public class Modelo {
	
	@Id
	@Column(name="idmodelo")
	private int idModelo;
	@Column(name="modelo")
	private String nombre;
	@ManyToOne
	@JoinColumn(name="idmarca")
	private Marca marca;

	public Modelo(int idModelo, String nombre, Marca marca) {
		super();
		this.idModelo = idModelo;
		this.nombre = nombre;
		this.marca = marca;
	}
	
	
	
	@Override
	public String toString() {
		return "Modelo [idModelo=" + idModelo + ", nombre=" + nombre + "]";
	}



	public Modelo() {
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdModelo() {
		return idModelo;
	}

	public void setIdModelo(int idModelo) {
		this.idModelo = idModelo;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
}
