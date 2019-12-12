package Logica;

import java.util.ArrayList;
import java.util.Date;

import DTO.CuotaDTO;
import DTO.PolizaDTO;
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
	
	public void calcularPDD(PolizaDTO poliza) {
		
		poliza.setPrima(1);
		poliza.setDescuentoUnidad(1);
		poliza.setPremio(1);
		
	}
	
	public float calculoImporte(ArrayList<CuotaDTO> cuotasDTO) {
		float importeTotal = 0;
		Date hoy = new Date();
		for(CuotaDTO cuota:cuotasDTO) {
			float importeCuota = cuota.getImporteCuota();
			importeTotal += importeCuota;
			if(cuota.getUltimoDiaPago().before(hoy)) {
				float recargo = cuota.getRecargosPorMora();
				importeTotal += recargo;
			}
		}
		return importeTotal;
	}
}
