package com.microservices.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.microservices"})
public class MainApplication {
    public static void main(String[] args)
    {
        SpringApplication.run(MainApplication.class,args);
    }
}
