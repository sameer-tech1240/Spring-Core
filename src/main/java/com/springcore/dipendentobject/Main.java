package com.springcore.dipendentobject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/dipendentobject/dipendentobject.xml");
		
		Question question = (Question) context.getBean("question");
		question.result();

	}

}
