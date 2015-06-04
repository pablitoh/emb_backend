package com.decote.embbackend.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.decote.embbackend.model.UserRule;


public interface RuleRepository extends CrudRepository<UserRule,Long> {
	
	List<UserRule> findFirst30ByCountryAllIgnoreCaseOrderByAmountAddsDesc(String country);
	List<UserRule> findFirst30ByCountryAllIgnoreCaseOrderByIdDesc(String country);
	
}
