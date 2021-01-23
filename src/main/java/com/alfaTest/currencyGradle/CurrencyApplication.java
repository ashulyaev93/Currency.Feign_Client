package com.alfaTest.currencyGradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.io.IOException;

@SpringBootApplication
@EnableFeignClients
public class CurrencyApplication {

		public static void main(String[] args){
		SpringApplication.run(com.alfaTest.currencyGradle.CurrencyApplication.class, args);
	}
}



