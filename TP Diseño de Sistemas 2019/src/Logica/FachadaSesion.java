package Logica;

public class FachadaSesion {
	
	private static FachadaSesion fachSesion;
	
	private FachadaSesion() {
		
	}
	
	public static FachadaSesion getInstance() {
		if(fachSesion == null) {
			fachSesion = new FachadaSesion();
		}
		return fachSesion;
	}
}
