package com.decote.embbackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
public class UserRule {


	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
	private String rule;
	private String country;
	private long amount_of_adds;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRule() {
		return rule;
	}

	public void setRule(String rule) {
		this.rule = rule;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public long getAmount_of_adds() {
		return amount_of_adds;
	}

	public void setAmount_of_adds(long amount_of_adds) {
		this.amount_of_adds = amount_of_adds;
	}

	
	protected UserRule(){};
	
	public UserRule(String rule, String country)
	{
		this.rule = rule;
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "UserRule [id=" + id + ", rule=" + rule + ", country=" + country
				+ ", amount_of_adds=" + amount_of_adds + "]";
	}


}
