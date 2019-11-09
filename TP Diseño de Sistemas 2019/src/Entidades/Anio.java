package Entidades;

import javax.persistence.*;

@Entity
public class Anio {
	
	@Id
	@Column(name="idanio")
	private int idAnio;
	@Column(name="anio")
	private int anio;
	@Column(name="valorporcentualmodelo")
	private float valorPorcentualModelo;
	@ManyToOne
	@JoinColumn(name="idmodelo")
	private Modelo idModelo;
	
	public Anio(int idAnio, int anio, float valorPorcentualModelo, Modelo modelo) {
		super();
		this.idAnio = idAnio;
		this.anio = anio;
		this.valorPorcentualModelo = valorPorcentualModelo;
		this.idModelo = modelo;
	}

	public Anio() {
		
	}
	
	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	@Override
	public String toString() {
		return "Anio [idAnio=" + idAnio + ", anio=" + anio + ", valorPorcentualModelo=" + valorPorcentualModelo + "]";
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
		return idModelo;
	}
	
	public void setModelo(Modelo modelo) {
		this.idModelo = modelo;
	}
}
