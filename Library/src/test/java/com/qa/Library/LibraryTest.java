package com.qa.Library;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LibraryTest {
	
	private Library myLibrary;
	private Book myBook;
	private Newspaper myNP;
	private Map myMap;
	private static Person ben;
	private static Person joe;
	private static Person gareth;
	
	
	
	@Before
	public void setup() {
		myLibrary = new Library();
		myBook = new Book("A Storm of Swords", "George RR Martin", "Fantasy");
		myNP = new Newspaper("The Sun", "Tabloid", "15/10/2018");
		myMap = new Map("Map of Manchester", 10000);
		ben = new Person("Ben", 25, "07580736990");
		joe = new Person("Joseph", 24, "07517998066");
		gareth = new Person("Gareth", 23, "0101 0101 0101");
	}
	
	@After
	public void reset() {
		Person.resetID();
		Item.resetID();
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
		assertEquals(3, myLibrary.register(gareth).size());
	}
	
	@Test
	public void testRegisterAttributes() {
		
		List<Person> myList = myLibrary.register(ben);
		myList = myLibrary.register(joe);
		myList = myLibrary.register(gareth);
		
		assertEquals(1, myList.get(0).getCustomerID());
		assertEquals("Ben", myList.get(0).getName());
		assertEquals(25, myList.get(0).getAge());
		assertEquals("07580736990", myList.get(0).getPhoneNo());
		
		assertEquals(2, myList.get(1).getCustomerID());
		assertEquals("Joseph", myList.get(1).getName());
		assertEquals(24, myList.get(1).getAge());
		assertEquals("07517998066", myList.get(1).getPhoneNo());
		
		assertEquals(3, myList.get(2).getCustomerID());
		assertEquals("Gareth", myList.get(2).getName());
		assertEquals(23, myList.get(2).getAge());
		assertEquals("0101 0101 0101", myList.get(2).getPhoneNo());
	}
	
	@Test
	public void testDeleteID() {
		List<Person> myList = myLibrary.register(ben);
		myList = myLibrary.register(joe);
		myList = myLibrary.register(gareth);
		
		myList = myLibrary.delete(2);
		
		assertEquals(2, myList.size());
		assertEquals(1, myList.get(0).getCustomerID());
		assertEquals(3, myList.get(1).getCustomerID());
	}
	
	@Test
	public void testDeleteName() {
		List<Person> myList = myLibrary.register(ben);
		myList = myLibrary.register(joe);
		myList = myLibrary.register(gareth);
		
		myList = myLibrary.delete("Ben");
		
		assertEquals(2, myList.size());
		assertEquals(2, myList.get(0).getCustomerID());
		assertEquals(3, myList.get(1).getCustomerID());
	}
	
	@Test
	public void testRemoveID() {
		List<Item> myList = myLibrary.add(myBook);
		myList = myLibrary.add(myNP);
		myList = myLibrary.add(myMap);
		
		myList = myLibrary.remove(1);
		
		assertEquals(2, myList.size());
		assertEquals(2, myList.get(0).getItemID());
		assertEquals(3, myList.get(1).getItemID());
	}
	
	@Test
	public void testRemoveName() {
		List<Item> myList = myLibrary.add(myBook);
		myList = myLibrary.add(myNP);
		myList = myLibrary.add(myMap);
		
		myList = myLibrary.remove("A Storm of Swords");
		
		assertEquals(2, myList.size());
		assertEquals(2, myList.get(0).getItemID());
		assertEquals(3, myList.get(1).getItemID());
	}
	
	@Test
	public void testUpdateItemName() {
		myLibrary.add(myBook);
		myLibrary.add(myNP);
		myLibrary.add(myMap);
		
		myLibrary.updateItemName(myBook, "Game of Thrones");
		
		assertEquals("Game of Thrones", myBook.getName());
	}
	
	@Test
	public void testUpdateAuthor() {
		myLibrary.add(myBook);
		myLibrary.add(myNP);
		myLibrary.add(myMap);
		
		myLibrary.updateAuthor(myBook, "George Martin");
		
		assertEquals("George Martin", myBook.getAuthor());
	}
	
	@Test
	public void testUpdateGenre() {
		myLibrary.add(myBook);
		myLibrary.add(myNP);
		myLibrary.add(myMap);
		
		myLibrary.updateGenre(myBook, "High Fantasy");
		
		assertEquals("High Fantasy", myBook.getGenre());
	}
	
	@Test
	public void testUpdateScaleFactor() {
		myLibrary.add(myBook);
		myLibrary.add(myNP);
		myLibrary.add(myMap);
		
		myLibrary.updateScaleFactor(myMap, 5000);
		
		assertEquals(5000, myMap.getScaleFactor());
	}
	
	@Test
	public void testUpdateType() {
		myLibrary.add(myBook);
		myLibrary.add(myNP);
		myLibrary.add(myMap);
		
		myLibrary.updateType(myNP, "Broadsheet");
		
		assertEquals("Broadsheet", myNP.getType());
	}
	
	@Test
	public void testUpdateDate() {
		myLibrary.add(myBook);
		myLibrary.add(myNP);
		myLibrary.add(myMap);
		
		myLibrary.updateDate(myNP, "16/10/2018");
		
		assertEquals("16/10/2018", myNP.getDate());
	}
	
	@Test
	public void testUpdatePersonName() {
		myLibrary.register(ben);
		myLibrary.register(joe);
		myLibrary.register(gareth);
		
		myLibrary.updatePersonName(joe, "Joe");
		
		assertEquals("Joe", joe.getName());
	}
	
	@Test
	public void testUpdateAge() {
		myLibrary.register(ben);
		myLibrary.register(joe);
		myLibrary.register(gareth);
		
		myLibrary.updateAge(ben, 26);
		
		assertEquals(26, ben.getAge());
	}
	
	@Test
	public void testUpdatePhoneNo() {
		myLibrary.register(ben);
		myLibrary.register(joe);
		myLibrary.register(gareth);
		
		myLibrary.updatePhoneNo(gareth, "123456");
		
		assertEquals("123456", gareth.getPhoneNo());
	}
	
	@Test
	public void testCheckOut() {
		myLibrary.register(ben);
		myLibrary.register(joe);
		myLibrary.register(gareth);
		
		myLibrary.add(myBook);
		myLibrary.add(myNP);
		myLibrary.add(myMap);
		
		myLibrary.checkOut(joe, myBook);
		myLibrary.checkOut(gareth, myMap);
		
		assertEquals(true, myBook.getIsCheckedOut());
		assertEquals(true, myMap.getIsCheckedOut());
		assertEquals(false, myNP.getIsCheckedOut());
		
		assertEquals(joe, myBook.getHasItem());
		assertEquals(gareth, myMap.getHasItem());
		assertEquals(null, myNP.getHasItem());
		
		assertEquals("A Storm of Swords", joe.getCheckedOut().get(0).getName());
		assertEquals("Map of Manchester", gareth.getCheckedOut().get(0).getName());
		
		myLibrary.checkOut(joe, myNP);
		
		assertEquals("The Sun", joe.getCheckedOut().get(1).getName());
	}
	
	@Test
	public void testCheckIn() {
		myLibrary.register(ben);
		myLibrary.register(joe);
		myLibrary.register(gareth);
		
		myLibrary.add(myBook);
		myLibrary.add(myNP);
		myLibrary.add(myMap);
		
		myLibrary.checkOut(joe, myBook);
		myLibrary.checkOut(gareth, myMap);
		myLibrary.checkOut(joe, myNP);
		
		myLibrary.checkIn(joe, myBook);
		
		assertEquals(false, myBook.getIsCheckedOut());
		
		assertEquals(null, myBook.getHasItem());
		
		assertEquals("The Sun", joe.getCheckedOut().get(0).getName());
		
	}
	
	@Test
	public void testFileWrite() throws IOException {
		myLibrary.add(myBook);
		myLibrary.add(myNP);
		myLibrary.add(myMap);
		
		assertEquals(true, myLibrary.writeItemsToFile("items.txt"));
	}
}
