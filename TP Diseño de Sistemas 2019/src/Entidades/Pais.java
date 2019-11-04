package Entidades;

public class Pais {
	
	private int idPais;
	private String nombre;
	
	public Pais(int idPais, String nombre) {
		super();
		this.idPais = idPais;
		this.nombre = nombre;
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
