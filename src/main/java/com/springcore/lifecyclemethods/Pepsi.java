package com.springcore.lifecyclemethods;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
	private double price;
	private int quantity;

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + ", quantity=" + quantity + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.err.println("Taking pepsi : init");

	}

	@Override
	public void destroy() throws Exception {
		System.err.println("going to put bottle back to shop after drinking : destroy");

	}

}
