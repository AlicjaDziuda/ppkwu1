package com.example.demo.services;
@org.springframework.stereotype.Service

public class Service {

    public String reverseCharacters(String characters) {
        StringBuilder string = new StringBuilder(characters).reverse();
        return string.toString();
    }

}
