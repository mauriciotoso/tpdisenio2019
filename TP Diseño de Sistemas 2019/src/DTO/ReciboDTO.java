package DTO;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import App.Sesion;
import Entidades.Cuota;
import Entidades.Recibo;

public class ReciboDTO {
	
	private float importe;
	private float vuelto;
	private float importePagado;
	private String nroRecibo;
	private String operador;
	private List<CuotaDTO> cuotas=new ArrayList<>();
	private Date fechaRecibo;
	private String horaRecibo;
	
	public ReciboDTO() {
		
	}

	public ReciboDTO(float importe, float vuelto, float importePagado, String nroRecibo, String operador,
			List<CuotaDTO> cuotas, Date fechaRecibo, String horaRecibo) {
		super();
		this.importe = importe;
		this.vuelto = vuelto;
		this.importePagado = importePagado;
		this.nroRecibo = nroRecibo;
		this.operador = operador;
		this.cuotas = cuotas;
		this.fechaRecibo = fechaRecibo;
		this.horaRecibo = horaRecibo;
	}
	public ReciboDTO (float importe, float importePagado, ArrayList<CuotaDTO> cuotasDTO, long nroRecibo, Calendar hoy) {
		float vuelto = importePagado-importe;
		DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");  
		String horario = dateFormat.format(hoy.getTime());
		
		this.setImporte(importe);
		this.setImportePagado(importePagado);
		this.setVuelto(vuelto);
		this.setCuotas(cuotasDTO);
		this.setOperador(Sesion.getInstance().getUsuarioConectado().getApellido()+", "+Sesion.getInstance().getUsuarioConectado().getNombre());
		this.setNroRecibo(this.generarNroRecibo(nroRecibo));
		this.setFechaRecibo(hoy.getTime());
		this.setHoraRecibo(horario);
	}
	public ReciboDTO(Recibo r) {
		ArrayList<CuotaDTO> cuotasDTO = new ArrayList<CuotaDTO>();
		for (Cuota cuota: r.getCuotas()) {
			CuotaDTO c = new CuotaDTO(cuota);
			cuotasDTO.add(c);
		}
		this.importe = r.getImporte();
		this.vuelto = r.getVuelto();
		this.importePagado = r.getImportePagado();
		this.nroRecibo = r.getNroRecibo();
		this.operador = r.getOperador();
		this.cuotas = cuotasDTO;
		this.fechaRecibo = r.getFechaRecibo();
		this.horaRecibo = r.getHoraRecibo();
	}

	public String generarNroRecibo(long nro) {
		String nroRecibo = String.valueOf(nro);
		
		String aux="";
		for(int i=0;i<(10-nroRecibo.length());i++) {
			aux=aux+"0";
		}
		
		return aux+nroRecibo;
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

	public String getHoraRecibo() {
		return horaRecibo;
	}

	public void setHoraRecibo(String horario) {
		this.horaRecibo = horario;
	}
	
	

}
