package Logica;

import java.util.ArrayList;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import BDD.GestorBDD;
import DTO.*;
import Entidades.*;
import Enumerados.EstadoCivil;
import Enumerados.EstadoPoliza;
import Enumerados.Sexo;


public class GestorPoliza {
   
	private static GestorPoliza gestorPoliza;
	
	private GestorPoliza() {
		
	}
	
	public static GestorPoliza getInstance() {
		if(gestorPoliza == null) {
			gestorPoliza = new GestorPoliza();
		}
		return gestorPoliza;
	}
	
	public void altaPoliza(PolizaDTO polDTO) {
	
		boolean validar= this.validarPoliza(polDTO);
		
		if(!validar) FachadaPoliza.getInstance().notificarError();
		else {
			boolean validarF= this.validarFechas(polDTO);	
			if(!validarF) FachadaPoliza.getInstance().notificarError();
			else {
				Cliente cliente = GestorCliente.getInstance().getCliente(polDTO.getCliente().getNroCliente());
					
				Anio anio = GestorInformacion.getInstance().getAnio(polDTO);
				Localidad localidad = GestorInformacion.getInstance().getLocalidad(polDTO);
				TipoCobertura tipoCobertura = GestorInformacion.getInstance().getTipoCobertura(polDTO);
				EstadoPoliza estadoPoliza = GestorInformacion.getInstance().getEstadoPoliza(polDTO);
				
				List<HijoDeclarado> hijos = this.crearHijos(polDTO);
				MedidasSeguridad ms = this.crearMedidasSeguridad(polDTO);
				
				ValoresPorcentualesPoliza vp = GestorParametros.getInstance().getValoresPorcentualesPoliza(anio,localidad,tipoCobertura,ms);
	
				List<Cuota> cuotas = new ArrayList<Cuota>();
				if(polDTO.getTipoPoliza().compareTo("MENSUAL")==0) {
					Cuota c1 = new Cuota(polDTO.getCuotas().get(0));
					Cuota c2 = new Cuota(polDTO.getCuotas().get(1));
					Cuota c3 = new Cuota(polDTO.getCuotas().get(2));
					Cuota c4 = new Cuota(polDTO.getCuotas().get(3));
					Cuota c5 = new Cuota(polDTO.getCuotas().get(4));
					Cuota c6 = new Cuota(polDTO.getCuotas().get(5));
					cuotas.add(c1);
					cuotas.add(c2);
					cuotas.add(c3);
					cuotas.add(c4);
					cuotas.add(c5);
					cuotas.add(c6);
					}else if(polDTO.getTipoPoliza().compareTo("SEMESTRAL")==0){
						Cuota c = new Cuota(polDTO.getCuotas().get(0));
						cuotas.add(c);
					}
				
				long nroPoliza = GestorBDD.getInstance().nextNroPoliza();
				Poliza poliza = new Poliza(nroPoliza,polDTO.getFechaInicio(),polDTO.getFechaFin(),localidad,
						estadoPoliza,polDTO.getPatente(),polDTO.getMotor(),
						polDTO.getChasis(),polDTO.getKmAnio(),cuotas,anio,polDTO.getTipoPoliza(),
						polDTO.getNroSiniestros(),ms,hijos,
						tipoCobertura,vp,cliente);

				poliza = GestorCalculo.getInstance().calcularPDD(poliza);
				poliza.setMontoTotal(polDTO.getMontoTotal());
				poliza.actualizarGenerada();
				
				GestorBDD.getInstance().guardarPoliza(poliza);
					//ACTUALIZAR ESTADO DEL CLIENTE (mirar enunciado)
				GestorCliente.getInstance().actualizarEstado(cliente);
			}
		}
	}
	
	public boolean validarPoliza(PolizaDTO polDTO) {
		
		boolean validarH = this.validarHijos(polDTO);
		if(!validarH) return false;
		
		boolean validarIDs = this.validarIDs(polDTO);
		return validarIDs;
	}
	
	public boolean validarHijos(PolizaDTO polDTO) {
		
		if (polDTO.getHijos()!=null) {
			
			Date today = new Date();

		    Calendar anio18 = Calendar.getInstance();
		    Calendar anio30 = Calendar.getInstance();
		        
		    anio18.setTime(today);
		    anio30.setTime(today);
		        
		    anio18.add(Calendar.YEAR, -18);
		    anio30.add(Calendar.YEAR, -30);
		    
			ArrayList<HijoDTO> hijos= (ArrayList<HijoDTO>) polDTO.getHijos();
			
			for(HijoDTO h:hijos) {
				int valor18=h.getFechaNacimiento().compareTo(anio18.getTime());
				int valor30=h.getFechaNacimiento().compareTo(anio30.getTime());
				if(valor18>0 || valor30<0) return false;
			}
		}
		return true;
	}

	public boolean validarIDs(PolizaDTO polDTO) {
		
		if (GestorBDD.getInstance().validarIDs(polDTO)==0) return true;
		else return false;
	}
	
	public boolean validarFechas(PolizaDTO polDTO) {
		Calendar fechaInicio = Calendar.getInstance();
		Calendar fechaInicioAnterior = Calendar.getInstance();
		boolean correcto = false;
		fechaInicio.setTime(polDTO.getFechaInicio());
		fechaInicioAnterior.setTime(polDTO.getFechaInicio());
		
		fechaInicioAnterior.add(Calendar.DATE, -1);
		
		if (fechaInicio.compareTo(fechaInicioAnterior)!=0)
			correcto=true;
		
		System.out.println(correcto);
		return correcto;
      	}
	
