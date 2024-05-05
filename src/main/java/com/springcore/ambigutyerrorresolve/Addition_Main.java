package com.springcore.ambigutyerrorresolve;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Addition_Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/ambigutyerrorresolve/ambigutyerrorresolve.xml");
		Addition add = (Addition) context.getBean("add");
		int sum = add.doSum();
		System.out.println(sum);
	}

}
