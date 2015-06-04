package com.decote.embbackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.decote.embbackend.enums.Sections;
import com.decote.embbackend.model.UserRule;
import com.decote.embbackend.repository.RuleRepository;

@RestController
@RequestMapping("/rules")
public class Controller {
	
	@Autowired
	private RuleRepository repository;
	
	/***
	 * Get the rules for each country
	 * @param country Country
	 * @param section {@link Sections}
	 * @return JSON
	 */
	    @RequestMapping(method = RequestMethod.GET)
	    public List<UserRule> getByCountry(@RequestParam String country, @RequestParam Sections section) {
	        if(section == Sections.recent)
	        {
	        	return repository.findFirst30ByCountryAllIgnoreCaseOrderByIdDesc(country);
	        }
	    	return repository.findFirst30ByCountryAllIgnoreCaseOrderByAmountAddsDesc(country);
	    }
	    
	    /***
	     * Adds a user array to the DB
	     * @param rule
	     * @return
	     */
	    @RequestMapping(method = RequestMethod.POST)
	    public List<UserRule> insertRule(@RequestBody List<UserRule> rule) {        
	    	repository.save(rule);
	    	return rule;
	    }
	    
	    /***
	     * Sum the quantity of times a record was added to the users list
	     * @param rule
	     * @return
	     */
	    @RequestMapping(method = RequestMethod.PUT)
	    public UserRule incrementAddCounter(@RequestBody UserRule rule) {        
	    	UserRule ruleToUpdate = repository.findOne(rule.getId());
	    	if(ruleToUpdate!=null)
	    	{
	    		ruleToUpdate.setAmountAdds(ruleToUpdate.getAmountAdds()+1);
	    		repository.save(ruleToUpdate);
	    	}
	    	return ruleToUpdate;
	    }
	    
	    

}
