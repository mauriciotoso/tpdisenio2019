package Entidades;

public class Modelo {
	
	private int idModelo;
	private String nombre;
	private Marca marca;

	public Modelo(int idModelo, String nombre, Marca marca) {
		super();
		this.idModelo = idModelo;
		this.nombre = nombre;
		this.marca = marca;
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
