package Logica;

import Entidades.*;

public class GestorCalculo {
	
	public Poliza calcularPDD(Poliza poliza) {
		
		poliza.setPrima(1);
		poliza.setDescuentoUnidad(1);
		poliza.setPremio(1);
		
		return poliza;
	}
	
}
