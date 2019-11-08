package Logica;

import java.util.ArrayList;
import java.util.Date;

import DTO.*;

public class FachadaPoliza {

	public void altaPoliza(PolizaDTO polDTO) {
		GestorPoliza gestorP = new GestorPoliza();
		gestorP.altaPoliza(polDTO);
	}
	
	public PolizaDTO ingresarDatos (String prov, String loc, String marca, String modelo, int anioModelo, String patente, String chasis, String motor, 
			int kmAnio, boolean garage, boolean alarma, boolean dispRastreo, boolean tuercasAntirrobo,int nroSiniestros, ClienteDTO clienteDTO) {
		GestorPoliza gestorPoliza = new GestorPoliza();
		PolizaDTO polDTO = gestorPoliza.ingresarDatos(prov,loc,marca,modelo,anioModelo,patente,chasis,motor,kmAnio,
						garage,alarma,dispRastreo,tuercasAntirrobo,nroSiniestros, clienteDTO);
		
		return polDTO;
	}
	
	public void ingresarHijos(PolizaDTO polDTO, ArrayList<Date> fechasNac, ArrayList<Boolean> sexo, ArrayList<String> estadoCivil, int a) {
		GestorPoliza gestorPoliza = new GestorPoliza();
		gestorPoliza.ingresarHijos(polDTO, fechasNac, sexo, estadoCivil, a);
	}
	
	public boolean validarPoliza(PolizaDTO polDTO) {
		GestorPoliza gestorP = new GestorPoliza();
		return gestorP.validarPoliza(polDTO);
	}
	
	public void setCobertura(PolizaDTO polDTO, String cobertura, Date inicioVigencia, String tipoPoliza) {
		GestorPoliza gestorPoliza = new GestorPoliza();
		gestorPoliza.setCobertura(polDTO, cobertura, inicioVigencia, tipoPoliza);
	}
}
 