	public List<HijoDeclarado> crearHijos(PolizaDTO polDTO){
		
		List<HijoDeclarado> hijos = new ArrayList<HijoDeclarado>();
		
		if(polDTO.getHijos()!=null) {
			for(HijoDTO h:polDTO.getHijos()) {
				hijos.add(new HijoDeclarado(h));
			}
		}
		
		return hijos;
	}
	
	public MedidasSeguridad crearMedidasSeguridad(PolizaDTO polDTO) {
		return new MedidasSeguridad(polDTO.getMedidasSeguridad());
	}
	
	public PolizaDTO ingresarDatos (Localidad localidad,Anio anioModelo, String patente, String chasis, String motor, 
			int kmAnio, boolean garage, boolean alarma, boolean dispRastreo, boolean tuercasAntirrobo,int nroSiniestros, ClienteDTO clienteDTO) {
		
		MedidasSeguridadDTO medidasSeguridadDTO = new MedidasSeguridadDTO(alarma,garage,dispRastreo,tuercasAntirrobo);
		PolizaDTO polDTO = new PolizaDTO(localidad, anioModelo,motor,chasis,patente,kmAnio,nroSiniestros,medidasSeguridadDTO,clienteDTO);
		
		return polDTO;
	}
	
	public void ingresarDatos(PolizaDTO polDTO, ArrayList<Date> fechasNac, ArrayList<Sexo> sexo, ArrayList<EstadoCivil> estadoCivil, int a) {
		List<HijoDTO> hijosLista = new ArrayList<>();
		
		for(int i = 0; i<a; i++) {
			
			HijoDTO hijo = new HijoDTO();
			hijo.setFechaNacimiento(fechasNac.get(i));
			hijo.setSexo(sexo.get(i));
			hijo.setEstadoCivil(estadoCivil.get(i));
			hijosLista.add(hijo);
		}
		
		polDTO.setHijos(hijosLista);
	}

	public void setCobertura(PolizaDTO polDTO, TipoCobertura cobertura, Date inicioVigencia, String tipoPoliza) {
		polDTO.setTipoCobertura(cobertura.getNombre());
		polDTO.setIdTipoCobertura(cobertura.getIdTipoCobertura());
		polDTO.setFechaInicio(inicioVigencia);
		Calendar c = Calendar.getInstance();
		c.setTime(inicioVigencia);
		c.add(Calendar.MONTH, 6);
		Date fechaFin = c.getTime();
		polDTO.setMontoTotal(100000);
		polDTO.setFechaFin(fechaFin);
		polDTO.setTipoPoliza(tipoPoliza);
		//polDTO.setPais("Argentina");
		
		List<CuotaDTO> cuotasDTO = new ArrayList<CuotaDTO>();
		if(tipoPoliza=="MENSUAL") {
			Calendar fechaInicio = Calendar.getInstance();
			fechaInicio.setTime(inicioVigencia);
			
			fechaInicio.add(Calendar.DATE, -1);
			
			Date fecha = fechaInicio.getTime();
						
			for(int i=1;i<7;i++) {
				cuotasDTO.add(new CuotaDTO(i,fecha,(float)polDTO.getMontoTotal()/6,(float)0,(float) 0));
				
				fechaInicio.add(Calendar.MONTH, 1);
				fecha = fechaInicio.getTime();
			}
		}
		if(tipoPoliza=="SEMESTRAL") {
			Calendar fechaInicio = Calendar.getInstance();
			fechaInicio.setTime(inicioVigencia);
			
			fechaInicio.add(Calendar.DATE, -1);
			
			Date fecha = fechaInicio.getTime();
			
			cuotasDTO.add(new CuotaDTO(0,fecha,(float)polDTO.getMontoTotal(),(float)0,(float) 0));
		}
		polDTO.setCuotas(cuotasDTO);
		GestorCalculo.getInstance().calcularPDD(polDTO);
	}
	
	public ReciboDTO generarRecibo(float monto, ArrayList<CuotaDTO> cuotasDTO, PolizaDTO polDTO, float importe) {
		long nroRecibo = GestorBDD.getInstance().nextNroRecibo();
		Calendar hoy = Calendar.getInstance();
		ReciboDTO reciboDTO = new ReciboDTO(importe,monto,cuotasDTO,nroRecibo,hoy);
		
		return reciboDTO;
	}
	
	public void registrarPago(PolizaDTO polDTO, ReciboDTO reciboDTO) {
		Poliza pol = GestorBDD.getInstance().getPoliza(polDTO);
		
		ArrayList<Integer> ids = new ArrayList<>();
		for (CuotaDTO c: reciboDTO.getCuotas()) ids.add(c.getIdCuota());
		
		for (Cuota cPol: pol.getCuotas()) {
			for (CuotaDTO c: reciboDTO.getCuotas()) {
				if (cPol.getIdCuota()==c.getIdCuota()) {
					cPol.setFechaPago(reciboDTO.getFechaRecibo());
					cPol.setEstaPago(true);
				}
			}
		}
		Recibo recibo = new Recibo(reciboDTO);
		
		for(Cuota c: pol.getCuotas()) {
			for(CuotaDTO cDTO:reciboDTO.getCuotas()) {
				if(cDTO.getIdCuota()==c.getIdCuota()) recibo.setCuotas(c);
			}
		}
		System.out.println(recibo);
		
		GestorBDD.getInstance().actualizarCuotas(pol);
		GestorBDD.getInstance().guardarRecibo(recibo);
	
	}
	
	public PolizaDTO getPoliza (String nPoliza) {
		PolizaDTO pol = new PolizaDTO(GestorBDD.getInstance().getPoliza(nPoliza));
		
		return pol;
	}
}
