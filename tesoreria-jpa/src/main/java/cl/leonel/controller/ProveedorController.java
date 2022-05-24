package cl.leonel.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import cl.leonel.modelo.Proveedor;
import cl.leonel.repository.ProveedorRepository;
import java.util.List;

@Controller
@RequestMapping("/proveedor")
public class ProveedorController {

	@Autowired
	ProveedorRepository proveedorRepository;
	
	@GetMapping("/editar/{id}") // mas corto
	public String editar(@PathVariable(name = "id") Proveedor proveedor, Model modelo) {
		modelo.addAttribute("proveedor",proveedor);
		return "proveedor/form";
	}
	
	/*
	 * @GetMapping("/editar/{id}") // http://localhost/alumno/editar/5 public String
	 * proveedorEditar(@PathVariable Long id, Model modelo) { Proveedor proveedor =
	 * proveedorRepository.saveAndFlush(proveedor); modelo.addAttribute("proveedor",
	 * proveedor); return "proveedor/form"; }
	 */
	
	
	@GetMapping("/nuevo")
	public String nuevo(Proveedor proveedor) {
		return "proveedor/form";
	}
	
	@PostMapping("/procesar")
	public String procesar(@Valid Proveedor proveedor, BindingResult informeValidacion) {
		if( informeValidacion.hasFieldErrors())return "proveedor/form";
		
		proveedorRepository.saveAndFlush(proveedor);//linea nueva
		return "redirect:/proveedor/listado";
	}
	
	@GetMapping("/eliminar/{id}")
	public String Eliminar(@PathVariable Long id) {
		proveedorRepository.deleteById(id);		
		return "redirect:/proveedor/listado";
	}
	
	@GetMapping("/listado")
	public String listado(Model modelo) {
		List<Proveedor> proveedores = proveedorRepository.findAll();
		modelo.addAttribute("proveedores",proveedores);
		return "proveedor/listado";
	}
}
