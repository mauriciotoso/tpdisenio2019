package Entidades;

import App.Usuario;

public class ValoresPorcentualesActuales {
	
	private int idValoresPorcentualesActuales;
	private float valorPorcentualKmAnio;
	private float valorPorcentualGarage;
	private float valorPorcentualAlarma;
	private float valorPorcentualRastreoVeicular;
	private float valorPorcentualTuercasAntirrobo;
	private float valorPorcentualSinSiniestro;
	private float valorPorcentualUnSiniestro;
	private float valorPorcentualDosSiniestro;
	private float valorPorcentualTresSiniestro;
	private float valorPorcentualHijo;
	private float derechoEmision;
	private Usuario usuario;
	
	public ValoresPorcentualesActuales(int idValoresPorcentualesActuales, float valorPorcentualKmAnio,
			float valorPorcentualGarage, float valorPorcentualAlarma, float valorPorcentualRastreoVeicular,
			float valorPorcentualTuercasAntirrobo, float valorPorcentualSinSiniestro, float valorPorcentualUnSiniestro,
			float valorPorcentualDosSiniestro, float valorPorcentualTresSiniestro, float valorPorcentualHijo,
			float derechoEmision, Usuario usuario) {
		super();
		this.idValoresPorcentualesActuales = idValoresPorcentualesActuales;
		this.valorPorcentualKmAnio = valorPorcentualKmAnio;
		this.valorPorcentualGarage = valorPorcentualGarage;
		this.valorPorcentualAlarma = valorPorcentualAlarma;
		this.valorPorcentualRastreoVeicular = valorPorcentualRastreoVeicular;
		this.valorPorcentualTuercasAntirrobo = valorPorcentualTuercasAntirrobo;
		this.valorPorcentualSinSiniestro = valorPorcentualSinSiniestro;
		this.valorPorcentualUnSiniestro = valorPorcentualUnSiniestro;
		this.valorPorcentualDosSiniestro = valorPorcentualDosSiniestro;
		this.valorPorcentualTresSiniestro = valorPorcentualTresSiniestro;
		this.valorPorcentualHijo = valorPorcentualHijo;
		this.derechoEmision = derechoEmision;
		this.usuario = usuario;
	}

	public float getValorPorcentualKmAnio() {
		return valorPorcentualKmAnio;
	}

	public void setValorPorcentualKmAnio(float valorPorcentualKmAnio) {
		this.valorPorcentualKmAnio = valorPorcentualKmAnio;
	}

	public float getValorPorcentualGarage() {
		return valorPorcentualGarage;
	}

	public void setValorPorcentualGarage(float valorPorcentualGarage) {
		this.valorPorcentualGarage = valorPorcentualGarage;
	}

	public float getValorPorcentualAlarma() {
		return valorPorcentualAlarma;
	}

	public void setValorPorcentualAlarma(float valorPorcentualAlarma) {
		this.valorPorcentualAlarma = valorPorcentualAlarma;
	}

	public float getValorPorcentualRastreoVeicular() {
		return valorPorcentualRastreoVeicular;
	}

	public void setValorPorcentualRastreoVeicular(float valorPorcentualRastreoVeicular) {
		this.valorPorcentualRastreoVeicular = valorPorcentualRastreoVeicular;
	}

	public float getValorPorcentualTuercasAntirrobo() {
		return valorPorcentualTuercasAntirrobo;
	}

	public void setValorPorcentualTuercasAntirrobo(float valorPorcentualTuercasAntirrobo) {
		this.valorPorcentualTuercasAntirrobo = valorPorcentualTuercasAntirrobo;
	}

	public float getValorPorcentualSinSiniestro() {
		return valorPorcentualSinSiniestro;
	}

	public void setValorPorcentualSinSiniestro(float valorPorcentualSinSiniestro) {
		this.valorPorcentualSinSiniestro = valorPorcentualSinSiniestro;
	}

	public float getValorPorcentualUnSiniestro() {
		return valorPorcentualUnSiniestro;
	}

	public void setValorPorcentualUnSiniestro(float valorPorcentualUnSiniestro) {
		this.valorPorcentualUnSiniestro = valorPorcentualUnSiniestro;
	}

	public float getValorPorcentualDosSiniestro() {
		return valorPorcentualDosSiniestro;
	}

	public void setValorPorcentualDosSiniestro(float valorPorcentualDosSiniestro) {
		this.valorPorcentualDosSiniestro = valorPorcentualDosSiniestro;
	}

	public float getValorPorcentualTresSiniestro() {
		return valorPorcentualTresSiniestro;
	}

	public void setValorPorcentualTresSiniestro(float valorPorcentualTresSiniestro) {
		this.valorPorcentualTresSiniestro = valorPorcentualTresSiniestro;
	}

	public float getValorPorcentualHijo() {
		return valorPorcentualHijo;
	}

	public void setValorPorcentualHijo(float valorPorcentualHijo) {
		this.valorPorcentualHijo = valorPorcentualHijo;
	}

	public float getDerechoEmision() {
		return derechoEmision;
	}

	public void setDerechoEmision(float derechoEmision) {
		this.derechoEmision = derechoEmision;
	}

	public int getIdValoresPorcentualesActuales() {
		return idValoresPorcentualesActuales;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void setIdValoresPorcentualesActuales(int idValoresPorcentualesActuales) {
		this.idValoresPorcentualesActuales = idValoresPorcentualesActuales;
	}
}
