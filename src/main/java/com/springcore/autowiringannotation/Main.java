package com.springcore.autowiringannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/autowiringannotation/autowiringannotation.xml");
		Employee emp = context.getBean("employee", Employee.class);
		System.out.println(emp);
	}
}
