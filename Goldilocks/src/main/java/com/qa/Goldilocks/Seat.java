package com.qa.Goldilocks;

public class Seat {

	private static int ID = 1;
	private int seatNo;
	private int temp;
	private int weight;
	private int light;
	
	public Seat(Chair chair , Porridge porridge, Luminosity light) {
		this.weight = chair.getWeight();
		this.temp = porridge.getTemp();
		this.light = light.getLight();
		this.seatNo = ID;
		ID++;
	}
	
	
	public int getTemp() {
		return this.temp;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public int getLight() {
		return this.light;
	}
	
	
	public int getSeatNo() {
		return this.seatNo;
	}
}
