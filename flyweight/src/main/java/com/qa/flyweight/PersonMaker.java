package com.qa.flyweight;

import java.util.HashMap;

public class PersonMaker {

	public static HashMap people = new HashMap();
	
	public static Person getPerson(int age) {
		Person p = (Person)people.get(age);
		
		if (p == null) {
			p = new Person(age);
			people.put(age, p);
		}
		
		return p;
	}
}
