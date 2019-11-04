package Entidades;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Cuota {
	
	@Id
	private int idCuota;
	private int nroCuenta;
	private Date ultimoDiaPago;
	private float importeCuota;
	private boolean estePago;

	public Cuota(int idCuota, int nroCuenta, Date ultimoDiaPago, float importeCuota, boolean estePago) {
		super();
		this.idCuota = idCuota;
		this.nroCuenta = nroCuenta;
		this.ultimoDiaPago = ultimoDiaPago;
		this.importeCuota = importeCuota;
		this.estePago = estePago;
	}

	public int getNroCuenta() {
		return nroCuenta;
	}

	public void setNroCuenta(int nroCuenta) {
		this.nroCuenta = nroCuenta;
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

	public boolean isEstePago() {
		return estePago;
	}

	public void setEstePago(boolean estePago) {
		this.estePago = estePago;
	}

	public int getIdCuota() {
		return idCuota;
	}

	public void setIdCuota(int idCuota) {
		this.idCuota = idCuota;
	}
	
}
