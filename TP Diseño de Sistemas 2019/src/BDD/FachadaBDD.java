package BDD;

import java.util.ArrayList;
import java.util.List;

import DTO.*;
import Entidades.*;
import Enumerados.TipoDocumento;

public class FachadaBDD {
	
	private static FachadaBDD fachadaBDD;
	
	private FachadaBDD() {
		
	}
	
	public static FachadaBDD getInstance() {
		if(fachadaBDD==null) {
			fachadaBDD = new FachadaBDD();
		}
		return fachadaBDD;
	}
	
	public float getSumaAsegurada() {
		return (new GestorSuperIntendenciaSeguros()).obtenerSumaAsegurada();
	}
	
	public ArrayList<PolizaDTO> getPolizas(String nroPoliza){
		return GestorBDD.getInstance().getPolizas(nroPoliza);
	}
	
	public int getNroSiniestros(ClienteDTO cDTO) {
		GestorSubSistemaSiniestros gestorSiniestros = new GestorSubSistemaSiniestros();
		return gestorSiniestros.getNroSiniestros(cDTO);
	}
	public List<Pais> getPaises() {
		
		return GestorBDD.getInstance().getPaises();
	}
	
	public List<Provincia> getProvincias() {
		
		return GestorBDD.getInstance().getProvincias();
	}

	public List<Provincia> getProvincias(int idpais) {
		
		return GestorBDD.getInstance().getProvincias(idpais);
	}

	
	public List<Localidad> getLocalidades() {
		
		return GestorBDD.getInstance().getLocalidades();
	}
	
	public List<Localidad> getLocalidades(int idprovincia) {
		
		return GestorBDD.getInstance().getLocalidades(idprovincia);
	}
	

	public List<Marca> getMarcas() {
	
		return GestorBDD.getInstance().getMarcas();
	}
	
	public List<Modelo> getModelos() {
		
		return GestorBDD.getInstance().getModelos();
	}
	
	public List<Modelo> getModelos(int idmarca) {
		
		return GestorBDD.getInstance().getModelos(idmarca);
	}
	
	public List<Anio> getAnios() {
		
		return GestorBDD.getInstance().getAnios();
	}

	public List<Anio> getAnios(int idModelo) {
		return GestorBDD.getInstance().getAnios(idModelo);
	}
	

	public List<TipoCobertura> getCoberturas(){
		
		return GestorBDD.getInstance().getCoberturas();
		
	}

	
	public ArrayList<ClienteDTO> getClientes(String nroCliente, String apellido, String nombre, TipoDocumento tipoDoc, String nroDoc){
		return GestorBDD.getInstance().getClientes(nroCliente,apellido,nombre,tipoDoc,nroDoc);
	}	
	
	public PolizaDTO getPoliza (String nPoliza) {
		PolizaDTO pol = new PolizaDTO(GestorBDD.getInstance().getPoliza(nPoliza));
			
		return pol;
	}

}
