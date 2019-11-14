package Logica;

import Entidades.*;

public class GestorCalculo {
	
	private static GestorCalculo gestorCalculo;
	
	private GestorCalculo() {
		
	}
	
	public static GestorCalculo getInstance() {
		if(gestorCalculo == null) {
			gestorCalculo = new GestorCalculo();
		}
		return gestorCalculo;
	}
	
	public Poliza calcularPDD(Poliza poliza) {
		
		poliza.setPrima(1);
		poliza.setDescuentoUnidad(1);
		poliza.setPremio(1);
		
		return poliza;
	}
	
}
