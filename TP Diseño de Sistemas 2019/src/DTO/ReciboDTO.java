package DTO;

import java.util.Date;
import java.util.List;

public class ReciboDTO {
	
	private float importe;
	private float vuelto;
	private float importePagado;
	private String nroRecibo;
	private String operador;
	private int mesAbonado;
	private String anioAbonado;
	private List<CuotaDTO> cuotas;
	private Date fechaRecibo;
	private Date horaRecibo;

	public ReciboDTO(float importe, float vuelto, float importePagado, String nroRecibo, String operador,
			int mesAbonado, String anioAbonado, List<CuotaDTO> cuotas, Date fechaRecibo, Date horaRecibo) {
		super();
		this.importe = importe;
		this.vuelto = vuelto;
		this.importePagado = importePagado;
		this.nroRecibo = nroRecibo;
		this.operador = operador;
		this.mesAbonado = mesAbonado;
		this.anioAbonado = anioAbonado;
		this.cuotas = cuotas;
		this.fechaRecibo = fechaRecibo;
		this.horaRecibo = horaRecibo;
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

	public int getMesAbonado() {
		return mesAbonado;
	}

	public void setMesAbonado(int mesAbonado) {
		this.mesAbonado = mesAbonado;
	}

	public String getAnioAbonado() {
		return anioAbonado;
	}

	public void setAnioAbonado(String anioAbonado) {
		this.anioAbonado = anioAbonado;
	}

	public List<CuotaDTO> getCuotas() {
		return cuotas;
	}

	public void setCuotas(List<CuotaDTO> cuotas) {
		this.cuotas = cuotas;
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
