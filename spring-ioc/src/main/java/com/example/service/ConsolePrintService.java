package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;

public class ConsolePrintService implements PrintService {

    private RandomStringGenerator randomStringGenerator;

    public void setRandomStringGenerator(RandomStringGenerator randomStringGenerator) {
        this.randomStringGenerator = randomStringGenerator;
    }

    @Override
    public void printRandomString() {

        System.out.println(randomStringGenerator.getRandomString());
    }
}
