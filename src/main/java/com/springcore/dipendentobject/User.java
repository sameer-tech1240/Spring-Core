package com.springcore.dipendentobject;

public class User {
	private int id;
	private String name;
	private String email;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public String toString() {
		return "User Id : " + this.id + " Name : " + this.name + " Email Id : " + this.email;
	}

}
