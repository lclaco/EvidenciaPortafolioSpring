package com.cft.spring.modelo;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class Carrera {
	@Min(0)
	private int id;
	@Size(min =3, max = 20)
	
	
	private String nombre;
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
	public Carrera() {
		super();
	}
	public Carrera(@Min(0) int id, @Size(min = 3, max = 20) String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	
	
}
