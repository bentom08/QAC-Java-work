package com.qa.flyweight;

public class Runner {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			Person person = (Person)PersonMaker.getPerson(getRandInt());
			person.setName("A Random Name");
			person.print();
			System.out.println(person);
		}
	}
	
	public static int getRandInt() {
		return (int)(Math.random()*5);
	}
}
