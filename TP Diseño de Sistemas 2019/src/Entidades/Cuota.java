package Entidades;

import java.util.Date;

public class Cuota {

	private int nroCuenta;
	private Date ultimoDiaPago;
	private float importeCuota;
	private boolean estePago;
	
	public Cuota(int nroCuenta, Date ultimoDiaPago, float importeCuota, boolean estePago) {
		super();
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
	
	
}
