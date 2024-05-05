package com.springcore.lifecyclemethods;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example_Annotation {
	private String subject;

	public Example_Annotation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Example_Annotation [subject=" + subject + "]";
	}
	@PostConstruct
	public void start() {
		System.out.println("Starting init method...");
	}
	@PreDestroy
	public void end() {
		System.out.println("Ending destroy method...");
	}

}
