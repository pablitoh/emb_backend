package com.decote.embbackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Rules {
	

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
	private String rule;
	private String country;
	private long amount_of_adds;
	
	protected Rules(){};
	
	public Rules(String rule, String country)
	{
		this.rule = rule;
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "Rules [id=" + id + ", rule=" + rule + ", country=" + country
				+ ", amount_of_adds=" + amount_of_adds + "]";
	}

}
