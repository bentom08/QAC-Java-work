package com.qa.Battleships;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Runner {

	public static void main(String[] args) throws InterruptedException {
		Grid grid = new Grid(6, 6);
		List<Ship> ships = Arrays.asList(new Ship(2, "Patrol Boat"), new Ship(3, "Submarine"));
		Skynet difficulty = new Skynet("T-800");
		
		
		onePlayer(grid, ships, difficulty);
		
	}
	
	public static void onePlayer(Grid grid, List<Ship> ships, Skynet difficulty) throws InterruptedException {
		System.out.println("Human Player set up");
		
		Grid myGrid = grid;
		
		Grid otherGrid = new Grid(grid);
		
		for (Ship s: ships) {
			myGrid.shipPlaced(s);
		}
		
		for (Ship s: ships) {
			otherGrid.AIPlacement(new Ship(s));
		}
		
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
				
				System.out.println("\n\nAI Turn");
				gotHit = AIturn(myGrid, difficulty);
				myGrid.printGridHits();
				if (myGrid.allSunk()) {
					System.out.println("\n\nThe AI wins. John Conner is dead. Skynet has become self aware.");
					System.exit(0);
				}
				TimeUnit.SECONDS.sleep(4);
			}
		}
	}
	
	public static void twoPlayer(Grid grid, List<Ship> ships) {
		System.out.println("Set up time.\n\n");
		
		Grid myGrid = grid;
		
		Grid otherGrid = new Grid(myGrid);

		for (Ship s: ships) {
			myGrid.shipPlaced(s);
		}
		
		for (Ship s: ships) {
			otherGrid.shipPlaced(new Ship(s));
		}
		
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
	
	public static boolean AIturn(Grid grid, Skynet difficulty) {
		int x = difficulty.skynetOnline(grid)[0];
		int y = difficulty.skynetOnline(grid)[1];
		
		grid.getGrid()[x][y].setIsHit(true);
		if (grid.getGrid()[x][y].getHasShip()) {
			System.out.println("Hit!");
			grid.getGrid()[x][y].getShip().hit();
			return true;
		} else {
			System.out.println("Miss :(");
			return false;
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