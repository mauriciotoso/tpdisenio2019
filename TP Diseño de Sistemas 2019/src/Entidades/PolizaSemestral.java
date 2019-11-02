package Entidades;

import java.util.Date;

import Enumerados.EstadoPoliza;

public class PolizaSemestral extends Poliza{

	private Date ultimoDiaPago;
	private float bonificacion;
	public PolizaSemestral(String nroPoliza, Date vigenciaDesde, Date vigenciaHasta, String domicilioRiesgo,
			EstadoPoliza estadoPoliza, float prima, float montoTotal, float descuentoUnidad, String patente,
			String motor, String chasis, int kmAnio, int anio, float premio, Date ultimoDiaPago, float bonificacion) {
		super(nroPoliza, vigenciaDesde, vigenciaHasta, domicilioRiesgo, estadoPoliza, prima, montoTotal, descuentoUnidad,
				patente, motor, chasis, kmAnio, anio, premio);
		this.setUltimoDiaPago(ultimoDiaPago);
		this.setBonificacion(bonificacion);
	}
	
	public Date getUltimoDiaPago() {
		return ultimoDiaPago;
	}
	public void setUltimoDiaPago(Date ultimoDiaPago) {
		this.ultimoDiaPago = ultimoDiaPago;
	}
	public float getBonificacion() {
		return bonificacion;
	}
	public void setBonificacion(float bonificacion) {
		this.bonificacion = bonificacion;
	}
	
}
