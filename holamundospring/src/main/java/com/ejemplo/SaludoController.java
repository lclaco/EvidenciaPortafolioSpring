package com.ejemplo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class SaludoController {

	@GetMapping("/saludo")
	/*public String Saludar() {		
		return "saludo";}*/
		
		
		  /*public String Saludar( Model model) 
	{ model.addAttribute("nombre","Leo"); 
	return "saludo";		 
	}*/
	
	public String Saludar(@RequestParam(name = "nombre", defaultValue = "Mundo") String nombre, Model modelo) {
		modelo.addAttribute("nombre", nombre);
		return "saludo";
		}
		 
	

}
