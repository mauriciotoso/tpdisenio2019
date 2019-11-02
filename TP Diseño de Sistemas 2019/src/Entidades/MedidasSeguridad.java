package Entidades;

public class MedidasSeguridad {

	private boolean garage;
	private boolean alarma;
	private boolean rastreoVehicular;
	private boolean tuercaAntirrobo;
	private float valorPorcentualSeguridad;
	
	public MedidasSeguridad(boolean garage, boolean alarma, boolean rastreoVehicular, boolean tuercaAntirrobo,
			float valorPorcentualSeguridad) {
		super();
		this.garage = garage;
		this.alarma = alarma;
		this.rastreoVehicular = rastreoVehicular;
		this.tuercaAntirrobo = tuercaAntirrobo;
		this.valorPorcentualSeguridad = valorPorcentualSeguridad;
	}

	public boolean isGarage() {
		return garage;
	}

	public void setGarage(boolean garage) {
		this.garage = garage;
	}

	public boolean isAlarma() {
		return alarma;
	}

	public void setAlarma(boolean alarma) {
		this.alarma = alarma;
	}

	public boolean isRastreoVehicular() {
		return rastreoVehicular;
	}

	public void setRastreoVehicular(boolean rastreoVehicular) {
		this.rastreoVehicular = rastreoVehicular;
	}

	public boolean isTuercaAntirrobo() {
		return tuercaAntirrobo;
	}

	public void setTuercaAntirrobo(boolean tuercaAntirrobo) {
		this.tuercaAntirrobo = tuercaAntirrobo;
	}

	public float getValorPorcentualSeguridad() {
		return valorPorcentualSeguridad;
	}

	public void setValorPorcentualSeguridad(float valorPorcentualSeguridad) {
		this.valorPorcentualSeguridad = valorPorcentualSeguridad;
	}
	
	
}
