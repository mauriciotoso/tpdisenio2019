package Logica;

import BDD.GestorBDD;
import DTO.*;
import Entidades.*;

public class GestorInformacion {
	
	public Anio getAnio(PolizaDTO polDTO) {
		
		GestorBDD gestorBDD = new GestorBDD();
		return gestorBDD.getAnio(polDTO);
	}
	
	public Localidad getLocalidad(PolizaDTO polDTO) {
		
		GestorBDD gestorBDD = new GestorBDD();
		return gestorBDD.getLocalidad(polDTO);
	}
	
	public TipoCobertura getTipoCObertura(PolizaDTO polDTO) {
		
	}
}
