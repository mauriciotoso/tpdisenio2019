package Logica;

import java.util.ArrayList;

import Entidades.Cliente;
import Enumerados.TipoDocumento;

public class FachadaCliente {
			private static FachadaCliente fachCliente;
			
		private FachadaCliente() {
			
		}
		
		public static FachadaCliente getInstance() {
			if(fachCliente == null) {
				fachCliente = new FachadaCliente();
			}
			return fachCliente;
		}
		
		public ArrayList<Cliente> buscarCliente(String nroCliente, String apellido, String nombre, TipoDocumento tipoDoc, String nroDoc) {
			ArrayList<Cliente> clientesBuscados =new ArrayList<Cliente>();
 			clientesBuscados= GestorCliente.getInstance().buscarCliente(nroCliente, apellido, nombre, tipoDoc, nroDoc);
			return clientesBuscados;
		}
}
