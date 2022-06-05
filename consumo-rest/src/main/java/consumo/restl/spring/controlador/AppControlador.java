package consumo.restl.spring.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import consumo.restl.spring.modelo.Usuario;

@Controller
public class AppControlador {

	@GetMapping("/")
	public String usuarios(RestTemplate restTemplate, Model modelo) {
		String url = "https://jsonplaceholder.typicode.com/users";
		Usuario[] usuarios = restTemplate.getForObject(url,Usuario[].class);
		modelo.addAttribute("usuarios",usuarios);
		return "usuarios";
	}
	
	
}
