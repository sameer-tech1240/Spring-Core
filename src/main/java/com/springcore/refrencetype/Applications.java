package com.springcore.refrencetype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Applications {
	public static void main(String[] args) {
		ApplicationContext application = new ClassPathXmlApplicationContext("com/springcore/refrencetype/refrence.xml");
		Employee employee = (Employee) application.getBean("employee");
		System.out.println(employee.getAge());
		System.out.println(employee.getManage().getName());
		System.out.println(employee);
		
		/*
		 * Manager manager = (Manager) application.getBean("manager");
		 * System.out.println(manager.getName());
		 */
		
	}

}
