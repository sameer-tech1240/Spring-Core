package com.springcore.constructorinjection;

import java.util.List;

public class Person {
	private int person_Id;
	private String name;
	private Certificate certificate;
	private List<String> add;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int person_Id, String name, Certificate certificate, List<String> add) {
		super();
		this.person_Id = person_Id;
		this.name = name;
		this.certificate = certificate;
		this.add = add;

	}

	@Override
	public String toString() {
		return this.person_Id + " " + this.name + " { " + this.certificate.gender + " } " + this.add;
	}

}
