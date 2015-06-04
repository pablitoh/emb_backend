package com.decote.embbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.decote.embbackend.model.Rules;
import com.decote.embbackend.repository.RuleRepository;



@SpringBootApplication
public class EmbriagadosBackendApplication {

	@Autowired
	RuleRepository repository;
	
    public static void main(String[] args) {
    	String webPort = System.getenv("PORT");
        if (webPort == null || webPort.isEmpty()) {
            webPort = "8080";
        }
        System.setProperty("server.port", webPort);
        SpringApplication.run(EmbriagadosBackendApplication.class, args);
    }
    
}
