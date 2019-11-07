package Logica;

import Entidades.*;

public class GestorCalculo {
	public PolizaMensual calcularPDD(PolizaMensual poliza) {
		
		poliza.setPrima(1);
		poliza.setDescuentoUnidad(1);
		poliza.setPremio(1);
		
		return poliza;
	}
	
	public PolizaSemestral calcularPDD(PolizaSemestral poliza) {
		
		poliza.setPrima(1);
		poliza.setDescuentoUnidad(1);
		poliza.setPremio(1);
		
		return poliza;
	}
}
