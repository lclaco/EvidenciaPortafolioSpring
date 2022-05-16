package com.ejemplo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HolamundospringApplicationTests {
	
	@Autowired //evita tener que instanciar
	private HolamundospringApplication holaMundo; // variable de instancia, atributo o propiedad
	
	
	
	@Test
	void contextLoads() {
		
		assertThat(holaMundo).isNotNull();
	}

}
