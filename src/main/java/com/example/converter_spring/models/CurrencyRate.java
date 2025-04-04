package com.example.converter_spring.models;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CurrencyRate {
    private Double eur;
    private Double usd;

    public CurrencyRate(){
    }

    public CurrencyRate(Double eur, Double usd) {
        this.eur = eur;
        this.usd = usd;
    }

}
