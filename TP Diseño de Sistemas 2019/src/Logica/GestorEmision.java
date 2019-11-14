package Logica;

public class GestorEmision {
	
	private static GestorEmision gestorEmision;
	
	private GestorEmision() {
		
	}
	
	public static GestorEmision getInstance() {
		if(gestorEmision == null) {
			gestorEmision = new GestorEmision();
		}
		return gestorEmision;
	}
}
