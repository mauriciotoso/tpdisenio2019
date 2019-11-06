package Entidades;
import javax.persistence.*;

@Entity

public class Localidad {
	
	@Id
	private int idLocalidad;
	@Column(name = "localidad")
	private String nombre;
	private float valorPorcentualLocalidad;
	@ManyToOne
	@JoinColumn(name = "idprovincia")
	private Provincia provincia;

	public Localidad(int idLocalidad, String nombre, float valorPorcentualLocalidad, Provincia provincia) {
		super();
		this.idLocalidad = idLocalidad;
		this.nombre = nombre;
		this.valorPorcentualLocalidad = valorPorcentualLocalidad;
		this.provincia = provincia;
	}
	
	public Localidad() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Localidad [idLocalidad=" + idLocalidad + ", nombre=" + nombre + ", valorPorcentualLocalidad="
				+ valorPorcentualLocalidad + ", provincia=" + provincia + "]";
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
