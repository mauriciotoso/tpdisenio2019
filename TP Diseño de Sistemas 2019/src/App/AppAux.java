package App;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/*import DTO.*;
import Entidades.*;
import Enumerados.EstadoCivil;
import Enumerados.EstadoPoliza;
import Enumerados.Sexo;
import Logica.*;
*/
public class AppAux {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		//long val=GestorBDD.getInstance().nroPolizas(2);
		
		session.getTransaction().commit();
		
		//System.out.println(val);
		/*String estadoP = "VIGENTE";
		EstadoPoliza ep2 = null;
		session.beginTransaction();
		
		@SuppressWarnings("unchecked")
		List<EstadoPoliza> estadoPoliza = session.createQuery
		("from EstadoPoliza ep where ep.estadoPoliza='"+estadoP+"' ").getResultList();
		
		for (EstadoPoliza ep:estadoPoliza) {
			if(ep.getEstadoPoliza().compareTo(estadoP)==0)
				ep2=ep;
		}
		System.out.println(ep2);
		session.getTransaction().commit();*/
		/*
		
		Anio anio = session.get(Anio.class, 1);
		Localidad localidad = session.get(Localidad.class, 1);
		TipoCobertura tc = session.get(TipoCobertura.class, 1);
		MedidasSeguridad ms = session.get(MedidasSeguridad.class, 1);
		GestorParametros gp = new GestorParametros();
		ValoresPorcentualesPoliza vp = gp.getValoresPorcentualesPoliza(anio, localidad, tc, ms);
		
		session.save(vp);
		
		session.getTransaction().commit();
		
		System.out.println(vp);
		
		
		String fecha = "1990-03-07";
		float monto = 20000;
		
		List<Cuota> cuotas = new ArrayList<Cuota>();
		//if(polDTO.getTipoPoliza().compareTo("MENSUAL")==0) {
			Cuota c1 = new Cuota(1,"M",fecha,monto);
			Cuota c2 = new Cuota(2,"M",fecha,monto);
			Cuota c3 = new Cuota(3,"M",fecha,monto);
			Cuota c4 = new Cuota(4,"M",fecha,monto);
			Cuota c5 = new Cuota(5,"M",fecha,monto);
			Cuota c6 = new Cuota(6,"M",fecha,monto);
			cuotas.add(c1);
			cuotas.add(c2);
			cuotas.add(c3);
			cuotas.add(c4);
			cuotas.add(c5);
			cuotas.add(c6);	
		//}else if(polDTO.getTipoPoliza().compareTo("SEMESTRAL")==0){
		//	Cuota c = new Cuota(0,"S",fecha,monto);
		//	cuotas.add(c);
		//}
			
		for(Cuota c: cuotas) {
			session.save(c);
			System.out.println(c);
		}
		
		session.getTransaction().commit();*/
		/*
		String tp="Tipo 1";
		TipoCobertura tpUltimo = null;
		session.beginTransaction();
		
		@SuppressWarnings("unchecked")
		List<TipoCobertura> coberturas = session.createQuery
		("from TipoCobertura t where t.nombre='"+tp+"' ").getResultList();
		
		for(TipoCobertura t:coberturas) {
			if(t.getNombre().compareTo(tp)==0) {
				tpUltimo=t;
			}
		}
		
		session.getTransaction().commit();
		*/
		/*
		HijoDTO h1=new HijoDTO("1999-05-18",Sexo.MASCULINO,EstadoCivil.SOLTERO);
		HijoDTO h2=new HijoDTO("1998-05-18",Sexo.FEMENINO,EstadoCivil.DIVORCIADO);
		HijoDTO h3=new HijoDTO("1997-05-18",Sexo.MASCULINO,EstadoCivil.CASADO);
		
		List<HijoDTO> hijosDTO = new ArrayList<HijoDTO>();
		
		hijosDTO.add(h1);
		hijosDTO.add(h2);
		hijosDTO.add(h3);
		
		List<HijoDeclarado> hijos = new ArrayList<HijoDeclarado>();
		for(HijoDTO h:hijosDTO) {
			hijos.add(new HijoDeclarado(h));
		}
		
		session.beginTransaction();
		for(HijoDeclarado h:hijos) {
			session.save(h);
		}
		session.getTransaction().commit();
		
		System.out.println(hijos);
		
		
		MedidasSeguridadDTO msDTO = new MedidasSeguridadDTO(true, false,true,false); 
		MedidasSeguridad ms = new MedidasSeguridad(msDTO);
		
		session.beginTransaction();
		session.save(ms);
		session.getTransaction().commit();
		
		System.out.println(ms);*/
		
	/*	GestorPoliza gestorPoliza = new GestorPoliza();
		MedidasSeguridad medidasSeguridad = new MedidasSeguridad(1,true,true,false,false);
		Cuota cuota1 = new Cuota(1,1, "2010-1-1" ,1000, false,(float)0.1,(float)0.1);
		Cuota cuota2 = new Cuota(2,2, "2010-1-1" ,1000, false,(float)0.1,(float)0.1);
		Cuota cuota3 = new Cuota(3,3, "2010-1-1" ,1000, false,(float)0.1,(float)0.1);
		Cuota cuota4 = new Cuota(4,4, "2010-1-1" ,1000, false,(float)0.1,(float)0.1);
		Cuota cuota5 = new Cuota(5,5, "2010-1-1" ,1000, false,(float)0.1,(float)0.1);
		Cuota cuota6 = new Cuota(6,6, "2010-1-1" ,1000, false,(float)0.1,(float)0.1);
		Cuota cuota7 = new Cuota(7,1, "2010-1-1" ,1000, false,(float)0.1,(float)0.1);
		PolizaDTO polizaDTO = new PolizaDTO("1","Santa Fe, Santa Fe", "Ford", "Focus", 2012,"asdfg" , "asdfghj", "111AAA", 5000, 0, "cobertura", "tipoPol", "5/6/2019", "5/12/2019", "forma de pago", 0, 2019, medidas, null, null, null, null);
		gestorPoliza.altaPoliza(PolizaDTO);
		*/
	}

}
