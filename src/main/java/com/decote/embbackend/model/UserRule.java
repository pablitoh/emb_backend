package com.decote.embbackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
public class UserRule {
	

	@Override
	public String toString() {
		return "UserRule [id=" + id + ", rule=" + rule + ", country=" + country
				+ ", amount_of_adds=" + amount_of_adds + "]";
	}

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
	private String rule;
	private String country;
	private long amount_of_adds;
	
	protected UserRule(){};
	
	public UserRule(String rule, String country)
	{
		this.rule = rule;
		this.country = country;
	}


}
