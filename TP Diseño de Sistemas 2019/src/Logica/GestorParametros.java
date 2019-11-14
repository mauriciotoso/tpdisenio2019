package Logica;

import BDD.GestorBDD;
import Entidades.*;

public class GestorParametros {
	
	private static GestorParametros gestorParametros;
	
	private GestorParametros() {
		
	}
	
	public static GestorParametros getInstance() {
		if(gestorParametros == null) {
			gestorParametros = new GestorParametros();
		}
		return gestorParametros;
	}
	
	public ValoresPorcentualesPoliza getValoresPorcentualesPoliza(Anio anio, Localidad localidad, TipoCobertura tc, MedidasSeguridad ms) {
		
		ValoresPorcentualesActuales vpa = GestorBDD.getInstance().getVPA();
		ValoresPorcentualesPoliza vp = new ValoresPorcentualesPoliza(vpa,anio,localidad,tc,ms);
		
		return vp;
		
	}

}
