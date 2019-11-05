package Entidades;

import java.util.List;

import javax.persistence.*;

@Entity
public class Recibo {
	
	@Id
	private String nroRecibo;
	private float importe;
	private float vuelto;
	private float importePagado;
	private String operador;
	private String mesAbonado;
	private String anioAbonado;
	@OneToMany
	private List<Cuota> cuotas;
	
	public Recibo(float importe, float vuelto, float importePagado, String nroRecibo, String operador,
			String mesAbonado, String anioAbonado, List<Cuota> cuotas) {
		super();
		this.importe = importe;
		this.vuelto = vuelto;
		this.importePagado = importePagado;
		this.nroRecibo = nroRecibo;
		this.operador = operador;
		this.mesAbonado = mesAbonado;
		this.anioAbonado = anioAbonado;
		this.cuotas = cuotas;
	}

	public float getImporte() {
		return importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}

	public float getVuelto() {
		return vuelto;
	}

	public void setVuelto(float vuelto) {
		this.vuelto = vuelto;
	}

	public float getImportePagado() {
		return importePagado;
	}

	public void setImportePagado(float importePagado) {
		this.importePagado = importePagado;
	}

	public String getNroRecibo() {
		return nroRecibo;
	}

	public void setNroRecibo(String nroRecibo) {
		this.nroRecibo = nroRecibo;
	}

	public String getOperador() {
		return operador;
	}

	public void setOperador(String operador) {
		this.operador = operador;
	}

	public String getMesAbonado() {
		return mesAbonado;
	}

	public void setMesAbonado(String mesAbonado) {
		this.mesAbonado = mesAbonado;
	}

	public String getAnioAbonado() {
		return anioAbonado;
	}

	public void setAnioAbonado(String anioAbonado) {
		this.anioAbonado = anioAbonado;
	}

	public List<Cuota> getCuotas() {
		return cuotas;
	}

	public void setCuotas(List<Cuota> cuotas) {
		this.cuotas = cuotas;
	}
	
	
	
}
