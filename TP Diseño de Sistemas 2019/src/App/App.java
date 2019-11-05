package App;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Entidades.*;
import Enumerados.*;

public class App {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Marca marca = new Marca(1,"Ford");
		Modelo modelo = new Modelo(1,"Focus",marca);
		Anio anio = new Anio(1,2006,(float)0.1,modelo);
		EstadoPoliza estadoPoliza = new EstadoPoliza(1,"VIGENTE");
		EstadoCliente estadoCliente = new EstadoCliente(1,"PLATA");
		CondicionIVA condicionIVA = new CondicionIVA(1,"EXCENTO");
		Cuota cuota1 = new Cuota(1,1, "2010-1-1" ,1000, false,(float)0.1,(float)0.1);
		Cuota cuota2 = new Cuota(2,2, "2010-1-1" ,1000, false,(float)0.1,(float)0.1);
		Cuota cuota3 = new Cuota(3,3, "2010-1-1" ,1000, false,(float)0.1,(float)0.1);
		Cuota cuota4 = new Cuota(4,4, "2010-1-1" ,1000, false,(float)0.1,(float)0.1);
		Cuota cuota5 = new Cuota(5,5, "2010-1-1" ,1000, false,(float)0.1,(float)0.1);
		Cuota cuota6 = new Cuota(6,6, "2010-1-1" ,1000, false,(float)0.1,(float)0.1);
		Cuota cuota7 = new Cuota(7,1, "2010-1-1" ,1000, false,(float)0.1,(float)0.1);
		Pais pais = new Pais(1, "Argentina");
		Provincia provincia = new Provincia(1,"Santa Fe", pais);
		Localidad localidad = new Localidad (1,"La Capital",(float)0.2, provincia);
		HijoDeclarado hijo = new HijoDeclarado(1,"2000-1-1", Sexo.MASCULINO , EstadoCivil.SOLTERO);
		MedidasSeguridad medidasSeguridad = new MedidasSeguridad(1,true,true,false,false);
		TipoCobertura tipoCobertura = new TipoCobertura(1,"Tipo 1","Descripcion 1",(float)0.3);
		ValoresPorcentualesPoliza vpp1 = new ValoresPorcentualesPoliza(1,(float) 0.1,(float) 0.1,(float) 0.1,(float) 0.1,(float) 0.1,(float) 0.1,(float) 0.1,(float) 0.1,(float) 0.1,(float) 0.1,(float) 0.1,(float) 0.1,(float) 0.1,(float) 0.1,(float) 0.1);
		ValoresPorcentualesPoliza vpp2 = new ValoresPorcentualesPoliza(2,(float) 0.1,(float) 0.1,(float) 0.1,(float) 0.1,(float) 0.1,(float) 0.1,(float) 0.1,(float) 0.1,(float) 0.1,(float) 0.1,(float) 0.1,(float) 0.1,(float) 0.1,(float) 0.1,(float) 0.1);
		ValoresPorcentualesActuales vpa = new ValoresPorcentualesActuales(1,(float) 0.1,(float) 0.1,(float) 0.1,(float) 0.1,(float) 0.1,(float) 0.1,(float) 0.1,(float) 0.1,(float) 0.1,(float) 0.1,(float) 0.1,null);
		Direccion direccion = new Direccion(1,"calle","numero","piso","departamento","codigo",localidad);
		Cliente cliente = new Cliente("1","2000-1-1","Mauricio","Toso",TipoDocumento.DNI,"41160819","04116081921",Sexo.MASCULINO,condicionIVA,"mauricio.toso@yahoo.com.ar",EstadoCivil.SOLTERO,"Ingeniero","2010",estadoCliente,direccion,new ArrayList<Poliza>());
		
		ArrayList<Cuota> cuotas1= new ArrayList<Cuota>();
		cuotas1.add(cuota1);
		cuotas1.add(cuota2);
		cuotas1.add(cuota3);
		cuotas1.add(cuota4);
		cuotas1.add(cuota5);
		cuotas1.add(cuota6);
		ArrayList<Cuota> cuotas2= new ArrayList<Cuota>();
		cuotas2.add(cuota7);
		
		ArrayList<HijoDeclarado> hijos= new ArrayList<HijoDeclarado>();
		hijos.add(hijo);
		
		
		PolizaMensual polizaM = new PolizaMensual("1","2011-1-1","2011-2-2","domicilio",estadoPoliza,(float)0.1,(float)0.1,(float)0.1,"000AAA","motor","chasis",10000,2010,(float)0.1,cuotas1,anio,medidasSeguridad,hijos,tipoCobertura,vpp1,cliente);
		PolizaSemestral polizaS = new PolizaSemestral("2","2011-1-1","2011-2-2","domicilio",estadoPoliza,(float)0.1,(float)0.1,(float)0.1,"000AAA","motor","chasis",10000,2010,(float)0.1,cuotas2,anio,medidasSeguridad,hijos,tipoCobertura,vpp2,cliente,10);
		SolicitudPoliza solicitud = new SolicitudPoliza(1,2010,"000AAA","motor","chasis",10000,medidasSeguridad,hijos,tipoCobertura,polizaM,null);
		
		session.beginTransaction();
		
		session.save(marca);
		session.save(modelo);
		session.save(anio);
		
		session.save(cuota1);
		session.save(cuota2);
		session.save(cuota3);
		session.save(cuota4);
		session.save(cuota5);
		session.save(cuota6);
		session.save(cuota7);
		session.save(condicionIVA);
		session.save(estadoCliente);
		session.save(estadoPoliza);
		session.save(pais);
		session.save(provincia);
		session.save(localidad);
		session.save(hijo);
		session.save(medidasSeguridad);
		session.save(tipoCobertura);
		session.save(vpp1);
		session.save(vpp2);
		session.save(vpa);
		session.save(direccion);
		session.save(cliente);
		session.save(polizaM);
		session.save(polizaS);
		
		session.save(solicitud);
		
		session.getTransaction().commit();
		

	}

}

