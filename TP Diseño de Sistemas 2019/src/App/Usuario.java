package App;

import javax.persistence.*;

@Entity
@Table (name="usuario")
public class Usuario {
	
	@Id
	private String usuario;
	private String contrasenia;
	private String nombre;
	private String apellido;
	private String tipo;
	
	public Usuario(String usuario, String nombre,String apellido, String tipo) {
		this.usuario=usuario;
		this.nombre=nombre;
		this.apellido=apellido;
		this.tipo=tipo;
	}
	
	public Usuario() {
		
	}
	
	@Override
	public String toString() {
		return "Usuario [usuario=" + usuario + ", contrasenia=" + contrasenia + ", nombre=" + nombre + ", apellido="
				+ apellido + ", tipo=" + tipo + "]";
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

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	
	
}
