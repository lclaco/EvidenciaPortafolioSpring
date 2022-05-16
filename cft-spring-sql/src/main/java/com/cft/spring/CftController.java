package com.cft.spring;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cft.spring.repository.AlumnoRepository;

@Controller
public class CftController {

	@Autowired
	AlumnoRepository alumnoRepository;

	@PostMapping("/alumno")
	public String alumnoProcesar(@Valid Alumno alumno, BindingResult informeValidacion) {
	if( informeValidacion.hasErrors() ) {
	return "alumno-form"; // si hubieron errores, vuelvo a la vista del form
	}

	if( alumno.getId() == 0) {
	alumnoRepository.create(alumno);
	} else {
	alumnoRepository.edit(alumno);
	}
	return "alumno-ficha"; // si NO hubieron errores, muestro la ficha del alumno
	}
	
	@GetMapping("/")
	public String index() {
	return "index"; // nombre de la plantilla de Thymeleaf (sin .html)
	}

	@GetMapping("/alumno")
	public String alumnoForm(Alumno alumno) {
	return "alumno-form";
	}
	
}
	
