package com.example.currency;

import com.example.currency.client.CurrencyAPI;
import com.example.currency.domain.CurrencyStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainController {

    @Bean
    public RestTemplate currencyAPI(RestTemplateBuilder builder) {
        // Do any additional configuration here
        return builder.build();
    }

    @Autowired
    private CurrencyAPI currencyAPI;

    @RequestMapping(value = "/currency")
    public ResponseEntity<?> currency(){
        CurrencyStructure currencyStructure = currencyAPI.currencyData("47b10987e4bb45acbcc8995752f5cace");
        return new ResponseEntity<>(currencyStructure, HttpStatus.OK);
    }
}
