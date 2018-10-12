package com.qa.GarageClass;

public class Sled extends Vehicle {

	private int numberOfRails;
	
	public Sled(int topSpeed, String numberPlate, String colour, int numberOfRails) {
		super(topSpeed, numberPlate, colour);
		this.numberOfRails = numberOfRails;
	}

	public int getNumberOfRails() {
		return numberOfRails;
	}
}
