package com.springcore.dipendentobject;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	private int id;
	private String question;
	private Map<Answer, User> answers;

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(int id, String question, Map<Answer, User> answers) {
		super();
		this.id = id;
		this.question = question;
		this.answers = answers;
	}

	public void result() {
		System.out.println("question id : " + id);
		System.out.println("question name : " + question);
		System.err.println("-------------------------------------------");
		System.out.println("Answers....");

		Set<Entry<Answer, User>> set = answers.entrySet();
		Iterator<Entry<Answer, User>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Entry<Answer, User> entry = iterator.next();
			Answer ans = entry.getKey();
			User user = entry.getValue();
			System.out.println("Answer Information : ");
			System.out.println(ans);
			System.out.println("Posted By : " + user);
			System.err.println("-------------------------------------------");
		}
	}

}
