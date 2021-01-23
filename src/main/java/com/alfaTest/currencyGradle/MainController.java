package com.alfaTest.currencyGradle;

import com.alfaTest.currencyGradle.client.CurrencyAPI;
import com.alfaTest.currencyGradle.domain.CurrencyStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class MainController implements Runnable {

    @Autowired
    private CurrencyAPI currencyAPI;
    private float rubPrevious = 0;
    private float rubCurrent = 0;

    public MainController() {
        new Thread(this).start();
    }

    @RequestMapping(value = "/currency")
    public String currency(){
//            CurrencyStructure currencyStructure = currencyAPI.currencyData("47b10987e4bb45acbcc8995752f5cace");
//        Map<String,Float> rates = currencyStructure.getRates();
//        float rub = rates.get("RUB");
//        float usd = rates.get("USD");
        System.out.println("rubPrevious:" + rubPrevious + " " + "rubCurrent:" + rubCurrent);
//        return new ResponseEntity(new Boolean(rubPrevious < rubCurrent), HttpStatus.OK);
        return rubPrevious < rubCurrent ? ":)" : ":(";
    }

    @Override
    public void run() {
        while (true){
            this.rubPrevious = this.rubCurrent;
            try {
                Thread.sleep(5*60*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            CurrencyStructure currencyStructure = currencyAPI.currencyData("47b10987e4bb45acbcc8995752f5cace");
            Map<String, Float> rates = currencyStructure.getRates();
            this.rubCurrent = rates.get("RUB");
        }
    }
}
