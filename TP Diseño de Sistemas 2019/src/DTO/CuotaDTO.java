package DTO;

import java.util.Date;

import Entidades.Cuota;

public class CuotaDTO {
	
	private int idCuota;
	private int nroCuota;
	private Date ultimoDiaPago;
	private boolean  estaPago;
	private float importeCuota;
	private float recargosPorMora;
	private float bonificacion;

	public CuotaDTO(int nroCuota, Date ultimoDiaPago, float importeCuota, float recargosPorMora, float bonificacion) {
		super();
		this.nroCuota = nroCuota;
		this.ultimoDiaPago = ultimoDiaPago;
		this.importeCuota = importeCuota;
		this.recargosPorMora = recargosPorMora;
		this.bonificacion = bonificacion;
	}
	
	public CuotaDTO(Cuota c) {
		this.nroCuota = c.getNroCuota();
		this.ultimoDiaPago = c.getUltimoDiaPago();
		this.estaPago = c.isEstaPago();
		this.importeCuota = c.getImporteCuota();
		this.recargosPorMora = c.getRecargosPorMora();
		this.bonificacion = c.getBonificacion();
	}

	@Override
	public String toString() {
		return "CuotaDTO [nroCuota=" + nroCuota + ", ultimoDiaPago=" + ultimoDiaPago + ", importeCuota=" + importeCuota
				+ ", recargosPorMora=" + recargosPorMora + ", bonificacion=" + bonificacion + "]";
	}

	
	public int getIdCuota() {
		return idCuota;
	}

	public void setIdCuota(int idCuota) {
		this.idCuota = idCuota;
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

	public boolean isEstaPago() {
		return estaPago;
	}

	public void setEstaPago(boolean estaPago) {
		this.estaPago = estaPago;
	}
	
	
}
