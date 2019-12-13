package Logica;

import java.util.ArrayList;

import BDD.GestorBDD;
import DTO.ClienteDTO;
import Entidades.*;
import Enumerados.EstadoCliente;
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
	
	public ArrayList<ClienteDTO> buscarCliente(String nroCliente, String apellido, String nombre, TipoDocumento tipoDoc, String nroDoc) {
		
		ArrayList<Cliente> clientesBuscados = GestorBDD.getInstance().getClientes(nroCliente, apellido, nombre, tipoDoc, nroDoc);
		ArrayList<ClienteDTO> clientesObtenidosAux = new ArrayList<ClienteDTO>();
				
		for (Cliente c:clientesBuscados) {
			if (c.getTipoDocumento()==tipoDoc) {
				clientesObtenidosAux.add(new ClienteDTO(c));
			}
		}
		
		return clientesObtenidosAux;
	}
	
	public void actualizarEstado(Cliente cliente) {
		ArrayList<Poliza> nroPolizas = GestorBDD.getInstance().nroPolizas(cliente.getNroCliente());
		if(nroPolizas.size()==0) cliente.setEtadoCliente(new EstadoCliente(1,"NORMAL"));
	}
}
