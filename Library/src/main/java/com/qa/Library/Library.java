package com.qa.Library;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
	
	public List<Person> delete(int customerID) {
		libraryCustomers = libraryCustomers.stream().filter(i -> i.getCustomerID() != customerID).collect(Collectors.toList());
		return libraryCustomers;
	}
	
	public List<Person> delete(String name) {
		libraryCustomers = libraryCustomers.stream().filter(i -> i.getName() != name).collect(Collectors.toList());
		return libraryCustomers;
	}
	
	public List<Item> remove(int itemID) {
		libraryItems = libraryItems.stream().filter(i -> i.getItemID() != itemID).collect(Collectors.toList());
		return libraryItems;
	}
	
	public List<Item> remove(String name) {
		libraryItems = libraryItems.stream().filter(i -> i.getName() != name).collect(Collectors.toList());
		return libraryItems;
	}
	
	public void updateItemName(Item item, String name) {
		item.setName(name);
	}
	
	public void updateAuthor(Book book, String author) {
		book.setAuthor(author);
	}
	
	public void updateGenre(Book book, String genre) {
		book.setGenre(genre);
	}
	
	public void updateScaleFactor(Map map, int scaleFactor) {
		map.setScaleFactor(scaleFactor);
	}
	
	public void updateType(Newspaper np, String type) {
		np.setType(type);
	}
	
	public void updateDate(Newspaper np, String date) {
		np.setDate(date);
	}
	
	public void updatePersonName(Person person, String name) {
		person.setName(name);
	}
	
	public void updateAge(Person person, int age) {
		person.setAge(age);
	}
	
	public void updatePhoneNo(Person person, String phoneNo) {
		person.setPhoneNo(phoneNo);
	}
	
	public void checkOut(Person person, Item item) {
		item.checkOut(person);
		person.checkOut(item);
	}
	
	public void checkIn(Person person, Item item) {
		item.checkIn();
		person.setCheckedOut(person.getCheckedOut().stream().filter(i -> i.getItemID() != item.getItemID()).collect(Collectors.toList()));
	}
	
	public boolean writeItemsToFile(String filename) throws IOException {
		BufferedWriter filewriter = new BufferedWriter(new FileWriter(filename));
		
		for (Item i: libraryItems) {
			System.out.println(i.toString());
			filewriter.write(i.toString());
			filewriter.newLine();
		}
		
		filewriter.close();
		
		File f = new File(filename);
		
		System.out.println(f.getAbsolutePath());
		
		if (f.exists() && !f.isDirectory()) {
			return true;
		} else {
			return false;
		}
	}
}
