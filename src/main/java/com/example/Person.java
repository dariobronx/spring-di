package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("personAnnotation")
public class Person {
	private String name="fromAnnotation";
	private String surname;
	@Autowired
	private Address address;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String surname, Address address) {
		super();
		this.name = name;
		this.surname = surname;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [name=").append(name).append(", surname=").append(surname).append(", address=").append(address).append("]");
		return builder.toString();
	}

}
