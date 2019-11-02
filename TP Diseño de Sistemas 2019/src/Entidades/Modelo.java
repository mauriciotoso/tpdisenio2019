package Entidades;

import java.util.ArrayList;

public class Modelo {

	private String nombre;
	private ArrayList<Integer> posiblesAnios;
	
	public Modelo(String nombre, ArrayList<Integer> posiblesAnios) {
		super();
		this.nombre = nombre;
		this.posiblesAnios = posiblesAnios;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Integer> getPosiblesAnios() {
		return posiblesAnios;
	}

	public void setPosiblesAnios(ArrayList<Integer> posiblesAnios) {
		this.posiblesAnios = posiblesAnios;
	}
	
	
}
