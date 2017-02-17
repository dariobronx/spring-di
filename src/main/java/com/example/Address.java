package com.example;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private String country = "myCountry";
	private String code;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String country, String code) {
		super();
		this.country = country;
		this.code = code;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
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
