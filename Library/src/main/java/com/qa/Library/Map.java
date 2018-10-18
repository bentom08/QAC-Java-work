package com.qa.Library;

public class Map extends Item {

	private int scaleFactor;
	
	public Map(String name, int scaleFactor) {
		super(name);
		this.scaleFactor = scaleFactor;
	}
	
	public int getScaleFactor() {
		return this.scaleFactor;
	}
	
	public void setScaleFactor(int scaleFactor) {
		this.scaleFactor = scaleFactor;
	}
	
	public String toString() {
		return getItemID() + ", " + getName() + ", " + scaleFactor;
	}
}
