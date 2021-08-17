package com.example.application.dto;

public class CountryDTO {
	
	private String name;
	private String capital;
	
	public CountryDTO() {
		super();
	}

	public CountryDTO(String name, String capital) {
		super();
		this.name = name;
		this.capital = capital;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}
}
