package com.qa.Library;

public abstract class Item {

	private static int ID = 1;
	private String name;
	private int ItemID;
	private boolean isCheckedOut = false;
	private Person hasItem = null;
	
	public Item(String name) {
		this.ItemID = ID;
		this.name = name;
		
		ID++;
	}
	
	public int getItemID() {
		return this.ItemID;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static void resetID() {
		ID = 1;
	}
	
	public String toString() {
		return ItemID + ", " + name;
	}
	
	public void checkOut(Person person) {
		this.isCheckedOut = true;
		hasItem = person;
	}
	
	public void checkIn() {
		this.isCheckedOut = false;
		hasItem = null;
	}
	
	public boolean getIsCheckedOut() {
		return this.isCheckedOut;
	}
	
	public Person getHasItem() {
		return this.hasItem;
	}
}
