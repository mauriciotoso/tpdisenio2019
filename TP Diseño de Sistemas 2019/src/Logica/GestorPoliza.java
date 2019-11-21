package Logica;

import java.text.DateFormat;

import java.text.SimpleDateFormat;
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
	
	private static final DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	public void altaPoliza(PolizaDTO polDTO) {
	
		boolean validar= this.validarPoliza(polDTO);
		
		if(!validar) {
			//error campos
			}else{
				
				boolean validarF= this.validarFechas(polDTO);
				
				if(!validarF) {
					//error fechas	
				}else{

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

					Poliza poliza = new Poliza(polDTO.getFechaInicio(),polDTO.getFechaFin(),localidad,
							estadoPoliza,polDTO.getPatente(),polDTO.getMotor(),
							polDTO.getChasis(),polDTO.getKmAnio(),cuotas,anio,polDTO.getTipoPoliza(),
							polDTO.getNroSiniestros(),ms,hijos,
							tipoCobertura,vp,cliente);

					poliza = GestorCalculo.getInstance().calcularPDD(poliza);
					//PASAR ESTADO POLIZA A GENERADA 

					GestorBDD.getInstance().guardarPoliza(poliza);
					//ACTUALIZAR ESTADO DEL CLIENTE (mirar enunciado)
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
				 Date date = new Date();
			     String fechaactual = sdf.format(date);
			        
			     String anioactual= fechaactual.substring(0, 4);
			     int anio = Integer.parseInt(anioactual);
			     int anio18=anio-18;
			     int anio30=anio-30;
			     String aniostring18 = String.valueOf(anio18);
			     String aniostring30 = String.valueOf(anio30);
			        
			     String fecha18 = aniostring18.concat(fechaactual.substring(4,10));
			     String fecha30 = aniostring30.concat(fechaactual.substring(4,10));
			        
			        //System.out.println(fecha18+" "+fecha30);
				
				ArrayList<HijoDTO> hijos= (ArrayList<HijoDTO>) polDTO.getHijos();
				
				for(HijoDTO h:hijos) {
					int valor18=h.getFechaNacimiento().toString().compareTo(fecha18);
					int valor30=h.getFechaNacimiento().toString().compareTo(fecha30);
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
	
	public void ingresarHijos(PolizaDTO polDTO, ArrayList<Date> fechasNac, ArrayList<Boolean> sexo, ArrayList<String> estadoCivil, int a) {
		List<HijoDTO> hijosLista = new ArrayList<>();
		for(int i = 0; i<a; i++) {
			HijoDTO hijo = new HijoDTO();
			hijo.setFechaNacimiento(fechasNac.get(i));
			
			if(sexo.get(i))  //true femenino, false masculino
				hijo.setSexo(Sexo.FEMENINO);
			else 
				hijo.setSexo(Sexo.MASCULINO);
			
			if(estadoCivil.get(i)=="Soltero")
				hijo.setEstadoCivil(EstadoCivil.SOLTERO);
			else if(estadoCivil.get(i)=="Casado")
				hijo.setEstadoCivil(EstadoCivil.CASADO);
			else if(estadoCivil.get(i)=="Viudo")
				hijo.setEstadoCivil(EstadoCivil.VIUDO);
			else if(estadoCivil.get(i)=="Divorciado")
				hijo.setEstadoCivil(EstadoCivil.DIVORCIADO);
			
			hijosLista.add(hijo);
		}
		
		polDTO.setHijos(hijosLista);
	}
	
	public void setCobertura(PolizaDTO polDTO, String cobertura, Date inicioVigencia, String tipoPoliza) {
		polDTO.setTipoCobertura(cobertura);
		polDTO.setFechaInicio(inicioVigencia);
		Calendar c = Calendar.getInstance();
		c.setTime(inicioVigencia);
		c.add(Calendar.MONTH, 6);
		Date fechaFin = c.getTime();
		polDTO.setMontoTotal(100000);
		polDTO.setFechaFin(fechaFin);
		polDTO.setTipoPoliza(tipoPoliza);
		polDTO.setPais("Argentina");
		
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
		polDTO.setEstadoPoliza("GENERADA");
	}
	
	public ReciboDTO generarRecibo(float monto, ArrayList<CuotaDTO> cuotasDTO, PolizaDTO polDTO, float importe) {
		ReciboDTO reciboDTO = new ReciboDTO();
		reciboDTO.setImportePagado(monto);
		reciboDTO.setImporte(importe);
		reciboDTO.setCuotas(cuotasDTO);
		
		return reciboDTO;
	}
	
	public Recibo registrarPago(PolizaDTO polDTO, ReciboDTO reciboDTO) {
		Poliza pol = GestorBDD.getInstance().getPoliza(polDTO);
		ArrayList<Cuota> cuotasOriginales = (ArrayList<Cuota>) pol.getCuotas();
		boolean valida = false;
		
		for (Cuota cOri: cuotasOriginales) {
			for (CuotaDTO c: reciboDTO.getCuotas()) {
				if (cOri.getIdCuota()==c.getIdCuota()) {
					cOri.setEstaPago(true);
					valida = true;
				}
			}
			if (!valida)
				cOri.setEstaPago(false);
		}
		
		GestorBDD.getInstance().actualizarCuotas(pol,cuotasOriginales);
		//aca hacer delete de las cuotas no modificadas
		
		
		Recibo recibo = new Recibo(reciboDTO);
		for(Cuota cOri: cuotasOriginales) {
			if (cOri.isEstaPago())
				recibo.setCuotas(cOri);
		}
		
		GestorBDD.getInstance().guardarRecibo(recibo);
		
		return recibo;
	}
}
