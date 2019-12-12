package Entidades;

import java.util.Date;
import javax.persistence.*;
import DTO.*;

@Entity
public class Cuota {
	
	@Id
	@SequenceGenerator(name="seq-gen",sequenceName="sec_idcuota", initialValue=1, allocationSize=1)
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq-gen")
	private int idCuota;
	private int nroCuota;
	private Date ultimoDiaPago;
	private float importeCuota;
	private boolean estaPago;
	private float recargosPorMora;
	private float bonificacion;
	private Date fechaPago;
	
	public Date getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
	}

	public Cuota(int idCuota, int nroCuota, Date ultimoDiaPago, float importeCuota, boolean estaPago,
			float recargosPorMora, float bonificacion) {
		super();
		this.idCuota = idCuota;
		this.nroCuota = nroCuota;
		this.ultimoDiaPago = ultimoDiaPago;
		this.importeCuota = importeCuota;
		this.estaPago = estaPago;
		this.recargosPorMora = recargosPorMora;
		this.bonificacion = bonificacion;
	}
	
	public Cuota(int nroCuota, Date ultimoDiaPago, float importeCuota, boolean estaPago,
			float recargosPorMora, float bonificacion) {
		this.nroCuota = nroCuota;
		this.ultimoDiaPago = ultimoDiaPago;
		this.importeCuota = importeCuota;
		this.estaPago = estaPago;
		this.recargosPorMora = recargosPorMora;
		this.bonificacion = bonificacion;
	}

	public Cuota() {
		
	}
	
	@Override
	public String toString() {
		return "Cuota [idCuota=" + idCuota + ", nroCuota=" + nroCuota + ", ultimoDiaPago=" + ultimoDiaPago
				+ ", importeCuota=" + importeCuota + ", estaPago=" + estaPago + ", recargosPorMora=" + recargosPorMora
				+ ", bonificacion=" + bonificacion + ", fechaPago=" + fechaPago + "]";
	}

	public Cuota(CuotaDTO c) {
		
		this.nroCuota = c.getNroCuota();
		this.ultimoDiaPago = c.getUltimoDiaPago();
		this.importeCuota = c.getImporteCuota();
		this.estaPago = false;
		this.recargosPorMora = c.getRecargosPorMora();
		this.bonificacion = c.getBonificacion();
	
	}
	
	public int getNroCuota() {
		return nroCuota;
	}

	public void setNroCuota(int nroCuota) {
		this.nroCuota = nroCuota;
	}

	public Date getUltimoDiaPago() {
		return ultimoDiaPago;
	}

	public void setUltimoDiaPago(Date ultimoDiaPago) {
		this.ultimoDiaPago = ultimoDiaPago;
	}

	public float getImporteCuota() {
		return importeCuota;
	}

	public void setImporteCuota(float importeCuota) {
		this.importeCuota = importeCuota;
	}

	public int getIdCuota() {
		return idCuota;
	}

	public void setIdCuota(int idCuota) {
		this.idCuota = idCuota;
	}

	public boolean isEstaPago() {
		return estaPago;
	}

	public void setEstaPago(boolean estaPago) {
		this.estaPago = estaPago;
	}

	public float getRecargosPorMora() {
		return recargosPorMora;
	}

	public void setRecargosPorMora(float recargosPorMora) {
		this.recargosPorMora = recargosPorMora;
	}

	public float getBonificacion() {
		return bonificacion;
	}

	public void setBonificacion(float bonificacion) {
		this.bonificacion = bonificacion;
	}
	
	
}
