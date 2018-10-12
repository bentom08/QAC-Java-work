package com.qa.Goldilocks;

public class Seat {

	private static int ID = 1;
	private int seatNo;
	
	public Seat() {
		this.seatNo = ID;
		ID++;
		
	}
	

	
	public int getSeatNo() {
		return this.seatNo;
	}
}
