package com.example.converter_spring.services;


import com.example.converter_spring.models.UserInput;

public interface UserInteraction {
    UserInput getUserInput();
    void showOutput(String str);
}
