package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Autowired
	private Country country;
	private String code = "mycode";

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(Country country, String code) {
		super();
		this.country = country;
		this.code = code;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [country=").append(country).append(", code=").append(code).append("]");
		return builder.toString();
	}

}
