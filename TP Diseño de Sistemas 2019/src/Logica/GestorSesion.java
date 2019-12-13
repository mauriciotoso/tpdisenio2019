package Logica;

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
		return GestorBDD.getInstance().getUsuario(user,pw);
	}
}
