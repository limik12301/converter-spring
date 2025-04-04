package com.example.converter_spring;

import com.example.converter_spring.services.ConvertCurrencyService;
import com.example.converter_spring.services.UserInteraction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ConsConvertCurrencyApp implements CommandLineRunner {
    private final ConvertCurrencyService convertCurrencyService;
    private final UserInteraction userInteraction;

    @Autowired
    public ConsConvertCurrencyApp(ConvertCurrencyService convertCurrencyService,
                                  UserInteraction userInteraction) {
        this.convertCurrencyService = convertCurrencyService;
        this.userInteraction = userInteraction;
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println(convertCurrencyService.convertCurrencyRub(userInteraction.getUserInput()));
    }
}
