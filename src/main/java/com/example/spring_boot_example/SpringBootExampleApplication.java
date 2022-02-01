package com.example.spring_boot_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // @EnableAutoConfiguration, @ComponentScan, @Configuration
public class SpringBootExampleApplication {

    public static void main(String[] args) {
        // Bootstrap your Spring Boot application
        SpringApplication.run(SpringBootExampleApplication.class,
                              args);
    }

}
