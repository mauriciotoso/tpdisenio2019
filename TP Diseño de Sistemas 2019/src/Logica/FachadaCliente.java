package Logica;

import java.util.ArrayList;
import DTO.ClienteDTO;
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
		
		public ArrayList<ClienteDTO> buscarCliente(String nroCliente, String apellido, String nombre, TipoDocumento tipoDoc, String nroDoc) {
			ArrayList<ClienteDTO> clientesBuscados =new ArrayList<ClienteDTO>();
 			clientesBuscados= GestorCliente.getInstance().buscarCliente(nroCliente, apellido, nombre, tipoDoc, nroDoc);
			return clientesBuscados;
		}
}
