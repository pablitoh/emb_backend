package com.decote.embbackend.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.decote.embbackend.model.Rules;


public interface RuleRepository extends CrudRepository<Rules,Long> {
	
	List<Rules> findByCountry(String country);
}
