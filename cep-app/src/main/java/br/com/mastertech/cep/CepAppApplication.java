package br.com.mastertech.cep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CepAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(CepAppApplication.class, args);
	}
}
