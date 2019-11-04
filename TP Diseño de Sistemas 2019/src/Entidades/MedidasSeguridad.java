package Entidades;

public class MedidasSeguridad {

	private int idMedidasSeguridad;
	private boolean garage;
	private boolean alarma;
	private boolean rastreoVehicular;
	private boolean tuercaAntirrobo;
	
	public MedidasSeguridad(int idMedidasSeguridad, boolean garage, boolean alarma, boolean rastreoVehicular,
			boolean tuercaAntirrobo) {
		super();
		this.idMedidasSeguridad = idMedidasSeguridad;
		this.garage = garage;
		this.alarma = alarma;
		this.rastreoVehicular = rastreoVehicular;
		this.tuercaAntirrobo = tuercaAntirrobo;
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

	public int getIdMedidasSeguridad() {
		return idMedidasSeguridad;
	}

	public void setIdMedidasSeguridad(int idMedidasSeguridad) {
		this.idMedidasSeguridad = idMedidasSeguridad;
	}
	
}
