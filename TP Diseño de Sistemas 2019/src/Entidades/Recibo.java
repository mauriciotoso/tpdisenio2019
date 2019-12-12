package Entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

import DTO.CuotaDTO;
import DTO.ReciboDTO;

@Entity
public class Recibo {
	
	@Id
	private String nroRecibo;
	private float importe;
	private float vuelto;
	@Column (name="importepagado")
	private float importePagado;
	@Column (name="usuario")
	private String operador;
	@Column (name="fechapago")
	private Date fechaRecibo;
	@Column (name="horapago")
	private String horaRecibo;
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "recibo")
	private List<Cuota> cuotas=new ArrayList<>();
	
	public Recibo(String nroRecibo, float importe, float vuelto, float importePagado, String operador,
			Date fechaRecibo, String horaRecibo, List<Cuota> cuotas) {
		super();
		this.nroRecibo = nroRecibo;
		this.importe = importe;
		this.vuelto = vuelto;
		this.importePagado = importePagado;
		this.operador = operador;
		this.fechaRecibo = fechaRecibo;
		this.horaRecibo = horaRecibo;//(fechaRecibo.getHours(), fechaRecibo.getMinutes(), fechaRecibo.getSeconds());
		this.cuotas = cuotas;
	}
	
	public Recibo (ReciboDTO r) {
		super();
		this.nroRecibo = r.getNroRecibo();
		this.importe = r.getImporte();
		this.vuelto = r.getVuelto();
		this.importePagado = r.getImportePagado();
		this.operador = r.getOperador();
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

	public String getHoraRecibo() {
		return horaRecibo;
	}

	public void setHoraRecibo(int hora, int minutos, int segundos) {
		this.horaRecibo = hora+":"+minutos+":"+segundos;
	}

	@Override
	public String toString() {
		return "Recibo [nroRecibo=" + nroRecibo + ", importe=" + importe + ", vuelto=" + vuelto + ", importePagado="
				+ importePagado + ", operador=" + operador + ", fechaRecibo=" + fechaRecibo + ", horaRecibo="
				+ horaRecibo + ", cuotas=" + cuotas + "]";
	}
	
	
	
}
