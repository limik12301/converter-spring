package com.example.converter_spring.services.impl;



import com.example.converter_spring.models.CurrencyRate;
import com.example.converter_spring.services.CurrencyRateService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

@Service
public class CurrencyRateServiceImpl implements CurrencyRateService {
    private final ObjectMapper objectMapper;

    @Autowired
    public CurrencyRateServiceImpl(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public CurrencyRate readCurrencyRate(String url) {
        StringBuilder jsonObject = new StringBuilder();
        try (FileReader fr = new FileReader(url)) {
            Scanner sc = new Scanner(fr);
            while (sc.hasNextLine()) {
                jsonObject.append(sc.nextLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            return objectMapper.readValue(jsonObject.toString(), CurrencyRate.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
