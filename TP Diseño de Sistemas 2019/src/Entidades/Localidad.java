package Entidades;

public class Localidad {
	
	private String nombre;
	private float valorPorcentualLocalidad;
	
	public Localidad(String nombre, float valorPorcentualLocalidad) {
		super();//AASD
		this.nombre = nombre;
		this.valorPorcentualLocalidad = valorPorcentualLocalidad;
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
	
	
}
