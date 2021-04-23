package com.example.currency_maven;

import com.example.currency_maven.client.CurrencyAPI;
import com.example.currency_maven.domain.CurrencyStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class MainController  {

    @Autowired
    private CurrencyAPI currencyAPI;

    @RequestMapping(value = "/currency")
    public Object currency(){

        CurrencyStructure currencyStructure = currencyAPI.currencyData("47b10987e4bb45acbcc8995752f5cace");
        Map<String,Float> rates = currencyStructure.getRates();
        return "RUB: " + rates.get("RUB");
    }
}