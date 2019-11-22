package Logica;

import App.Usuario;

public class FachadaSesion {
	
	private static FachadaSesion fachSesion;
	
	private FachadaSesion() {
		
	}
	
	public static FachadaSesion getInstance() {
		if(fachSesion == null) {
			fachSesion = new FachadaSesion();
		}
		return fachSesion;
	}
	
	public Usuario verifUserPw(String user, String pw) {

		return GestorSesion.getInstance().verifUserPw(user,pw);
	}
}
