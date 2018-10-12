package com.qa.Goldilocks;

public class Porridge{
	private int temp;
	private static int ID = 1;
	private int seatNo;
	
	public int getTemp() {
		return temp;
	}

	public Porridge(int t1) {
		this.temp = t1;
		this.seatNo = ID;
		ID++;
	}
	
	public int getSeatNo() {
		return this.seatNo;
	}
}
