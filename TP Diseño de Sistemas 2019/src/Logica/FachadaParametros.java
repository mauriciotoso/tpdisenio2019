package Logica;

public class FachadaParametros {
private static FachadaParametros fachParametros;
	
	private FachadaParametros() {
		
	}
	
	public static FachadaParametros getInstance() {
		if(fachParametros == null) {
			fachParametros = new FachadaParametros();
		}
		return fachParametros;
	}
}
