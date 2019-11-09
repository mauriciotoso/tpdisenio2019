package Entidades;
import javax.persistence.*;

@Entity
@Table (name="valorporcentual")
public class ValoresPorcentualesPoliza {

	@Id
	@SequenceGenerator(name="seq-gen",sequenceName="sec_idvp", initialValue=1, allocationSize=1)
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq-gen")
	@Column (name="idvalorporcentual")
	private int idValoresPorcentualesPoliza;
	private float valorPorcentualKmAnio;
	private float valorPorcentualGarage;
	private float valorPorcentualAlarma;
	private float valorPorcentualRastreoVehicular;
	private float valorPorcentualTuercasAntirrobo;
	private float valorPorcentualSinSiniestro;
	private float valorPorcentualUnSiniestro;
	private float valorPorcentualDosSiniestro;
	private float valorPorcentualTresSiniestro;
	private float valorPorcentualHijo;
	private float valorPorcentualModelo;
	@Column (name="valorporcentualdomicilioderiesgo")
	private float valorPorcentualLocalidad;
	@Column (name="valorporcentualcobertura")
	private float valorPorcentualTipoCobertura;
	@Column (name="valorporcentualseguridad")
	private float valorPorcentualMedidasSeguridad;
	private float derechoEmision;
	
	public ValoresPorcentualesPoliza(int idValoresPorcentualesPoliza, float valorPorcentualKmAnio,
			float valorPorcentualGarage, float valorPorcentualAlarma, float valorPorcentualRastreoVeicular,
			float valorPorcentualTuercasAntirrobo, float valorPorcentualSinSiniestro, float valorPorcentualUnSiniestro,
			float valorPorcentualDosSiniestro, float valorPorcentualTresSiniestro, float valorPorcentualHijo,
			float valorPorcentualModelo, float valorPorcentualLocalidad, float valorPorcentualTipoCobertura,
			float valorPorcentualMedidasSeguridad, float derechoEmision) {
		super();
		this.idValoresPorcentualesPoliza = idValoresPorcentualesPoliza;
		this.valorPorcentualKmAnio = valorPorcentualKmAnio;
		this.valorPorcentualGarage = valorPorcentualGarage;
		this.valorPorcentualAlarma = valorPorcentualAlarma;
		this.valorPorcentualRastreoVehicular = valorPorcentualRastreoVeicular;
		this.valorPorcentualTuercasAntirrobo = valorPorcentualTuercasAntirrobo;
		this.valorPorcentualSinSiniestro = valorPorcentualSinSiniestro;
		this.valorPorcentualUnSiniestro = valorPorcentualUnSiniestro;
		this.valorPorcentualDosSiniestro = valorPorcentualDosSiniestro;
		this.valorPorcentualTresSiniestro = valorPorcentualTresSiniestro;
		this.valorPorcentualHijo = valorPorcentualHijo;
		this.valorPorcentualModelo = valorPorcentualModelo;
		this.valorPorcentualLocalidad = valorPorcentualLocalidad;
		this.valorPorcentualTipoCobertura = valorPorcentualTipoCobertura;
		this.valorPorcentualMedidasSeguridad = valorPorcentualMedidasSeguridad;
		this.derechoEmision = derechoEmision;
	}
	
	public ValoresPorcentualesPoliza(float valorPorcentualKmAnio,
			float valorPorcentualGarage, float valorPorcentualAlarma, float valorPorcentualRastreoVeicular,
			float valorPorcentualTuercasAntirrobo, float valorPorcentualSinSiniestro, float valorPorcentualUnSiniestro,
			float valorPorcentualDosSiniestro, float valorPorcentualTresSiniestro, float valorPorcentualHijo,
			float valorPorcentualModelo, float valorPorcentualLocalidad, float valorPorcentualTipoCobertura,
			float valorPorcentualMedidasSeguridad, float derechoEmision) {
		this.valorPorcentualKmAnio = valorPorcentualKmAnio;
		this.valorPorcentualGarage = valorPorcentualGarage;
		this.valorPorcentualAlarma = valorPorcentualAlarma;
		this.valorPorcentualRastreoVehicular = valorPorcentualRastreoVeicular;
		this.valorPorcentualTuercasAntirrobo = valorPorcentualTuercasAntirrobo;
		this.valorPorcentualSinSiniestro = valorPorcentualSinSiniestro;
		this.valorPorcentualUnSiniestro = valorPorcentualUnSiniestro;
		this.valorPorcentualDosSiniestro = valorPorcentualDosSiniestro;
		this.valorPorcentualTresSiniestro = valorPorcentualTresSiniestro;
		this.valorPorcentualHijo = valorPorcentualHijo;
		this.valorPorcentualModelo = valorPorcentualModelo;
		this.valorPorcentualLocalidad = valorPorcentualLocalidad;
		this.valorPorcentualTipoCobertura = valorPorcentualTipoCobertura;
		this.valorPorcentualMedidasSeguridad = valorPorcentualMedidasSeguridad;
		this.derechoEmision = derechoEmision;
	}
	
