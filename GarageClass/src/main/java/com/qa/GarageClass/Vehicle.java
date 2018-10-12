package com.qa.GarageClass;

public class Vehicle {

	private int topSpeed;
	private String numberPlate;
	private String colour;
	
	public Vehicle(int topSpeed, String numberPlate, String colour) {
		this.topSpeed = topSpeed;
		this.numberPlate = numberPlate;
		this.colour = colour;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public String getNumberPlate() {
		return numberPlate;
	}

	public String getColour() {
		return colour;
	}
}
