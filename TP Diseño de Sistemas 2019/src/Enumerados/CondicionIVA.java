package Enumerados;
import javax.persistence.*;

@Entity
public class CondicionIVA {
	
	@Id
	private int idCondicionIVA;
	private String condicionIVA;
	
	public CondicionIVA(int idCondicionIVA, String condicionIVA) {
		super();
		this.idCondicionIVA = idCondicionIVA;
		this.condicionIVA = condicionIVA;
	}

	public int getIdCondicionIVA() {
		return idCondicionIVA;
	}

	public void setIdCondicionIVA(int idCondicionIVA) {
		this.idCondicionIVA = idCondicionIVA;
	}

	public String getCondicionIVA() {
		return condicionIVA;
	}

	public void setCondicionIVA(String condicionIVA) {
		this.condicionIVA = condicionIVA;
	}
	
	

}
