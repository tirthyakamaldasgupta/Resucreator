package com.resucreator.resucreator;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class ResucreatorApplication {
	public static void main(String[] args) {
		SpringApplication.run(ResucreatorApplication.class, args);
	}

}
