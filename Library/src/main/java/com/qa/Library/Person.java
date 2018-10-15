package com.qa.Library;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {

	private static int ID = 1;
	private int customerID;
	private String name;
	private int age;
	private String phoneNo;
	private List <Item> checkedOut;
	
	public Person(String name, int age, String phoneNo) {
		this.customerID = ID;
		this.name = name;
		this.age = age;
		this.phoneNo = phoneNo;
		checkedOut = new ArrayList<>();
		
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
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public String toString() {
		return "Name: " + this.name + "\nAge: " + this.age + "\nPhone Number: " + this.phoneNo;
	}
	
	public static void resetID() {
		ID = 1;
	}
	
	public void checkOut(Item item) {
		checkedOut.add(item);
	}
	
	public void checkIn(Item item) {
		checkedOut = checkedOut.stream().filter(i -> i != item).collect(Collectors.toList());
	}
	
	public List<Item> getCheckedOut() {
		return this.checkedOut;
	}
	
	public void setCheckedOut(List<Item> checkedOut) {
		this.checkedOut = checkedOut;
	}
}
