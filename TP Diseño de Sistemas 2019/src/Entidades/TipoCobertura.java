package Entidades;
import javax.persistence.*;

@Entity
public class TipoCobertura {
	
	@Id
	private int idTipoCobertura;
	private String nombre;
	private String descripcion;
	
	public TipoCobertura(int idTipoCobertura, String nombre, String descripcion) {
		super();
		this.idTipoCobertura = idTipoCobertura;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getIdTipoCobertura() {
		return idTipoCobertura;
	}
	public void setIdTipoCobertura(int idTipoCobertura) {
		this.idTipoCobertura = idTipoCobertura;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}
