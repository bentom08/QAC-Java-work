package com.qa.Library;

public class Book extends Item {

	private String author;
	private String genre;
	
	public Book(String name, String author, String genre) {
		super(name);
		this.author = author;
		this.genre = genre;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public String getGenre() {
		return this.genre;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String toString() {
		return getItemID() + ", " + getName() + ", " + author + ", " + genre;
	}
}
