package com.cft.spring.modelo;

import java.time.LocalDate;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;





public class Alumno {

	@Min(0)
	private int id;
	@Size(min =3, max = 20)
	private String nombre;
	@Min(value = 18, message="Debe ser mayor de edad")
	private LocalDate fechaNacimiento;
	private Carrera Carrera;
	
	public Alumno() {
		super();
	}

	public Alumno(@Min(0) int id, @Size(min = 3, max = 20) String nombre,
			@Min(value = 18, message = "Debe ser mayor de edad") LocalDate fechaNacimiento,
			com.cft.spring.modelo.Carrera carrera) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		Carrera = carrera;
	}

	public Alumno(@Size(min = 3, max = 20) String nombre,
			@Min(value = 18, message = "Debe ser mayor de edad") LocalDate fechaNacimiento,
			com.cft.spring.modelo.Carrera carrera) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		Carrera = carrera;
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

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Carrera getCarrera() {
		return Carrera;
	}

	public void setCarrera(Carrera carrera) {
		Carrera = carrera;
	}
	
	
}
