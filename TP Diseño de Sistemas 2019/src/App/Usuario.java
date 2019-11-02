package App;

public class Usuario {
	private String usuario;
	private String nombre;
	private String apellido;
	private String tipo;
	
	public Usuario(String usuario, String nombre,String apellido, String tipo) {
		this.usuario=usuario;
		this.nombre=nombre;
		this.apellido=apellido;
		this.tipo=tipo;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
