package com.github.antonioticelso.api.dioapplicationPadroesProjeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DioApplicationPadroesProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DioApplicationPadroesProjetoApplication.class, args);
	}

}
