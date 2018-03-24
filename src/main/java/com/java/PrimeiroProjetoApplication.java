package com.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.java.config.property.PropertyApiProperty;

@SpringBootApplication
@EnableConfigurationProperties(PropertyApiProperty.class)
public class PrimeiroProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeiroProjetoApplication.class, args);
	}
}
