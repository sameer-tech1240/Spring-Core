package com.springcore.refrencetype;

public class Manager {
	private String name;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Manager [name=" + name + "]";
	}

}
