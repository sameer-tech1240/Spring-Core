package com.springcore.dipendentobject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Emp_Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/dipendentobject/dipendentobject.xml");
		Employee_Address employee = (Employee_Address) context.getBean("obj");
		employee.display();

	}

}
