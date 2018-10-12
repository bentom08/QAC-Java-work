package com.qa.Library;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private List<Item> libraryItems;
	private List<Person> libraryCustomers;
	
	public Library() {
		libraryItems = new ArrayList<>();
		libraryCustomers = new ArrayList<>();
	}
	
	public List<Item> add(Item item) {
		libraryItems.add(item);
		return libraryItems;
	}
	
	public List<Person> register(Person person) {
		libraryCustomers.add(person);
		return libraryCustomers;
	}
	/*
	public List<Person> delete(int customerID) {
		
	}
	
	public List<Person> delete(String name) {
		
	}*/
}
