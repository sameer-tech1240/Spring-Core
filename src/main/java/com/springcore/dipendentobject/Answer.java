package com.springcore.dipendentobject;

import java.util.Date;

public class Answer {
	private int id;
	private String answer;
	private Date postedDate;

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Answer(int id, String answer, Date postedDate) {
		super();
		this.id = id;
		this.answer = answer;
		this.postedDate = postedDate;
	}

	public String toString() {
		return "Id No : " + this.id + " Answer : " + this.answer + " Posted Date : " + this.postedDate;
	}
}
