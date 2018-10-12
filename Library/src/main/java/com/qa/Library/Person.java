package com.qa.Library;

public class Person {

	private static int ID = 1;
	private int customerID;
	private String name;
	private int age;
	private String phoneNo;
	
	public Person(String name, int age, String phoneNo) {
		this.customerID = ID;
		this.name = name;
		this.age = age;
		this.phoneNo = phoneNo;
		
		ID++;
	}
	
	public int getCustomerID() {
		return this.customerID;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getPhoneNo() {
		return this.phoneNo;
	}
	
	public String toString() {
		return "Name: " + this.name + "\nAge: " + this.age + "\nPhone Number: " + this.phoneNo;
	}
}
