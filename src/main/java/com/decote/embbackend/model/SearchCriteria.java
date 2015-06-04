package com.decote.embbackend.model;

import com.decote.embbackend.enums.Sections;

public class SearchCriteria {

	private String country;
	private Sections section;

	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Sections getSection() {
		return section;
	}
	public void setSection(Sections section) {
		this.section = section;
	}
}
