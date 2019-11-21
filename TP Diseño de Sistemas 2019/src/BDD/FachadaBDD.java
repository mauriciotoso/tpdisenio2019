package BDD;

import java.util.List;

import DTO.*;
import Entidades.*;

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
	
	public List<Localidad> getLocalidades() {
		
		return GestorBDD.getInstance().getLocalidades();
	}
	
	public List<Marca> getMarcas() {
	
		return GestorBDD.getInstance().getMarcas();
	}
	
	public List<Modelo> getModelos() {
		
		return GestorBDD.getInstance().getModelos();
	}
	
	public List<Anio> getAnios() {
		
		return GestorBDD.getInstance().getAnios();
	}

}
