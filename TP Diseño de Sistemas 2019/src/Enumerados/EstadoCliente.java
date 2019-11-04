package Enumerados;

public class EstadoCliente {
	
	private int idEstadoCliente;
	private String estadoCliente;
	
	public EstadoCliente(int idEstadoCliente, String estadoCliente) {
		super();
		this.idEstadoCliente = idEstadoCliente;
		this.estadoCliente = estadoCliente;
	}

	public int getIdEstadoCliente() {
		return idEstadoCliente;
	}

	public void setIdEstadoCliente(int idEstadoCliente) {
		this.idEstadoCliente = idEstadoCliente;
	}

	public String getEstadoCliente() {
		return estadoCliente;
	}

	public void setEstadoCliente(String estadoCliente) {
		this.estadoCliente = estadoCliente;
	}
	
	
	
}
