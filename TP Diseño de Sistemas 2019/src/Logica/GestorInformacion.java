package Logica;

import BDD.GestorBDD;
import DTO.*;
import Entidades.*;
import Enumerados.EstadoPoliza;

public class GestorInformacion {
	
	private static GestorInformacion gestorInformacion;
	
	private GestorInformacion() {
		
	}
	
	public static GestorInformacion getInstance() {
		if(gestorInformacion == null) {
			gestorInformacion = new GestorInformacion();
		}
		return gestorInformacion;
	}
	
	public Anio getAnio(PolizaDTO polDTO) {
		
		return GestorBDD.getInstance().getAnio(polDTO);
	}
	
	public Localidad getLocalidad(PolizaDTO polDTO) {

		return GestorBDD.getInstance().getLocalidad(polDTO);
	}
	
	public TipoCobertura getTipoCobertura(PolizaDTO polDTO) {

		return GestorBDD.getInstance().getTipoCobertura(polDTO);
	}
	
	public EstadoPoliza getEstadoPoliza(PolizaDTO polDTO) {
		
		return GestorBDD.getInstance().getEstadoPoliza(polDTO);
	}
}
