package Logica;

import BDD.GestorBDD;
import Entidades.*;

public class GestorCliente {
	
	public Cliente getCliente(String nroCliente) {
		
		GestorBDD gestorBDD = new GestorBDD();
		Cliente c=gestorBDD.getCliente(nroCliente);
		return c;
	}

}
