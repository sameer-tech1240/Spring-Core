package com.springcore.constructorinjection;


public class Certificate {
	 String gender;

	public Certificate(String gender) {
		super();
		this.gender = gender;
	}
	@Override
	public String toString() {
		return this.gender;
	}
	

}
