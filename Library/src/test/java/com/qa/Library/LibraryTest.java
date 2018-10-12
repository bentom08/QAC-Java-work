package com.qa.Library;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class LibraryTest {
	
	private Library myLibrary;
	private Book myBook;
	private Newspaper myNP;
	private Map myMap;
	private Person ben;
	private Person joe;
	
	@Before
	public void setup() {
		myLibrary = new Library();
		myBook = new Book();
		myNP = new Newspaper();
		myMap = new Map();
		ben = new Person("Ben", 25, "07580736990");
		joe = new Person("Joseph", 24, "07517998066");
	}

	@Test
	public void testAdd() {
		
		List<Item> myList = new ArrayList<>();
		myList.add(myBook);
		
		assertEquals(myList, myLibrary.add(myBook));
		
		myList.add(myNP);
		
		assertEquals(myList, myLibrary.add(myNP));
		
		myList.add(myMap);
		
		assertEquals(myList, myLibrary.add(myMap));
	}
	
	@Test
	public void testRegisterArray() {
		
		assertEquals(1, myLibrary.register(ben).size());
		assertEquals(2, myLibrary.register(joe).size());
	}
	
	@Test
	public void testRegisterAttributes() {
		
		List<Person> myList = myLibrary.register(ben);
		myList = myLibrary.register(joe);
		
		assertEquals(3, myList.get(0).getCustomerID());
		assertEquals("Ben", myList.get(0).getName());
		assertEquals(25, myList.get(0).getAge());
		assertEquals("07580736990", myList.get(0).getPhoneNo());
		
		assertEquals(4, myList.get(1).getCustomerID());
		assertEquals("Joseph", myList.get(1).getName());
		assertEquals(24, myList.get(1).getAge());
		assertEquals("07517998066", myList.get(1).getPhoneNo());
	}
	
	@Test
	public void testDeleteID() {
	}
	
	@Test
	public void testDeleteName() {
		
	}
}
