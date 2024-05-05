package com.springcore.lifecyclemethods;

public class Table {
	private double price;

	public Table() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Table [price=" + price + "]";
	}

	public void init() {
		System.out.println("Inside init method");
	}

	public void destroy() {
		System.out.println("Inside destroy method");
	}

}
