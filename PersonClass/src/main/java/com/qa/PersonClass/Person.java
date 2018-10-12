package com.qa.PersonClass;

public class Person {

	private String name;
	private int age;
	private String jobTitle;
	
	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}
	
	public String toString() {
		return "Name: " + name + "\nAge: " + age + "\nJob Title: " + jobTitle + "\n";
	}
	
	public String getName() {
		return this.name;
	}
	
	
}
