package Entidades;
import javax.persistence.*;

@Entity

public class Localidad {
	
	@Id
	private int idLocalidad;
	private String nombre;
	private float valorPorcentualLocalidad;
	private Provincia provincia;

	public Localidad(int idLocalidad, String nombre, float valorPorcentualLocalidad, Provincia provincia) {
		super();
		this.idLocalidad = idLocalidad;
		this.nombre = nombre;
		this.valorPorcentualLocalidad = valorPorcentualLocalidad;
		this.provincia = provincia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getValorPorcentualLocalidad() {
		return valorPorcentualLocalidad;
	}

	public void setValorPorcentualLocalidad(float valorPorcentualLocalidad) {
		this.valorPorcentualLocalidad = valorPorcentualLocalidad;
	}

	public int getIdLocalidad() {
		return idLocalidad;
	}

	public void setIdLocalidad(int idLocalidad) {
		this.idLocalidad = idLocalidad;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}
	
	
}
