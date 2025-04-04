package com.example.converter_spring.services.impl;


import com.example.converter_spring.enums.Currency;
import com.example.converter_spring.models.CurrencyRate;
import com.example.converter_spring.models.UserInput;
import com.example.converter_spring.services.ConvertCurrencyService;
import com.example.converter_spring.services.CurrencyRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConvertCurrencyServiceImpl implements ConvertCurrencyService {
    private final CurrencyRateService currencyRateService;

    @Autowired
    public ConvertCurrencyServiceImpl(CurrencyRateService currencyRateService) {
        this.currencyRateService = currencyRateService;

    }

    @Override
    public Double convertCurrencyRub(UserInput userInput){
        String url = "src/main/resources/value.json";
        CurrencyRate currencyRate = currencyRateService.readCurrencyRate(url);

        Currency currency = Currency.valueOf(userInput.currencyCode.toUpperCase());
        return switch (currency) {
            case EUR -> userInput.getValue() / currencyRate.getEur();
            case USD -> userInput.getValue() / currencyRate.getUsd();
        };
    }
}
