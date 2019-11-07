package Logica;

import java.text.DateFormat;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import BDD.GestorBDD;
import DTO.*;
import Entidades.*;
import Enumerados.EstadoPoliza;


public class GestorPoliza {
   
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
					
					GestorCliente gestorCliente = new GestorCliente();
					Cliente cliente = gestorCliente.getCliente(polDTO.getCliente().getNroCliente());
					
					GestorInformacion gestorInf = new GestorInformacion();
					Anio anio = gestorInf.getAnio(polDTO);
					Localidad localidad = gestorInf.getLocalidad(polDTO);
					TipoCobertura tipoCobertura = gestorInf.getTipoCobertura(polDTO);
					EstadoPoliza estadoPoliza = gestorInf.getEstadoPoliza(polDTO);
					
					List<HijoDeclarado> hijos = this.crearHijos(polDTO);
					MedidasSeguridad ms = this.crearMedidasSeguridad(polDTO);
					
					GestorParametros gestorP = new GestorParametros();
					ValoresPorcentualesPoliza vp = gestorP.getValoresPorcentualesPoliza(anio,localidad,tipoCobertura,ms);
					
					
					List<Cuota> cuotas = new ArrayList<Cuota>();
					if(polDTO.getTipoPoliza().compareTo("MENSUAL")==0) {
						Cuota c1 = new Cuota(1,"M",polDTO.getFechaInicio(),polDTO.getMontoTotal());
						Cuota c2 = new Cuota(2,"M",polDTO.getFechaInicio(),polDTO.getMontoTotal());
						Cuota c3 = new Cuota(3,"M",polDTO.getFechaInicio(),polDTO.getMontoTotal());
						Cuota c4 = new Cuota(4,"M",polDTO.getFechaInicio(),polDTO.getMontoTotal());
						Cuota c5 = new Cuota(5,"M",polDTO.getFechaInicio(),polDTO.getMontoTotal());
						Cuota c6 = new Cuota(6,"M",polDTO.getFechaInicio(),polDTO.getMontoTotal());
						cuotas.add(c1);
						cuotas.add(c2);
						cuotas.add(c3);
						cuotas.add(c4);
						cuotas.add(c5);
						cuotas.add(c6);	
						
						PolizaMensual poliza = new PolizaMensual(polDTO.getFechaInicio(),polDTO.getFechaFin(),localidad,
								estadoPoliza,polDTO.getMontoTotal(),polDTO.getPatente(),polDTO.getMotor(),
								polDTO.getChasis(),polDTO.getKmAnio(),polDTO.getAnio(),cuotas,anio,ms,hijos,
								tipoCobertura,vp,cliente);
						
						GestorCalculo gestorC = new GestorCalculo();
						poliza = gestorC.calcularPDD(poliza);
						//PASAR ESTADO POLIZA A GENERADA 
						
						GestorBDD gestorBDD = new GestorBDD();
						gestorBDD.guardarPoliza(poliza);
						
					}else if(polDTO.getTipoPoliza().compareTo("SEMESTRAL")==0){
						Cuota c = new Cuota(0,"S",polDTO.getFechaInicio(),polDTO.getMontoTotal());
						cuotas.add(c);
						PolizaSemestral poliza = new PolizaSemestral(polDTO.getFechaInicio(),polDTO.getFechaFin(),localidad,
								estadoPoliza,polDTO.getMontoTotal(),polDTO.getPatente(),polDTO.getMotor(),
								polDTO.getChasis(),polDTO.getKmAnio(),polDTO.getAnio(),cuotas,anio,ms,hijos,
								tipoCobertura,vp,cliente);
						
						GestorCalculo gestorC = new GestorCalculo();
						poliza = gestorC.calcularPDD(poliza);
						
						GestorBDD gestorBDD = new GestorBDD();
						gestorBDD.guardarPoliza(poliza);
					}
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
			int valor18=h.getFechaNacimiento().compareTo(fecha18);
			int valor30=h.getFechaNacimiento().compareTo(fecha30);
			if(valor18>0 || valor30<0) return false;
		}
		
		return true;
	}
	
	public boolean validarIDs(PolizaDTO polDTO) {
		
		GestorBDD gestorBDD = new GestorBDD();
		
		if (gestorBDD.validarIDs(polDTO)==0) return true;
		else return false;
	}
	
	public boolean validarFechas(PolizaDTO polDTO) {
		Date date = new Date();
        String fechaactual = sdf.format(date);
        
        String anioactual= fechaactual.substring(0, 4);
        int anio = Integer.parseInt(anioactual);
        String diaactual= fechaactual.substring(8,10);
        int dia = Integer.parseInt(diaactual);
        String mesactual= fechaactual.substring(5, 7);
        int mes = Integer.parseInt(mesactual);
        
        if((mes==2 && dia<28)|| ((mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12)&& dia<31)||((mes==4||mes==6||mes==9||mes==11))&& dia<30) {
        dia = dia +1;
        }else {
        	dia=1;
        	if(mes==12) {
        		mes=1;
        		anio=anio+1;
        	}else {
        		mes=mes+1;
        	}
        }
        String anioString = String.valueOf(anio);  
        String mesString = String.valueOf(mes);
        String diaString = String.valueOf(dia);
        String fechaPosterior = (anioString.concat(mesString)).concat(diaString);
        
        anio = Integer.parseInt(anioactual);
        dia = Integer.parseInt(diaactual);
        mes = Integer.parseInt(mesactual);
        
        if(mes==12) {
        	mes=1;
        	anio=anio+1;
        }else mes++;
        
        anioString = String.valueOf(anio);  
        mesString = String.valueOf(mes);
        diaString = String.valueOf(dia);
        String mesPosterior = (anioString.concat(mesString)).concat(diaString);
        
    	int fp=polDTO.getFechaInicio().compareTo(fechaPosterior);
    	int mp=polDTO.getFechaInicio().compareTo(mesPosterior);
		
    	if(fp<0||mp>0) return false;
    	else return true;
        
      	}
	
	public List<HijoDeclarado> crearHijos(PolizaDTO polDTO){
		
		List<HijoDeclarado> hijos = new ArrayList<HijoDeclarado>();
		for(HijoDTO h:polDTO.getHijos()) {
			hijos.add(new HijoDeclarado(h));
		}
		
		return hijos;
	}
	
	public MedidasSeguridad crearMedidasSeguridad(PolizaDTO polDTO) {
		return new MedidasSeguridad(polDTO.getMedidasSeguridad());
	}
	
	
}
