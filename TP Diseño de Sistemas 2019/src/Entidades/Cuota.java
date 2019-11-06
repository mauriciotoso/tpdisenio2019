package Entidades;

import javax.persistence.*;

@Entity
public class Cuota {
	
	@Id
	private int idCuota;
	private int nroCuota;
	private String ultimoDiaPago;
	private float importeCuota;
	private boolean estaPago;
	private float recargosPorMora;
	private float bonificacion;

	public Cuota(int idCuota, int nroCuota, String ultimoDiaPago, float importeCuota, boolean estaPago,
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

	public Cuota() {
		
	}
	
	public int getNroCuota() {
		return nroCuota;
	}

	public void setNroCuota(int nroCuota) {
		this.nroCuota = nroCuota;
	}

	public String getUltimoDiaPago() {
		return ultimoDiaPago;
	}

	public void setUltimoDiaPago(String ultimoDiaPago) {
		this.ultimoDiaPago = ultimoDiaPago;
	}

	public float getImporteCuota() {
		return importeCuota;
	}

	public void setImporteCuota(float importeCuota) {
		this.importeCuota = importeCuota;
	}

	public boolean isEstePago() {
		return estaPago;
	}

	public void setEstePago(boolean estePago) {
		this.estaPago = estePago;
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
