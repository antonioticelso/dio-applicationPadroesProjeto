package com.github.antonioticelso.api.dioapplicationPadroesProjeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author prado
 *
 * Projeto Spring Boot
 * Modelos adotados:
 * Spring Data JPA
 * Spring Web
 * H2
 * OpenFeing
 *
 */

@EnableFeignClients
@SpringBootApplication
public class DioApplicationPadroesProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DioApplicationPadroesProjetoApplication.class, args);
	}

}
