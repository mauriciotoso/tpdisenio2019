package Entidades;

import App.Usuario;
import javax.persistence.*;

@Entity
@Table (name="valorporcentualactual")
public class ValoresPorcentualesActuales {
	
	@Id
	private int idValorPorcentualActual;
	private float valorPorcentualKmAnioActual;
	private float valorPorcentualGarageActual;
	private float valorPorcentualAlarmaActual;
	private float valorPorcentualRastreoVehicularActual;
	private float valorPorcentualTuercasAntirroboActual;
	private float valorPorcentualSinSiniestroActual;
	private float valorPorcentualUnSiniestroActual;
	private float valorPorcentualDosSiniestroActual;
	private float valorPorcentualTresSiniestroActual;
	private float valorPorcentualHijoActual;
	private float derechoEmision;
	@OneToOne
	@JoinColumn (name="usuario")
	private Usuario usuario;
	
	public ValoresPorcentualesActuales(int idValorPorcentualActual, float valorPorcentualKmAnioActual,
			float valorPorcentualGarageActual, float valorPorcentualAlarmaActual,
			float valorPorcentualRastreoVehicularActual, float valorPorcentualTuercasAntirroboActual,
			float valorPorcentualSinSiniestroActual, float valorPorcentualUnSiniestroActual,
			float valorPorcentualDosSiniestroActual, float valorPorcentualTresSiniestroActual,
			float valorPorcentualHijoActual, float derechoEmision, Usuario usuario) {
		super();
		this.idValorPorcentualActual = idValorPorcentualActual;
		this.valorPorcentualKmAnioActual = valorPorcentualKmAnioActual;
		this.valorPorcentualGarageActual = valorPorcentualGarageActual;
		this.valorPorcentualAlarmaActual = valorPorcentualAlarmaActual;
		this.valorPorcentualRastreoVehicularActual = valorPorcentualRastreoVehicularActual;
		this.valorPorcentualTuercasAntirroboActual = valorPorcentualTuercasAntirroboActual;
		this.valorPorcentualSinSiniestroActual = valorPorcentualSinSiniestroActual;
		this.valorPorcentualUnSiniestroActual = valorPorcentualUnSiniestroActual;
		this.valorPorcentualDosSiniestroActual = valorPorcentualDosSiniestroActual;
		this.valorPorcentualTresSiniestroActual = valorPorcentualTresSiniestroActual;
		this.valorPorcentualHijoActual = valorPorcentualHijoActual;
		this.derechoEmision = derechoEmision;
		this.usuario = usuario;
	}

	public ValoresPorcentualesActuales() {
		
	}

	public int getIdValorPorcentualActual() {
		return idValorPorcentualActual;
	}



	public void setIdValorPorcentualActual(int idValorPorcentualActual) {
		this.idValorPorcentualActual = idValorPorcentualActual;
	}



	public float getValorPorcentualKmAnioActual() {
		return valorPorcentualKmAnioActual;
	}



	public void setValorPorcentualKmAnioActual(float valorPorcentualKmAnioActual) {
		this.valorPorcentualKmAnioActual = valorPorcentualKmAnioActual;
	}



	public float getValorPorcentualGarageActual() {
		return valorPorcentualGarageActual;
	}



	public void setValorPorcentualGarageActual(float valorPorcentualGarageActual) {
		this.valorPorcentualGarageActual = valorPorcentualGarageActual;
	}



	public float getValorPorcentualAlarmaActual() {
		return valorPorcentualAlarmaActual;
	}



	public void setValorPorcentualAlarmaActual(float valorPorcentualAlarmaActual) {
		this.valorPorcentualAlarmaActual = valorPorcentualAlarmaActual;
	}



	public float getValorPorcentualRastreoVehicularActual() {
		return valorPorcentualRastreoVehicularActual;
	}



	public void setValorPorcentualRastreoVehicularActual(float valorPorcentualRastreoVehicularActual) {
		this.valorPorcentualRastreoVehicularActual = valorPorcentualRastreoVehicularActual;
	}



	public float getValorPorcentualTuercasAntirroboActual() {
		return valorPorcentualTuercasAntirroboActual;
	}



	public void setValorPorcentualTuercasAntirroboActual(float valorPorcentualTuercasAntirroboActual) {
		this.valorPorcentualTuercasAntirroboActual = valorPorcentualTuercasAntirroboActual;
	}



	public float getValorPorcentualSinSiniestroActual() {
		return valorPorcentualSinSiniestroActual;
	}



	public void setValorPorcentualSinSiniestroActual(float valorPorcentualSinSiniestroActual) {
		this.valorPorcentualSinSiniestroActual = valorPorcentualSinSiniestroActual;
	}



	public float getValorPorcentualUnSiniestroActual() {
		return valorPorcentualUnSiniestroActual;
	}



	public void setValorPorcentualUnSiniestroActual(float valorPorcentualUnSiniestroActual) {
		this.valorPorcentualUnSiniestroActual = valorPorcentualUnSiniestroActual;
	}



	public float getValorPorcentualDosSiniestroActual() {
		return valorPorcentualDosSiniestroActual;
	}



	public void setValorPorcentualDosSiniestroActual(float valorPorcentualDosSiniestroActual) {
		this.valorPorcentualDosSiniestroActual = valorPorcentualDosSiniestroActual;
	}



	public float getValorPorcentualTresSiniestroActual() {
		return valorPorcentualTresSiniestroActual;
	}



	public void setValorPorcentualTresSiniestroActual(float valorPorcentualTresSiniestroActual) {
		this.valorPorcentualTresSiniestroActual = valorPorcentualTresSiniestroActual;
	}



	public float getValorPorcentualHijoActual() {
		return valorPorcentualHijoActual;
	}



	public void setValorPorcentualHijoActual(float valorPorcentualHijoActual) {
		this.valorPorcentualHijoActual = valorPorcentualHijoActual;
	}



	public float getDerechoEmision() {
		return derechoEmision;
	}



	public void setDerechoEmision(float derechoEmision) {
		this.derechoEmision = derechoEmision;
	}



	public Usuario getUsuario() {
		return usuario;
	}



	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	
}
