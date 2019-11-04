package Entidades;

public class Anio {
	
	private int idAnio;
	private int anio;
	private float valorPorcentualModelo;
	private Modelo modelo;
	
	public Anio(int idAnio, int anio, float valorPorcentualModelo, Modelo modelo) {
		super();
		this.idAnio = idAnio;
		this.anio = anio;
		this.valorPorcentualModelo = valorPorcentualModelo;
		this.modelo = modelo;
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

	public int getIdAnio() {
		return idAnio;
	}

	public void setIdAnio(int idAnio) {
		this.idAnio = idAnio;
	}

	public Modelo getModelo() {
		return modelo;
	}
	
	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
}
