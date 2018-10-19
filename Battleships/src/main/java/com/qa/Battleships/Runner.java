package com.qa.Battleships;

public class Runner {

	public static void main(String[] args) {
		
		System.out.println("Set up time.\n\n");
		
		Grid myGrid = new Grid(6, 6);

		
		
		myGrid.shipPlaced(new Ship(2, "Patrol Boat"));
		myGrid.shipPlaced(new Ship(3, "Submarine"));
		
		Grid otherGrid = new Grid(6, 6);
		
		otherGrid.shipPlaced(new Ship(2, "Patrol Boat"));
		otherGrid.shipPlaced(new Ship(3, "Submarine"));
		
		System.out.println("\n\nLet's Play BattleShips\n\n");	
		
		boolean gotHit;
		
		while (true) {
			
			gotHit = true;
			
			while (gotHit) {
				otherGrid.printGridHits();
				System.out.println("\n\nPlayer 1, fire when ready\n");
				gotHit = playTurn(otherGrid);
				if (otherGrid.allSunk()) {
					System.out.println("\n\nPlayer 1 wins!");
					System.exit(0);
				}
			}
		
			gotHit = true;
			
			while (gotHit) {
				myGrid.printGridHits();
				System.out.println("\n\nPlayer 2, fire when ready\n");
				gotHit = playTurn(myGrid);
				if (myGrid.allSunk()) {
					System.out.println("\n\nPlayer 2 wins!");
					System.exit(0);
				}
			}
		}
	}
	
	public static boolean playTurn(Grid grid) {	
		int x = grid.getXInput();
		int y = grid.getYInput();
		grid.getGrid()[x][y].setIsHit(true);
		if (grid.getGrid()[x][y].getHasShip()) {
			System.out.println("Hit!");
			grid.getGrid()[x][y].getShip().hit();
			System.out.println("You get another shot!");
			return true;
		} else {
			System.out.println("Miss :(");
			return false;
		}
	}
}