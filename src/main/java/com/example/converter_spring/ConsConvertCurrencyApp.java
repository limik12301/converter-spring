package com.example.converter_spring;

import com.example.converter_spring.services.ConvertCurrencyService;
import com.example.converter_spring.services.UserInteraction;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ConsConvertCurrencyApp implements CommandLineRunner {
    private final ConvertCurrencyService convertCurrencyService;
    private final UserInteraction userInteraction;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(convertCurrencyService.convertCurrencyRub(userInteraction.getUserInput()));
    }
}
