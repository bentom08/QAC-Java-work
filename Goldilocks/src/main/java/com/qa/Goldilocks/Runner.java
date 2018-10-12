package com.qa.Goldilocks;

public class Runner {

	public static void main(String[] args) {
		Table myTable = new Table(100, 80);
		
		myTable.addSeat(30, 50, 100);
		myTable.addSeat(130, 60, 100);
		myTable.addSeat(90, 60, 5);
		myTable.addSeat(150, 85, 5);
		myTable.addSeat(120, 70, 70);
		myTable.addSeat(200, 200, 5);
		myTable.addSeat(110, 100, 5);
		
		myTable.whichSeats();
	}
}
