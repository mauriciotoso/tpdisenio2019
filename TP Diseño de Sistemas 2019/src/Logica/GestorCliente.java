package Logica;

import BDD.GestorBDD;
import Entidades.*;

public class GestorCliente {
	
	private static GestorCliente gestorCliente;
	
	private GestorCliente() {
		
	}
	
	public static GestorCliente getInstance() {
		if(gestorCliente == null) {
			gestorCliente = new GestorCliente();
		}
		return gestorCliente;
	}
	
	public Cliente getCliente(String nroCliente) {
		
		Cliente c=GestorBDD.getInstance().getCliente(nroCliente);
		return c;
	}

}
