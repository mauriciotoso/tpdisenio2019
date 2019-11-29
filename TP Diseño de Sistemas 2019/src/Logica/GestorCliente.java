package Logica;

import java.util.ArrayList;

import BDD.GestorBDD;
import Entidades.*;
import Enumerados.TipoDocumento;

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
	
	public ArrayList<Cliente> buscarCliente(String nroCliente, String apellido, String nombre, TipoDocumento tipoDoc, String nroDoc) {
		ArrayList<Cliente> clientesBuscados =new ArrayList<Cliente>();
		clientesBuscados=GestorBDD.getInstance().getClientes(nroCliente, apellido, nombre, tipoDoc, nroDoc);
		return clientesBuscados;
	}
	
	
}
