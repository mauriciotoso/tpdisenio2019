package BDD;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import DTO.*;
import Entidades.*;
import Enumerados.EstadoPoliza;

public class GestorBDD {
	
	SessionFactory sessionFactory;
	Session session;
	
	public GestorBDD() {
		this.sessionFactory = new Configuration().configure().buildSessionFactory();
		this.session = sessionFactory.openSession();
	}
	
	public int validarIDs(PolizaDTO polDTO) {
		
		session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<PolizaMensual> listaPolizas1 = session.createQuery
				("from PolizaMensual p "
				+ "where (p.patente='"+polDTO.getPatente()+"' "
				+ "or p.motor='"+polDTO.getMotor()+"' "
				+ "or p.chasis='"+polDTO.getChasis()+"') and p.estadoPoliza=1").getResultList();
		
		@SuppressWarnings("unchecked")
		List<PolizaSemestral> listaPolizas2 = session.createQuery
				("from PolizaSemestral p "
				+ "where (p.patente='"+polDTO.getPatente()+"' "
				+ "or p.motor='"+polDTO.getMotor()+"' "
				+ "or p.chasis='"+polDTO.getChasis()+"') and p.estadoPoliza=1").getResultList();
		session.getTransaction().commit();
		
		return listaPolizas1.size() + listaPolizas2.size();
	}
	
	public Cliente getCliente(String nroCliente) {
		
		session.beginTransaction();
		Cliente c = session.get(Cliente.class, nroCliente);
		session.getTransaction().commit();
		
		return c;
	}
	
	public Anio getAnio(PolizaDTO polDTO){
		
		session.beginTransaction();
		
		@SuppressWarnings("unchecked")
		List<Anio> anios = session.createQuery
		("from Anio a where a.anio="+polDTO.getAnio()+" ").getResultList();
		
		for(Anio a:anios) {
			if(a.getModelo().getNombre().compareTo(polDTO.getModelo())==0 && a.getModelo().getMarca().getMarca().compareTo(polDTO.getMarca())==0) {
				return a;
			}
		}
		
		session.getTransaction().commit();
		
		return new Anio();
	}
	

	public Localidad getLocalidad(PolizaDTO polDTO){
		
		session.beginTransaction();
		
		@SuppressWarnings("unchecked")
		List<Localidad> localidades = session.createQuery
		("from Localidad l where l.nombre='"+polDTO.getLocalidad()+"' ").getResultList();
		
		for(Localidad l:localidades) {
			if(l.getProvincia().getNombre().compareTo(polDTO.getProvincia())==0 && l.getProvincia().getPais().getNombre().compareTo(polDTO.getPais())==0) {
				return l;
			}
		}
		
		session.getTransaction().commit();
		
		return new Localidad();
	}
	
	public TipoCobertura getTipoCobertura(PolizaDTO polDTO) {
		
		session.beginTransaction();
		
		@SuppressWarnings("unchecked")
		List<TipoCobertura> coberturas = session.createQuery
		("from TipoCobertura t where t.nombre='"+polDTO.getTipoCobertura()+"' ").getResultList();
		
		for(TipoCobertura t:coberturas) {
			if(t.getNombre().compareTo(polDTO.getTipoCobertura())==0) {
				return t;
			}
		}
		
		session.getTransaction().commit();
		
		return new TipoCobertura();
	}
	
	public EstadoPoliza getEstadoPoliza(PolizaDTO polDTO) {
		session.beginTransaction();
		
		@SuppressWarnings("unchecked")
		List<EstadoPoliza> estadoPoliza = session.createQuery
		("from EstadoPoliza ep where ep.estadoPoliza='"+polDTO.getEstadoPoliza()+"' ").getResultList();
		
		for (EstadoPoliza ep:estadoPoliza) {
			if(ep.getEstadoPoliza().compareTo(polDTO.getEstadoPoliza())==0)
				return ep;
		}
		
		session.getTransaction().commit();
		
		return null;
	}
	
	public ValoresPorcentualesActuales getVPA() {
		session.beginTransaction();
		ValoresPorcentualesActuales vpa = session.get(ValoresPorcentualesActuales.class, 1);
		session.getTransaction().commit();
		
		return vpa;
	}
	
	public void guardarPoliza(PolizaMensual poliza) {
		session.beginTransaction();
		session.save(poliza);
		session.getTransaction().commit();
	}
	
	public void guardarPoliza(PolizaSemestral poliza) {
		session.beginTransaction();
		session.save(poliza);
		session.getTransaction().commit();
	}
	
	public ClienteDTO getCliente() {
		session.beginTransaction();
		Cliente c = session.get(Cliente.class, "1");
		session.getTransaction().commit();
		
		ClienteDTO cDTO = new ClienteDTO(c);
		
		return cDTO;
	}
}
