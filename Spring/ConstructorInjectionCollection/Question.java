package com.collection;

import java.util.Iterator;
//import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.Map.Entry;

public class Question {

	private int id;
	private String name;
	
/*
	//private List<String>answers;
	private Set<String>answers;
	//public Question(int id, String name, List<String> answers) {
	public Question(int id, String name, Set<String> answers) {

		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}
	
public void Answerinfo() {
	System.out.println(id+") "+name);
	Iterator<String> i = answers.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
		
	}


	*/
	private Map<String,String> answers;

public Question(int id, String name, Map<String, String> answers) {
	super();
	this.id = id;
	this.name = name;
	this.answers = answers;
}

public void answerInfo() {
	System.out.println(id+"."+name);
	Set<Entry<String,String>> s = answers.entrySet();
	Iterator<Entry<String,String>> i = s.iterator();
	while(i.hasNext()) {
		Entry<String,String> x = i.next();
		System.out.println(x.getKey()+"."+x.getValue());
		
	}
	
	
}
	
}

