package com.springcore.lifecyclemethods;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Table_Main {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/lifecyclemethods/lifecycle.xml");
		Table table = (Table) context.getBean("tab");
		System.out.println(table);
		context.registerShutdownHook();
		// context.close();

		

	}

}
