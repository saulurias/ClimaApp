package mx.itson.clima.nucleo.entidades;

import java.util.List;

public class Ciudad {
	int id;
	String nombre;
	List<Clima> climas;
	
	public Ciudad(int id, String nombre, List<Clima> climas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.climas = climas;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Clima> getClimas() {
		return climas;
	}
	public void setClimas(List<Clima> climas) {
		this.climas = climas;
	}
}
