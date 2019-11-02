package App;

public class Sesion {
	private Usuario usuarioConectado;
	
	public Sesion(Usuario usuarioConectado) {
		this.usuarioConectado=usuarioConectado;
	}

	public Usuario getUsuarioConectado() {
		return usuarioConectado;
	}

	public void setUsuarioConectado(Usuario usuarioConectado) {
		this.usuarioConectado = usuarioConectado;
	}
	
	

}
