package Logica;

public class FachadaInformacion {
	private static FachadaInformacion fachInformacion;
	
	private FachadaInformacion() {
		
	}
	
	public static FachadaInformacion getInstance() {
		if(fachInformacion == null) {
			fachInformacion = new FachadaInformacion();
		}
		return fachInformacion;
	}
}
