package BDD;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import App.Usuario;
import DTO.*;
import Entidades.*;
import Enumerados.EstadoPoliza;
import Enumerados.TipoDocumento;

public class GestorBDD {
	private static GestorBDD gestorBDD;
	SessionFactory sessionFactory;
	Session session;
	
	private GestorBDD() {
		this.sessionFactory = new Configuration().configure().buildSessionFactory();
		this.session = sessionFactory.openSession();
	}
	
	public static GestorBDD getInstance() {
		if(gestorBDD==null) {
			gestorBDD = new GestorBDD();
		}
		return gestorBDD;
	}

	public List<Pais> getPaises(){

		if(!session.isJoinedToTransaction()) session.beginTransaction();
		
		@SuppressWarnings("unchecked")
		List<Pais> paises = session.createQuery("from Pais").getResultList();
		session.getTransaction().commit();
		
		return paises;
		
	}
	
	public List<Provincia> getProvincias(){

		if(!session.isJoinedToTransaction()) session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<Provincia> provincias = session.createQuery("from Provincia").getResultList();
		session.getTransaction().commit();
		
		return provincias;
		
	}
	
	public List<Localidad> getLocalidades(){

		if(!session.isJoinedToTransaction()) session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<Localidad> localidades = session.createQuery("from Localidad").getResultList();
		session.getTransaction().commit();
		
		return localidades;
		
	}
	
	public List<Marca> getMarcas(){

		if(!session.isJoinedToTransaction()) session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<Marca> marcas = session.createQuery("from Marca").getResultList();
		session.getTransaction().commit();
		
		return marcas;
		
	}
	
	public List<Modelo> getModelos(){

		if(!session.isJoinedToTransaction()) session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<Modelo> modelos = session.createQuery("from Modelo").getResultList();
		session.getTransaction().commit();
		
		return modelos;
	}
	
	public List<Anio> getAnios(){

		if(!session.isJoinedToTransaction()) session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<Anio> anios = session.createQuery("from Anio").getResultList();
		session.getTransaction().commit();
		
		return anios;
		
	}
	
	public int validarIDs(PolizaDTO polDTO) {
		
		if(!session.isJoinedToTransaction()) session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<Poliza> listaPolizas = session.createQuery
				("from Poliza p "
				+ "where (p.patente='"+polDTO.getPatente()+"' "
				+ "or p.motor='"+polDTO.getMotor()+"' "
				+ "or p.chasis='"+polDTO.getChasis()+"') and p.estadoPoliza=1").getResultList();
		session.getTransaction().commit();

		int val=listaPolizas.size();
		System.out.println(val);
		return val;
	}
	
	public Cliente getCliente(String nroCliente) {
		
		if(!session.isJoinedToTransaction()) session.beginTransaction();
		Cliente c = session.get(Cliente.class, nroCliente);
		session.getTransaction().commit();
		
		return c;
	}
	
	public Anio getAnio(PolizaDTO polDTO){
		
		if(!session.isJoinedToTransaction()) session.beginTransaction();
		Anio anio =  session.get(Anio.class, polDTO.getIdAnioModelo());
		session.getTransaction().commit();
		
		return anio;
	}
	

	public Localidad getLocalidad(PolizaDTO polDTO){
		
		
		if(!session.isJoinedToTransaction()) session.beginTransaction();
		Localidad loc = session.get(Localidad.class, polDTO.getIdlocalidad());
		session.getTransaction().commit();
		
		return loc;
	}
	
	public TipoCobertura getTipoCobertura(PolizaDTO polDTO) {
		
		if(!session.isJoinedToTransaction()) session.beginTransaction();
		TipoCobertura tc =  session.get(TipoCobertura.class, polDTO.getIdTipoCobertura());
		session.getTransaction().commit();
		
		return tc;
	}
	
	public EstadoPoliza getEstadoPoliza(PolizaDTO polDTO) {
		if(!session.isJoinedToTransaction()) session.beginTransaction();
		EstadoPoliza ep = session.get(EstadoPoliza.class,polDTO.getIdEstadoPoliza());
		session.getTransaction().commit();
		
		return ep;
	}
	
	public ValoresPorcentualesActuales getVPA() {
		if(!session.isJoinedToTransaction()) session.beginTransaction();
		ValoresPorcentualesActuales vpa = session.get(ValoresPorcentualesActuales.class, 1);
		session.getTransaction().commit();
		
		return vpa;
	}
	
	public void guardarPoliza(Poliza poliza) {
		if(!session.isJoinedToTransaction()) session.beginTransaction();
		
		session.save(poliza.getMedidasSeguridad());
		session.save(poliza.getValoresPorcentualesPoliza());
		session.save(poliza);
		
		session.getTransaction().commit();
	}
	
	public ClienteDTO getCliente() {
		if(!session.isJoinedToTransaction()) session.beginTransaction();
		Cliente c = session.get(Cliente.class, "1");
		session.getTransaction().commit();
		System.out.println(c);
		ClienteDTO cDTO = new ClienteDTO(c);
		
		return cDTO;
	}
	
	public Poliza getPoliza(PolizaDTO polDTO) {
		if (!session.isJoinedToTransaction()) session.beginTransaction();
		Poliza pol = session.get(Poliza.class, polDTO.getNroPoliza());
		session.getTransaction().commit();
		
		return pol;
	}
	
