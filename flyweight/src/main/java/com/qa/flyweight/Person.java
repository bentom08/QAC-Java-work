package com.qa.flyweight;

public class Person implements printDetails{

	private int age;
	private String name;
	
	public Person(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.println(name + ", " + age);
	}
}
