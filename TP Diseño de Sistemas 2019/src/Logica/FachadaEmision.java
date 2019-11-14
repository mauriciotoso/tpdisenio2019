package Logica;

public class FachadaEmision {
	private static FachadaEmision fachEmision;
	
	private FachadaEmision() {
		
	}
	
	public static FachadaEmision getInstance() {
		if(fachEmision == null) {
			fachEmision = new FachadaEmision();
		}
		return fachEmision;
	}
}
