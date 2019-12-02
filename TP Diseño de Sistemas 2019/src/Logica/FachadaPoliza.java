package Logica;

import java.util.ArrayList;
import java.util.Date;
import DTO.*;
import Entidades.*;
import Enumerados.*;

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
	
	public void ingresarHijos(PolizaDTO polDTO, ArrayList<Date> fechasNac, ArrayList<Sexo> sexo, ArrayList<EstadoCivil> estadoCivil, int a) {

		GestorPoliza.getInstance().ingresarHijos(polDTO, fechasNac, sexo, estadoCivil, a);
	}
	
	public boolean validarPoliza(PolizaDTO polDTO) {
	
		return GestorPoliza.getInstance().validarPoliza(polDTO);
	}

	
	public void setCobertura(PolizaDTO polDTO, TipoCobertura cobertura, Date inicioVigencia, String tipoPoliza) {

		GestorPoliza.getInstance().setCobertura(polDTO, cobertura, inicioVigencia, tipoPoliza);
	}
	
	public float calculoImporte(ArrayList<CuotaDTO> cuotasDTO) {
		
		float importe = GestorCalculo.getInstance().calculoImporte(cuotasDTO);
		return importe;
	}
	
	public ReciboDTO generarRecibo(float monto, ArrayList<CuotaDTO> cuotasDTO, PolizaDTO polDTO, float importe) {
		ReciboDTO reciboDTO = new ReciboDTO();
		reciboDTO = GestorPoliza.getInstance().generarRecibo(monto, cuotasDTO, polDTO, importe);
		
		return reciboDTO;
	}
	
	public Recibo registrarPago(PolizaDTO polDTO, ReciboDTO reciboDTO) {
		Recibo recibo = GestorPoliza.getInstance().registrarPago(polDTO, reciboDTO);
		return recibo;
	}
	
	public Poliza buscarPoliza(String nPoliza){
		Poliza pol = new Poliza();
		pol = GestorPoliza.getInstance().buscarPoliza(nPoliza);
			
		return pol;
		}
}
 