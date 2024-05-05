package com.springcore.refrencetype;

public class Employee {
	private int age;
	private Manager manage;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Manager getManage() {
		return manage;
	}

	public void setManage(Manager manage) {
		this.manage = manage;
	}

	@Override
	public String toString() {
		return "Employee [age=" + age + ", manager=" + manage + "]";
	}

}
