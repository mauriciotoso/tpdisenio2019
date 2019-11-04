package Enumerados;

public class EstadoPoliza {
	
	private int idEstadoPoliza;
	private String estadoPoliza;
	
	public EstadoPoliza(int idEstadoPoliza, String estadoPoliza) {
		super();
		this.idEstadoPoliza = idEstadoPoliza;
		this.estadoPoliza = estadoPoliza;
	}

	public int getIdEstadoPoliza() {
		return idEstadoPoliza;
	}

	public void setIdEstadoPoliza(int idEstadoPoliza) {
		this.idEstadoPoliza = idEstadoPoliza;
	}

	public String getEstadoPoliza() {
		return estadoPoliza;
	}

	public void setEstadoPoliza(String estadoPoliza) {
		this.estadoPoliza = estadoPoliza;
	}
}
