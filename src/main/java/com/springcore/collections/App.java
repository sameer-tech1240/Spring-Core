package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext application = new ClassPathXmlApplicationContext(
				"com/springcore/collections/collectionconfiguration.xml");
		Employees bean = (Employees) application.getBean("Emp");
		System.out.println(bean.getName());
		System.out.println(bean.getPhones());
		System.out.println(bean.getAddresses());
		System.out.println(bean.getCourses());
		System.out.println(bean.getProps());
		System.out.println(bean.getPhones().getClass().getName());

	}

}
