package com.example.config;

import com.example.service.ConsolePrintService;
import com.example.service.PrintService;
import com.example.service.RandomStringGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public RandomStringGenerator randomStringGenerator() {
        return new RandomStringGenerator();
    }

    @Bean
    public PrintService consolePrintService() {
        return new ConsolePrintService();
    }
}
