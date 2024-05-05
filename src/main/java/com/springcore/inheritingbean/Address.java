package com.springcore.inheritingbean;

public class Address {

	private String address1;
	private String city;
	private String state;
	private String country;

	public Address(String address1, String city, String state, String country) {
		super();
		this.address1 = address1;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public String toString() {
		return this.address1 + " " + this.city + " " + state + " " + this.country;
	}

}
