package DTO;

import Entidades.MedidasSeguridad;

public class MedidasSeguridadDTO {
	
	private boolean alarma;
	private boolean garage;
	private boolean rastreoVehicular;
	private boolean tuercasAntirrobo;
	
	public MedidasSeguridadDTO() {
		
	}
	
	public MedidasSeguridadDTO(boolean alarma, boolean garage, boolean rastreoVehicular, boolean tuercasAntirrobo) {
		super();
		this.alarma = alarma;
		this.garage = garage;
		this.rastreoVehicular = rastreoVehicular;
		this.tuercasAntirrobo = tuercasAntirrobo;
	}
	
	public MedidasSeguridadDTO(MedidasSeguridad ms) {
		this.alarma = ms.isAlarma();
		this.garage = ms.isGarage();
		this.rastreoVehicular = ms.isRastreoVehicular();
		this.tuercasAntirrobo = ms.isTuercaAntirrobo();
	}

	@Override
	public String toString() {
		return "MedidasSeguridadDTO [alarma=" + alarma + ", garage=" + garage + ", rastreoVehicular=" + rastreoVehicular
				+ ", tuercasAntirrobo=" + tuercasAntirrobo + "]";
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
