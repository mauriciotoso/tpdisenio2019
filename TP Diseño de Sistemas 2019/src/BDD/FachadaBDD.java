package BDD;

import java.util.List;

import DTO.*;
import Entidades.*;

public class FachadaBDD {
	
	public int getNroSiniestros(ClienteDTO cDTO) {
		GestorSubSistemaSiniestros gestorSiniestros = new GestorSubSistemaSiniestros();
		return gestorSiniestros.getNroSiniestros(cDTO);
	}
	
	public List<Pais> getPaises() {
		GestorBDD gestorBDD = new GestorBDD();
		return gestorBDD.getPaises();
	}
	
	public List<Provincia> getProvincias() {
		GestorBDD gestorBDD = new GestorBDD();
		return gestorBDD.getProvincias();
	}
	
	public List<Localidad> getLocalidades() {
		GestorBDD gestorBDD = new GestorBDD();
		return gestorBDD.getLocalidades();
	}
	
	public List<Marca> getMarcas() {
		GestorBDD gestorBDD = new GestorBDD();
		return gestorBDD.getMarcas();
	}
	
	public List<Modelo> getModelos() {
		GestorBDD gestorBDD = new GestorBDD();
		return gestorBDD.getModelos();
	}
	
	public List<Anio> getAnios() {
		GestorBDD gestorBDD = new GestorBDD();
		return gestorBDD.getAnios();
	}

}
