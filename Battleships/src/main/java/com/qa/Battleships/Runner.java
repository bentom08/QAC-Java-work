package com.qa.Battleships;

public class Runner {

	public static void main(String[] args) {
		
		Grid myGrid = new Grid(5, 5);
		
		myGrid.placeShip(2);
		myGrid.printGrid();
	}
}
