package consumo.restl.spring.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//https://jsonplaceholder.typicode.com/users 
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Usuario {

private Long id;
@JsonProperty("name")
private String nombre;
private String username;
private String email;
@JsonProperty("phone")
private String telefono;
private String website;
@JsonProperty("")
private Direccion direccion;

}
