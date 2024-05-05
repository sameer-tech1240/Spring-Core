package com.springcore.lifecyclemethods;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example_Main {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/lifecyclemethods/lifecycle.xml");
		context.registerShutdownHook();
		Example_Annotation object = (Example_Annotation) context.getBean("example");
		System.out.println(object);
	}

}
