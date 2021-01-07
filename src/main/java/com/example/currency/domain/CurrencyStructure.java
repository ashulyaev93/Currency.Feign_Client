package com.example.currency.domain;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.*;

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
}
