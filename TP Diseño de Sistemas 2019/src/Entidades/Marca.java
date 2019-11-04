package Entidades;

import javax.persistence.*;

@Entity
public class Marca {
	
	@Id
	private int idMarca;
	private String marca;
	
	
	public Marca(int idMarca, String marca) {
		super();
		this.idMarca = idMarca;
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(int idMarca) {
		this.idMarca = idMarca;
	}
}
