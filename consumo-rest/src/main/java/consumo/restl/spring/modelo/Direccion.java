package consumo.restl.spring.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Direccion {
	
	@JsonProperty("street")
	private String calle;
	@JsonProperty("suite")
	private String departamento;
	@JsonProperty("city")
	private String ciudad;
	@JsonProperty("zipcode")
	private String codigoZip;

}
