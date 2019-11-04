package Entidades;
import javax.persistence.*;

@Entity
public class Provincia {
	
	@Id
	private int idProvincia;
	private String nombre;
	private Pais pais;

	public Provincia(int idProvincia, String nombre, Pais pais) {
		super();
		this.idProvincia = idProvincia;
		this.nombre = nombre;
		this.pais = pais;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdProvincia() {
		return idProvincia;
	}

	public void setIdProvincia(int idProvincia) {
		this.idProvincia = idProvincia;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
}
