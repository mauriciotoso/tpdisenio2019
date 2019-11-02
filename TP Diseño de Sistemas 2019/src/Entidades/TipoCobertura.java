package Entidades;

public class TipoCobertura {
	
	private String nombre;
	private float valorPorcentualCobertura;
	public TipoCobertura(String nombre, float valorPorcentualCobertura) {
		super();
		this.nombre = nombre;
		this.valorPorcentualCobertura = valorPorcentualCobertura;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getValorPorcentualCobertura() {
		return valorPorcentualCobertura;
	}
	public void setValorPorcentualCobertura(float valorPorcentualCobertura) {
		this.valorPorcentualCobertura = valorPorcentualCobertura;
	}
	
	
}
