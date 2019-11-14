package Logica;

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
}
