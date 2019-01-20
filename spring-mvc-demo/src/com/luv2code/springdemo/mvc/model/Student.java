package com.luv2code.springdemo.mvc.model;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countryOptions;
	private String favoriteLanguage;
	private LinkedHashMap<String, String> languageOptions;
	private String[] operatingSystems;
	
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}
	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	public Student() {
		countryOptions = new LinkedHashMap<>();
		languageOptions = new LinkedHashMap<>();
		
		//put values for country
		countryOptions.put("BR", "Brazil");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "United States");
		countryOptions.put("GB", "United Kingdom");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		
		//put values for language
		languageOptions.put("C", "C");
		languageOptions.put("C++", "C++");
		languageOptions.put("Java", "Java");
		languageOptions.put("Ruby", "Ruby");
	}
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LinkedHashMap<String, String> getLanguageOptions() {
		return languageOptions;
	}
	public String[] getOperatingSystems() {
		return operatingSystems;
	}
	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
}