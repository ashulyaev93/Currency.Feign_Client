package com.example.currency;

import com.example.currency.client.CurrencyAPI;
import com.example.currency.domain.CurrencyStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private CurrencyAPI currencyAPI;

    @RequestMapping(value = "/currency")
    public ResponseEntity<?> currency(){
        CurrencyStructure currencyStructure = currencyAPI.currencyData("47b10987e4bb45acbcc8995752f5cace");
        return new ResponseEntity<>(currencyStructure, HttpStatus.OK);
    }
}
