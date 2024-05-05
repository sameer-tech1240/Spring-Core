package com.springcore.autowiringxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowiringxml/autowiring.xml");
		Employee emp = context.getBean("employee", Employee.class);
		System.out.println(emp);
	}
}
