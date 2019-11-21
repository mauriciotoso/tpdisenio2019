package Entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import DTO.ReciboDTO;

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
	private Date fechaRecibo;
	private Date horaRecibo;
	@OneToMany
	private List<Cuota> cuotas;
	
	public Recibo(String nroRecibo, float importe, float vuelto, float importePagado, String operador,
			String mesAbonado, String anioAbonado, Date fechaRecibo, Date horaRecibo, List<Cuota> cuotas) {
		super();
		this.nroRecibo = nroRecibo;
		this.importe = importe;
		this.vuelto = vuelto;
		this.importePagado = importePagado;
		this.operador = operador;
		this.mesAbonado = mesAbonado;
		this.anioAbonado = anioAbonado;
		this.fechaRecibo = fechaRecibo;
		this.horaRecibo = horaRecibo;
		this.cuotas = cuotas;
	}
	
	public Recibo (ReciboDTO r) {
		super();
		this.nroRecibo = r.getNroRecibo();
		this.importe = r.getImporte();
		this.vuelto = r.getVuelto();
		this.importePagado = r.getImportePagado();
		this.operador = r.getOperador();
		this.mesAbonado = r.getMesAbonado();
		this.anioAbonado = r.getAnioAbonado();
		this.fechaRecibo = r.getFechaRecibo();
		this.horaRecibo = r.getHoraRecibo();
		
	}

	public Recibo() {
		
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
	
	public void setCuotas(Cuota cuota) {
		this.cuotas.add(cuota);
	}

	public Date getFechaRecibo() {
		return fechaRecibo;
	}

	public void setFechaRecibo(Date fechaRecibo) {
		this.fechaRecibo = fechaRecibo;
	}

	public Date getHoraRecibo() {
		return horaRecibo;
	}

	public void setHoraRecibo(Date horaRecibo) {
		this.horaRecibo = horaRecibo;
	}
	
	
	
}
