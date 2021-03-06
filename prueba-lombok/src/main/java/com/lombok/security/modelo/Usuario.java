package com.lombok.security.modelo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Usuario {
	
	private Long id;
	private String usuario;
	private String contrasena;
	private String rol;

}