	public ValoresPorcentualesPoliza(ValoresPorcentualesActuales vpa, Anio anio, Localidad localidad, TipoCobertura tc, MedidasSeguridad ms) {
		
		this.valorPorcentualKmAnio = vpa.getValorPorcentualKmAnioActual();
		this.valorPorcentualGarage = vpa.getValorPorcentualGarageActual();
		this.valorPorcentualAlarma = vpa.getValorPorcentualAlarmaActual();
		this.valorPorcentualRastreoVehicular = vpa.getValorPorcentualRastreoVehicularActual();
		this.valorPorcentualTuercasAntirrobo = vpa.getValorPorcentualTuercasAntirroboActual();
		this.valorPorcentualSinSiniestro = vpa.getValorPorcentualSinSiniestroActual();
		this.valorPorcentualUnSiniestro = vpa.getValorPorcentualUnSiniestroActual();
		this.valorPorcentualDosSiniestro = vpa.getValorPorcentualDosSiniestroActual();
		this.valorPorcentualTresSiniestro = vpa.getValorPorcentualTresSiniestroActual();
		this.valorPorcentualHijo = vpa.getValorPorcentualHijoActual();
		this.valorPorcentualModelo = anio.getValorPorcentualModelo();
		this.valorPorcentualLocalidad = localidad.getValorPorcentualLocalidad();
		this.valorPorcentualTipoCobertura = tc.getValorPorcentualCobertura();
		this.valorPorcentualMedidasSeguridad = ms.getIdMedidasSeguridad();
		this.derechoEmision = vpa.getDerechoEmision();
	
	}
	
	@Override
	public String toString() {
		return "ValoresPorcentualesPoliza [idValoresPorcentualesPoliza=" + idValoresPorcentualesPoliza
				+ ", valorPorcentualKmAnio=" + valorPorcentualKmAnio + ", valorPorcentualGarage="
				+ valorPorcentualGarage + ", valorPorcentualAlarma=" + valorPorcentualAlarma
				+ ", valorPorcentualRastreoVehicular=" + valorPorcentualRastreoVehicular
				+ ", valorPorcentualTuercasAntirrobo=" + valorPorcentualTuercasAntirrobo
				+ ", valorPorcentualSinSiniestro=" + valorPorcentualSinSiniestro + ", valorPorcentualUnSiniestro="
				+ valorPorcentualUnSiniestro + ", valorPorcentualDosSiniestro=" + valorPorcentualDosSiniestro
				+ ", valorPorcentualTresSiniestro=" + valorPorcentualTresSiniestro + ", valorPorcentualHijo="
				+ valorPorcentualHijo + ", valorPorcentualModelo=" + valorPorcentualModelo
				+ ", valorPorcentualLocalidad=" + valorPorcentualLocalidad + ", valorPorcentualTipoCobertura="
				+ valorPorcentualTipoCobertura + ", valorPorcentualMedidasSeguridad=" + valorPorcentualMedidasSeguridad
				+ ", derechoEmision=" + derechoEmision + "]";
	}

	public ValoresPorcentualesPoliza() {
		
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
		return valorPorcentualRastreoVehicular;
	}

	public void setValorPorcentualRastreoVeicular(float valorPorcentualRastreoVeicular) {
		this.valorPorcentualRastreoVehicular = valorPorcentualRastreoVeicular;
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

	public int getIdValoresPorcentualesPoliza() {
		return idValoresPorcentualesPoliza;
	}

	public void setIdValoresPorcentualesPoliza(int idValoresPorcentualesPoliza) {
		this.idValoresPorcentualesPoliza = idValoresPorcentualesPoliza;
	}

	public float getValorPorcentualModelo() {
		return valorPorcentualModelo;
	}

	public void setValorPorcentualModelo(float valorPorcentualModelo) {
		this.valorPorcentualModelo = valorPorcentualModelo;
	}

	public float getValorPorcentualLocalidad() {
		return valorPorcentualLocalidad;
	}

	public void setValorPorcentualLocalidad(float valorPorcentualLocalidad) {
		this.valorPorcentualLocalidad = valorPorcentualLocalidad;
	}

	public float getValorPorcentualTipoCobertura() {
		return valorPorcentualTipoCobertura;
	}

	public void setValorPorcentualTipoCobertura(float valorPorcentualTipoCobertura) {
		this.valorPorcentualTipoCobertura = valorPorcentualTipoCobertura;
	}

	public float getValorPorcentualMedidasSeguridad() {
		return valorPorcentualMedidasSeguridad;
	}

	public void setValorPorcentualMedidasSeguridad(float valorPorcentualMedidasSeguridad) {
		this.valorPorcentualMedidasSeguridad = valorPorcentualMedidasSeguridad;
	}
}
