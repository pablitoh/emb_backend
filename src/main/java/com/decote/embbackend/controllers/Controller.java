package com.decote.embbackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.decote.embbackend.model.SearchCriteria;
import com.decote.embbackend.model.UserRule;
import com.decote.embbackend.repository.RuleRepository;

@RestController
@RequestMapping("/rules")
public class Controller {
	
	@Autowired
	private RuleRepository repository;
	
	    @RequestMapping(method = RequestMethod.GET)
	    public List<UserRule> getByCountry(@RequestBody SearchCriteria search) {
	    	return repository.findByCountry(search.getCountry());
	    }
	    
	    @RequestMapping(method = RequestMethod.POST)
	    public UserRule insertRule(@RequestBody UserRule rule) {        
	    	repository.save(rule);
	    	return rule;
	    }
	    @RequestMapping(method = RequestMethod.PUT)
	    public UserRule incrementAddCounter(@RequestBody UserRule rule) {        
	    	UserRule ruleToUpdate = repository.findOne(rule.getId());
	    	if(ruleToUpdate!=null)
	    	{
	    		ruleToUpdate.setAmount_of_adds(ruleToUpdate.getAmount_of_adds()+1);
	    		repository.save(ruleToUpdate);
	    	}
	    	return ruleToUpdate;
	    }
	    
	    

}
