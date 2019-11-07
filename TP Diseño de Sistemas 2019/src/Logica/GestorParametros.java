package Logica;

import BDD.GestorBDD;
import Entidades.*;

public class GestorParametros {
	
	public ValoresPorcentualesPoliza getValoresPorcentualesPoliza(Anio anio, Localidad localidad, TipoCobertura tc, MedidasSeguridad ms) {
		
		GestorBDD gestorBDD = new GestorBDD();
		ValoresPorcentualesActuales vpa = gestorBDD.getVPA();
		ValoresPorcentualesPoliza vp = new ValoresPorcentualesPoliza(vpa,anio,localidad,tc,ms);
		
		return vp;
		
	}

}
