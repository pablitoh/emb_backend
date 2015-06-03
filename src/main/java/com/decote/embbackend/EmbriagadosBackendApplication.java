package com.decote.embbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.decote.embbackend.controllers")
@EnableAutoConfiguration
public class EmbriagadosBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmbriagadosBackendApplication.class, args);
    }
}
