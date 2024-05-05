package com.springcore.dipendentobject;

public class Employee_Address {
	private int id;
	private String name;
	private Address address;

	public Employee_Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	void display() {
		System.out.println(id + " " + name);
		System.out.println(address);
	}
}
