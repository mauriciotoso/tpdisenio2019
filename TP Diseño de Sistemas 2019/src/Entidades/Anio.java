package Entidades;

public class Anio {
	
	private int anio;
	private float valorPorcentualModelo;
	
	public Anio(int anio, float valorPorcentualModelo) {
		super();
		this.anio = anio;
		this.valorPorcentualModelo = valorPorcentualModelo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public float getValorPorcentualModelo() {
		return valorPorcentualModelo;
	}

	public void setValorPorcentualModelo(float valorPorcentualModelo) {
		this.valorPorcentualModelo = valorPorcentualModelo;
	}
	
	
}
