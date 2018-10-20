package com.qa.Battleships;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Grid {

	GridSquare[][] grid;
	Scanner sc = new Scanner(System.in);
	List<Ship> ships;
	Random r;
	
	public Grid(int x, int y) {
		grid = new GridSquare[x][y];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				grid[i][j] = new GridSquare();
			}
		}
		
		ships = new ArrayList<>();
	}
	
	public Grid(Grid copy) {
		grid = new GridSquare[copy.grid.length][copy.grid[0].length];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				grid[i][j] = new GridSquare();
			}
		}
		
		ships = new ArrayList<>();
	}
	
	public void AIPlacement(Ship ship) {
		r = new Random();
		
		int x = r.nextInt(6);
		int y = r.nextInt(6);
		
		boolean placed = false;
		
		while (!placed) {
			placed = AIDirection(ship, x, y);
			System.out.println(1);
		}
		
		ships.add(ship);
	}
		
	public boolean AIDirection(Ship ship, int x, int y) {
		int length = ship.getShipLength();
		while (true) {
			int direction = r.nextInt(4);
			
			if (direction == 0) {
				
				if (grid[0].length < y + length) {
					continue;
				}
				
				for (int i = 0; i < length; i++) {
					if (grid[x][y + i].getHasShip()) {
						return false;
					}
				}
				
				for (int i = 0; i < length; i++) {
					grid[x][y + i].setHasShip(true);
					grid[x][y + i].placeShip(ship);
				}
				
				break;
				
			} else if (direction == 1) {

				if (y - length + 1 < 0) {
					continue;
				}
				
				for (int i = 0; i < length; i++) {
					if (grid[x][y - i].getHasShip()) {
						return false;
					}
				}
				
				for (int i = 0; i < length; i++) {
					grid[x][y - i].setHasShip(true);
					grid[x][y - i].placeShip(ship);
				}
				
				break;
				
			} else if (direction == 2) {
				
				if (x - length + 1 < 0) {
					continue;
				}
				
				for (int i = 0; i < length; i++) {
					if (grid[x - i][y].getHasShip()) {
						return false;
					}
				}
				
				for (int i = 0; i < length; i++) {
					grid[x - i][y].setHasShip(true);
					grid[x - i][y].placeShip(ship);
				}
				
				break;
				
			} else if (direction == 3) {
				
				if (grid.length < x + length) {
					continue;
				}
				
				for (int i = 0; i < length; i++) {
					if (grid[x + i][y].getHasShip()) {
						return false;
					}
				}
				
				for (int i = 0; i < length; i++) {
					grid[x + i][y].setHasShip(true);
					grid[x + i][y].placeShip(ship);
				}
				
				break;
				
			}
			
			}
			return true;
	}
	
	public void shipPlaced(Ship ship) {
		boolean x = false;
		while ( x == false) {
			 x = placeShip(ship);
		}
		ships.add(ship);
		System.out.println("Ship Placed!");
	}
	
	private boolean placeShip(Ship ship) {
		printGridShips();
		
		int length = ship.getShipLength();

		Scanner stringsc = new Scanner(System.in);
		
		String direction;
		System.out.println("This ship is of length " + length);
			
		int x = getXInput();
		
		int y = getYInput();

		System.out.print("Would you like the ship to face up, down, left or right? (u/d/l/r) ");
		
		while (true) {
		direction = stringsc.nextLine();
		
		if (direction.equals("u") || direction.equals("U")) {
			
			if (grid[0].length < y + length) {
				System.out.println("Ship off the board, select a different direction");
				continue;
			}
			
			for (int i = 0; i < length; i++) {
				if (grid[x][y + i].getHasShip()) {
					System.out.println("Already a ship here, try again");
					return false;
				}
			}
			
			for (int i = 0; i < length; i++) {
				grid[x][y + i].setHasShip(true);
				grid[x][y + i].placeShip(ship);
			}
			
			break;
			
		} else if (direction.equals("d") || direction.equals("D")) {

			if (y - length + 1 < 0) {
				System.out.println("Ship off the board, select a different direction");
				continue;
			}
			
			for (int i = 0; i < length; i++) {
				if (grid[x][y - i].getHasShip()) {
					System.out.println("Already a ship here, try again");
					return false;
				}
			}
			
			for (int i = 0; i < length; i++) {
				grid[x][y - i].setHasShip(true);
				grid[x][y - i].placeShip(ship);
			}
			
			break;
			
		} else if (direction.equals("l") || direction.equals("L")) {
			
			if (x - length + 1 < 0) {
				System.out.println("Ship off the board, select a different direction");
				continue;
			}
			
			for (int i = 0; i < length; i++) {
				if (grid[x - i][y].getHasShip()) {
					System.out.println("Already a ship here, try again");
					return false;
				}
			}
			
			for (int i = 0; i < length; i++) {
				grid[x - i][y].setHasShip(true);
				grid[x - i][y].placeShip(ship);
			}
			
			break;
			
		} else if (direction.equals("r") || direction.equals("R")) {
			
			if (grid.length < x + length) {
				System.out.println("Ship off the board, select a different direction");
				continue;
			}
			
			for (int i = 0; i < length; i++) {
				if (grid[x + i][y].getHasShip()) {
					System.out.println("Already a ship here, try again");
					return false;
				}
			}
			
			for (int i = 0; i < length; i++) {
				grid[x + i][y].setHasShip(true);
				grid[x + i][y].placeShip(ship);
			}
			
			break;
			
		} else {
			System.out.print("Please enter (u/d/l/r) ");
		}
		
		}
		return true;
	}
	
	public int getXInput() {
		int x = 0;
		
		System.out.print("Please enter the next Horizontal Coordinate: ");
		
		while (true) {
			x = sc.nextInt();
			
			if (x <= grid.length && x >= 1) {
				x--;
				break;
			} else {
				System.out.print("Value out of range, please enter a valid coordinate: ");
			}
		}
		
		return x;
	}
	
	public int getYInput() {
		int y = 0;
		
		System.out.print("Please enter the next Vertical Coordinate: ");
		
		while (true) {
			y = sc.nextInt();
			
			if (y <= grid[0].length && y >= 1) {
				y--;
				break;
			} else {
				System.out.print("Value out of range, please enter a valid coordinate: ");
			}
		}
		
		return y;
	}
	
	public void printGridShips() {
		String row = "   -";

		for (int i = 0; i < grid.length; i++) {
			row += "----";
		}
		
		System.out.println(row);
		
		for (int i = grid[0].length; i > 0; i--) {
			String shipRow = " |";
			for (int j = 0; j  < grid.length; j++) {
				if (grid[j][i - 1].getHasShip() == true) {
					shipRow += " O |";
				} else {
					shipRow += "   |";
				}
			}
			if (i >= 10) {
				System.out.println(i + shipRow + "\n" + row);
			} else {
				System.out.println(i + " " + shipRow + "\n" + row);
			}
		}
		
		System.out.print("    ");
		
		for (int i = 1; i < grid.length+1; i++) {
			if (i < 10) {
				System.out.print(" " + i + "  ");
			} else {
				System.out.print(" " + i + " ");
			}
			
		}
		System.out.println("\n");
	}
	
	public void printGridHits() {
		String row = "   -";

		for (int i = 0; i < grid.length; i++) {
			row += "----";
		}
		
		System.out.println(row);
		
		for (int i = grid[0].length; i > 0; i--) {
			String shipRow = " |";
			for (int j = 0; j  < grid.length; j++) {
				if (grid[j][i - 1].getIsHit() == true && grid[j][i - 1].getHasShip() == true){
					shipRow += " X |";
				} else if (grid[j][i - 1].getIsHit() == true) {
						shipRow += " O |";
				} else {
					shipRow += "   |";
				}
			}
			if (i >= 10) {
				System.out.println(i + shipRow + "\n" + row);
			} else {
				System.out.println(i + " " + shipRow + "\n" + row);
			}
		}
		
		System.out.print("    ");
		
		for (int i = 1; i < grid.length+1; i++) {
			if (i < 10) {
				System.out.print(" " + i + "  ");
			} else {
				System.out.print(" " + i + " ");
			}
			
		}
		System.out.println("\n");
	}
	
	public GridSquare[][] getGrid() {
		return grid;
	}
	
	public boolean allSunk() {
		if (ships.stream().filter(i -> !i.getSunk()).collect(Collectors.toList()).size() == 0) {
			return true;
		} else {
			return false;
		}
	}
}