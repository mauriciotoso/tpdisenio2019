package Entidades;

import java.util.Date;

import Enumerados.EstadoPoliza;

public class PolizaMensual extends Poliza{

	public PolizaMensual(String nroPoliza, Date vigenciaDesde, Date vigenciaHasta, String domicilioRiesgo,
			EstadoPoliza estadoPoliza, float prima, float montoTotal, float descuentoUnidad, String patente,
			String motor, String chasis, int kmAnio, int anio, float premio) {
		super(nroPoliza, vigenciaDesde, vigenciaHasta, domicilioRiesgo, estadoPoliza, prima, montoTotal, descuentoUnidad,
				patente, motor, chasis, kmAnio, anio, premio);
	}
	
}
