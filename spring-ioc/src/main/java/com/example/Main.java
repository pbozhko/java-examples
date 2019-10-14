package com.example;

import com.example.config.ApplicationConfig;
import com.example.service.PrintService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

    public static void main(String... args) {

//        ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        ApplicationContext ctx = new FileSystemXmlApplicationContext("spring-ioc/src/main/resources/spring-context.xml");
        PrintService service = ctx.getBean(PrintService.class);
        service.printRandomString();
    }
}
