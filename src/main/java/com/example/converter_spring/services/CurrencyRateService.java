package com.example.converter_spring.services;


import com.example.converter_spring.models.CurrencyRate;

public interface CurrencyRateService {
    CurrencyRate readCurrencyRate(String url);
}
