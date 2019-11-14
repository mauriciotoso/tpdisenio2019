package Logica;

import java.util.ArrayList;
import java.util.Date;
import DTO.*;
import Entidades.*;

public class FachadaPoliza {

	private static FachadaPoliza fachPoliza;
	
	private FachadaPoliza() {
		
	}
	
	public static FachadaPoliza getInstance() {
		if(fachPoliza == null) {
			fachPoliza = new FachadaPoliza();
		}
		return fachPoliza;
	}
	
	public void altaPoliza(PolizaDTO polDTO) {
		GestorPoliza.getInstance().altaPoliza(polDTO);
	}
	
	public PolizaDTO ingresarDatos (Localidad localidad, Anio anioModelo, String patente, String chasis, String motor, 
			int kmAnio, boolean garage, boolean alarma, boolean dispRastreo, boolean tuercasAntirrobo,int nroSiniestros, ClienteDTO clienteDTO) {

		PolizaDTO polDTO = GestorPoliza.getInstance().ingresarDatos(localidad,anioModelo,patente,chasis,motor,kmAnio,
						garage,alarma,dispRastreo,tuercasAntirrobo,nroSiniestros, clienteDTO);
		
		return polDTO;
	}
	
	public void ingresarHijos(PolizaDTO polDTO, ArrayList<Date> fechasNac, ArrayList<Boolean> sexo, ArrayList<String> estadoCivil, int a) {

		GestorPoliza.getInstance().ingresarHijos(polDTO, fechasNac, sexo, estadoCivil, a);
	}
	
	public boolean validarPoliza(PolizaDTO polDTO) {
	
		return GestorPoliza.getInstance().validarPoliza(polDTO);
	}
	
	public void setCobertura(PolizaDTO polDTO, String cobertura, Date inicioVigencia, String tipoPoliza) {

		GestorPoliza.getInstance().setCobertura(polDTO, cobertura, inicioVigencia, tipoPoliza);
	}
}
 