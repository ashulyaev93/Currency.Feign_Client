package com.example.currency_maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
	@EnableFeignClients
public class CurrencyMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyMavenApplication.class, args);
	}
}
