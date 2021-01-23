package com.alfaTest.currencyGradle.domain;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "disclaimer",
        "license",
        "timestamp",
        "base",
        "rates"
})

public class CurrencyStructure {
    @JsonIgnore
    private String disclaimer;
    @JsonIgnore
    private String license;
    @JsonIgnore
    private Long timestamp;
    @JsonIgnore
    private String base;
    @JsonProperty("rates")
    private Map<String, Float> rates = new HashMap<String, Float>();

    @JsonProperty("disclaimer")
    public String getDisclaimer() {
        return disclaimer;
    }

    @JsonProperty("disclaimer")
    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

    @JsonProperty("license")
    public String getLicense() {
        return license;
    }

    @JsonProperty("license")
    public void setLicense(String license) {
        this.license = license;
    }

    @JsonProperty("timestamp")
    public Long getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("base")
    public String getBase() {
        return base;
    }

    @JsonProperty("base")
    public void setBase(String base) {
        this.base = base;
    }

    @JsonAnyGetter
    public Map<String, Float> getRates(){
        return this.rates;
    }

    @JsonAnySetter
    public void setRates(String name, Float value) {
        this.rates.put(name, value);
    }
}
