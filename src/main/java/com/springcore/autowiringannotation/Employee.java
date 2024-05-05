package com.springcore.autowiringannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	@Autowired
	@Qualifier("sam")
	private Address address;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Address address) {
		super();
		System.out.println("Calling Constructor...");
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Setting Address Object in Employee Class...");
		this.address = address;
	}

	public String toString() {
		return "Employee [address=" + address + "]";
	}

}
