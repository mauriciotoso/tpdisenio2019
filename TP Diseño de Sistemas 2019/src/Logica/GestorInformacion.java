package Logica;

import BDD.GestorBDD;
import DTO.*;
import Entidades.*;
import Enumerados.EstadoPoliza;

public class GestorInformacion {
	
	public Anio getAnio(PolizaDTO polDTO) {
		
		GestorBDD gestorBDD = new GestorBDD();
		return gestorBDD.getAnio(polDTO);
	}
	
	public Localidad getLocalidad(PolizaDTO polDTO) {
		
		GestorBDD gestorBDD = new GestorBDD();
		return gestorBDD.getLocalidad(polDTO);
	}
	
	public TipoCobertura getTipoCobertura(PolizaDTO polDTO) {
		
		GestorBDD gestorBDD = new GestorBDD();
		return gestorBDD.getTipoCobertura(polDTO);
	}
	
	public EstadoPoliza getEstadoPoliza(PolizaDTO polDTO) {
		GestorBDD gestorBDD = new GestorBDD();
		return gestorBDD.getEstadoPoliza(polDTO);
	}
}
