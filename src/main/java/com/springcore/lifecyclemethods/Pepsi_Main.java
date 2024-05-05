package com.springcore.lifecyclemethods;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pepsi_Main {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/lifecyclemethods/lifecycle.xml");
		Pepsi pepsi = (Pepsi) context.getBean("pepsi");
		System.out.println(pepsi);
		context.registerShutdownHook();
	}
}
