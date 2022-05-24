package com.lombok.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.lombok.security.modelo.Usuario;

@Controller
public class UsuarioController {

	@GetMapping
	public String Index() {
		Usuario.builder().usuario("admin@").contrasena("1234").rol("administrador").build();
		//son lo mismo
		/* new Usuario(null,"admin@","1234","administrador"); */
		
		return "Index";
		
	}
}
