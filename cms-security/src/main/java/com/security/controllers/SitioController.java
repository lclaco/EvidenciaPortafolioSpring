package com.security.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SitioController {

	@GetMapping(value = {"/", "/inicio"})
	public String inicio() {
		return "inicio";
	}
	
	@GetMapping("/nosotros")
	public String nosotros() {
		return "nosotros";
	}
	
	@GetMapping("/contacto")
	public String contacto() {
		return "contacto";
	}
}
