package com.decote.embbackend.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.decote.embbackend.dataEntity.Greeting;
import com.decote.embbackend.model.UserRule;
import com.decote.embbackend.repository.RuleRepository;

@RestController
public class Controller {
	
	@Autowired
	private RuleRepository repository;
	
	 private static final String template = "Hello, %s!";
	    private final AtomicLong counter = new AtomicLong();

	    @RequestMapping("/greeting")
	    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
	        return new Greeting(counter.incrementAndGet(),
	                            String.format(template, name));
	    }
	    
	    @RequestMapping("/put")
	    public String insertRule(@RequestParam(value="name", defaultValue="World") String name) {
	        
	    	UserRule rule = new UserRule(name,"Argentina");
	    	repository.save(rule);
	    	return rule.toString();
	    }
	    

}
