package com.qa.Goldilocks;

public class Chair{
	private int weight;
	private static int ID = 1;
	private int seatNo;

	public int getWeight() {
		return weight;
	}
	
	public Chair(int w1) {
		this.weight = w1;
		this.seatNo = ID;
		ID++;
	}
	
	public int getSeatNo() {
		return this.seatNo;
	}
	
}
