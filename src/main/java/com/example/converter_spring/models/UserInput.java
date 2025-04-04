package com.example.converter_spring.models;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class UserInput {
    public String currencyCode;
    public Double value;

    public UserInput() {}

    public UserInput(String currencyCode, Double value) {
        this.currencyCode = currencyCode;
        this.value = value;
    }

}
