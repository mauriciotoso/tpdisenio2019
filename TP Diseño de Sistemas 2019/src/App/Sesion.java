package App;

import BDD.FachadaBDD;

public class Sesion {
	private static Sesion sesion;
	private Usuario usuarioConectado;
	
	public static Sesion getInstance() {
		if(sesion==null) {
			sesion = new Sesion();
		}
		return sesion;
	}
	
	public Sesion() {
	}

	public Usuario getUsuarioConectado() {
		return usuarioConectado;
	}

	public void setUsuarioConectado(Usuario usuarioConectado) {
		this.usuarioConectado = usuarioConectado;
	}
	
	

}
