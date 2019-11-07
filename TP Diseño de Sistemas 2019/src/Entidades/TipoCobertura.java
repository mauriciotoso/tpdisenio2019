package Entidades;
import javax.persistence.*;

@Entity
public class TipoCobertura {
	
	@Id
	private int idTipoCobertura;
	@Column (name="tipoCobertura")
	private String nombre;
	private String descripcion;
	@Column (name="valorporcentualtipoCobertura")
	private float valorPorcentualCobertura;
	
	public TipoCobertura(int idTipoCobertura, String nombre, String descripcion, float valorPorcentualCobertura) {
		super();
		this.idTipoCobertura = idTipoCobertura;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.valorPorcentualCobertura = valorPorcentualCobertura;
	}
	
	public TipoCobertura() {
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getIdTipoCobertura() {
		return idTipoCobertura;
	}
	public void setIdTipoCobertura(int idTipoCobertura) {
		this.idTipoCobertura = idTipoCobertura;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public float getValorPorcentualCobertura() {
		return valorPorcentualCobertura;
	}
	public void setValorPorcentualCobertura(float valorPorcentualCobertura) {
		this.valorPorcentualCobertura = valorPorcentualCobertura;
	}

	@Override
	public String toString() {
		return "TipoCobertura [idTipoCobertura=" + idTipoCobertura + ", nombre=" + nombre + ", descripcion="
				+ descripcion + ", valorPorcentualCobertura=" + valorPorcentualCobertura + "]";
	}
	
}