	public Poliza getPoliza(String nroPoliza) {
		if (!session.isJoinedToTransaction()) session.beginTransaction();
		Poliza pol = session.get(Poliza.class, nroPoliza);
		session.getTransaction().commit();
		
		return pol;
	}
	
	public void actualizarCuotas(Poliza pol, ArrayList<Cuota> cuotas) {
		if (!session.isJoinedToTransaction()) session.beginTransaction();
		for(Cuota c: cuotas) {
			session.delete(c);
			session.save(c);
		}
		session.getTransaction().commit();
		/*session.createQuery
		("delete from cuota using poliza where cuota.nropoliza=poliza.nropoliza");*/
	}
	
	public void guardarRecibo(Recibo recibo) {
		if (!session.isJoinedToTransaction()) session.beginTransaction();
		session.save(recibo);
		session.getTransaction().commit();
	}
	
	public ArrayList<Usuario> getUsuario(){
		if (!session.isJoinedToTransaction()) session.beginTransaction();
		@SuppressWarnings("unchecked")
		ArrayList<Usuario> usuarios = (ArrayList<Usuario>) session.createQuery("from Usuario").getResultList();
		session.getTransaction().commit();
		
		return usuarios;
	}
	

	public List<Provincia> getProvincias(int idpais){

		if(!session.isJoinedToTransaction()) session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<Provincia> provincias = session.createQuery("from Provincia where pais="+idpais+"").getResultList();
		session.getTransaction().commit();
		
		return provincias;
		
	}
	
	public List<Localidad> getLocalidades(int idprovincia){

		if(!session.isJoinedToTransaction()) session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<Localidad> localidades = session.createQuery("from Localidad where idprovincia="+idprovincia+"").getResultList();
		session.getTransaction().commit();
		
		return localidades;
		
	}

	public List<Modelo> getModelos(int idmarca){

		if(!session.isJoinedToTransaction()) session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<Modelo> modelos = session.createQuery("from Modelo where idmarca="+idmarca+"").getResultList();
		session.getTransaction().commit();
		
		return modelos;
	}
	
	public List<Anio> getAnios(int idmodelo){

		if(!session.isJoinedToTransaction()) session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<Anio> anios = session.createQuery("from Anio where idmodelo="+idmodelo+"").getResultList();
		session.getTransaction().commit();
		
		return anios;
		
	}

	public ArrayList<TipoCobertura> getCoberturas(){
		
		if (!session.isJoinedToTransaction()) session.beginTransaction();
		@SuppressWarnings("unchecked")
		ArrayList<TipoCobertura> coberturas = (ArrayList<TipoCobertura>) session.createQuery("from TipoCobertura").getResultList();
		session.getTransaction().commit();
		
		return coberturas;
		
	}
	
	public ArrayList<ClienteDTO> getClientes(String nroCliente, String apellido, String nombre, TipoDocumento tipoDoc, String nroDoc){
		
		if(!session.isJoinedToTransaction()) session.beginTransaction();
		
		@SuppressWarnings("unchecked")
		ArrayList<Cliente> clientesObtenidos = (ArrayList<Cliente>) session.createQuery(
				"from Cliente "
				+ "where nroCliente like '%"+nroCliente+"%'"
				+ " and nombre like '"+nombre+"%'"
				+ " and apellido like '"+apellido+"%'"
				+ " and nroDocumento like '%"+nroDoc+"%'"
				+ " and estadoCliente=2"
				).getResultList();
		
		session.getTransaction().commit();
		
		ArrayList<ClienteDTO> clientesObtenidosAux = new ArrayList<ClienteDTO>();
				
		for (Cliente c:clientesObtenidos) {
			if (c.getTipoDocumento()==tipoDoc) {
				clientesObtenidosAux.add(new ClienteDTO(c));
			}
		}
		
		return clientesObtenidosAux;
	}
		
	public ArrayList<PolizaDTO> getPolizas(String nroPoliza){
		
		if(!session.isJoinedToTransaction()) session.beginTransaction();
		
		@SuppressWarnings("unchecked")
		ArrayList<Poliza> polizas = (ArrayList<Poliza>) session.createQuery(
				"from Poliza "
				+ "where nroPoliza like '%"+nroPoliza+"%'"
				).getResultList();
		
		session.getTransaction().commit();
		
		ArrayList<PolizaDTO> polizasDTO = new ArrayList<PolizaDTO>();
				
		for (Poliza p:polizas) {
			polizasDTO.add(new PolizaDTO(p));
		}
		
		return polizasDTO;
	}
	
	
	public long nextNroPoliza() {
		
		if(!session.isJoinedToTransaction()) session.beginTransaction();
		
		NativeQuery<?> query = session.createSQLQuery( "select nextval('nropoliza')" );
		Long key = ((BigInteger) query.uniqueResult()).longValue();
		session.getTransaction().commit();
		
	    return key;
	}
	
	public ArrayList<Poliza> nroPolizas(String nroCliente) {

		if(!session.isJoinedToTransaction()) session.beginTransaction();
		
		@SuppressWarnings("unchecked")
		ArrayList<Poliza> polizas = (ArrayList<Poliza>) session.createQuery(
				"from Poliza "
				+ "where nroCliente='"+nroCliente+"'"
				).getResultList();
		
		session.getTransaction().commit();
		
		return polizas;
	}

}
