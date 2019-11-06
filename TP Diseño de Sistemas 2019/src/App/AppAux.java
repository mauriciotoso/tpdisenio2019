package App;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import DTO.*;
import Entidades.*;
import Logica.*;

public class AppAux {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
	
		String loc="La Capital";
		String prov="Santa Fe";
		String pais="Argentina";
		
		@SuppressWarnings("unchecked")
		List<Localidad> localidades = session.createQuery
		("from Localidad l where l.nombre='"+loc+"' ").getResultList();
		
		Localidad local = null;
		for(Localidad l:localidades) {
			if(l.getProvincia().getNombre().compareTo(prov)==0 && l.getProvincia().getPais().getNombre().compareTo(pais)==0) {
				local= l;
			}
		}
		
		System.out.println(local);
		
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
