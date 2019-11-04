package Entidades;

import java.util.Date;
import java.util.List;

import Enumerados.EstadoPoliza;

import javax.persistence.*;

@Entity
public class PolizaSemestral extends Poliza{

	private float bonificacion; 
	
	
	public PolizaSemestral(String nroPoliza, Date vigenciaDesde, Date vigenciaHasta, String domicilioRiesgo,
			EstadoPoliza estadoPoliza, float prima, float montoTotal, float descuentoUnidad, String patente,
			String motor, String chasis, int kmAnio, int anio, float premio, List<Cuota> cuotas, Anio anioModelo,
			MedidasSeguridad medidasSeguridad, List<HijoDeclarado> hijos, TipoCobertura tipoCobertura,
			SolicitudPoliza solicitudPoliza, ValoresPorcentualesPoliza valoresPorcentualesPoliza, Cliente cliente) {
		super(nroPoliza, vigenciaDesde, vigenciaHasta, domicilioRiesgo, estadoPoliza, prima, montoTotal, descuentoUnidad,
				patente, motor, chasis, kmAnio, anio, premio, cuotas, anioModelo, medidasSeguridad, hijos, tipoCobertura,
				solicitudPoliza, valoresPorcentualesPoliza, cliente);
		// TODO Auto-generated constructor stub
	}
	public float getBonificacion() {
		return bonificacion;
	}
	public void setBonificacion(float bonificacion) {
		this.bonificacion = bonificacion;
	}
	
}
