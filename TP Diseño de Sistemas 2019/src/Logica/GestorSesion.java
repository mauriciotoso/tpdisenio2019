package Logica;

import java.util.ArrayList;

import App.Usuario;
import BDD.GestorBDD;

public class GestorSesion {
	
	private static GestorSesion gestorSesion;
	
	private GestorSesion() {
		
	}
	
	public static GestorSesion getInstance() {
		if(gestorSesion == null) {
			gestorSesion = new GestorSesion();
		}
		return gestorSesion;
	}
	
	public Usuario verifUserPw(String user, String pw) {
		ArrayList<Usuario> usuarios = GestorBDD.getInstance().getUsuario();

		for(Usuario u: usuarios) {
			if(u.getUsuario().compareTo(user)==0 && u.getContrasenia().compareTo(pw)==0)
				return u;
		}
		return null;
	}
}
