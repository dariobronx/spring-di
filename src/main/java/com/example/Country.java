package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Country {
	private String countryStr="countryStr";
	
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Country(String countryStr) {
		super();
		this.countryStr = countryStr;
	}

	public String getCountryStr() {
		return countryStr;
	}

	public void setCountryStr(String countryStr) {
		this.countryStr = countryStr;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Country [countryStr=").append(countryStr).append("]");
		return builder.toString();
	}
	
}
