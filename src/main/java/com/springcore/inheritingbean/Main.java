package com.springcore.inheritingbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/inheritingbean/inheritingbean.xml");
		Employee bean = (Employee) context.getBean("emp1");
		bean.show();
	}

}
