package DTO;

import java.util.Date;

public class CuotaDTO {
	
	private int nroCuota;
	private Date ultimoDiaPago;
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
	
	
}
