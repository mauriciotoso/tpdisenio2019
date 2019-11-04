package DTO;

public class MedidasSeguridadDTO {
	
	private boolean alarma;
	private boolean garage;
	private boolean rastreoVehicular;
	private boolean tuercasAntirrobo;
	
	public MedidasSeguridadDTO(boolean alarma, boolean garage, boolean rastreoVehicular, boolean tuercasAntirrobo,
			boolean valorPorcentualSeuridad) {
		super();
		this.alarma = alarma;
		this.garage = garage;
		this.rastreoVehicular = rastreoVehicular;
		this.tuercasAntirrobo = tuercasAntirrobo;
	}

	public boolean isAlarma() {
		return alarma;
	}

	public void setAlarma(boolean alarma) {
		this.alarma = alarma;
	}

	public boolean isGarage() {
		return garage;
	}

	public void setGarage(boolean garage) {
		this.garage = garage;
	}

	public boolean isRastreoVehicular() {
		return rastreoVehicular;
	}

	public void setRastreoVehicular(boolean rastreoVehicular) {
		this.rastreoVehicular = rastreoVehicular;
	}

	public boolean isTuercasAntirrobo() {
		return tuercasAntirrobo;
	}

	public void setTuercasAntirrobo(boolean tuercasAntirrobo) {
		this.tuercasAntirrobo = tuercasAntirrobo;
	}

}
