package com.qa.Library;

public class Newspaper extends Item {

	private String type;
	private String date;
	
	public Newspaper(String name, String type, String date) {
		super(name);
		this.type = type;
		this.date = date;
	}
	
	public String getType() {
		return this.type;
	}
	
	public String getDate() {
		return this.date;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
}
