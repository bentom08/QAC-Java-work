package com.qa.Battleships;

import java.util.Scanner;

public class Grid {

	GridSquare[][] grid;
	
	public Grid(int x, int y) {
		grid = new GridSquare[x][y];
		for (int i = 0; i < grid[0].length; i++) {
			for (int j = 0; j < grid.length; j++) {
				grid[i][j] = new GridSquare();
			}
		}
	}
	
	public void placeShip(int length) {
		Scanner sc = new Scanner(System.in);
		Scanner stringsc = new Scanner(System.in);
		
		int x;
		int y;
		String direction;
		
		System.out.print("Please enter the first Horizontal Coordinate: ");
		x = sc.nextInt() - 1;
			
		System.out.print("Please enter the first Vertical Coordinate: ");
		y = sc.nextInt() - 1;
		
		System.out.print("Would you like the ship to face up, down, left or right? (u/d/l/r) ");
		direction = stringsc.nextLine();
		
		if (direction.equals("u") || direction.equals("U")) {
			
			for (int i = 0; i < length; i++) {
				grid[x][y + i].setHasShip(true);
			}
		} else if (direction.equals("d") || direction.equals("D")) {
			
			for (int i = 0; i < length; i++) {
				grid[x][y - i].setHasShip(true);
			}
		} else if (direction.equals("l") || direction.equals("L")) {
			
			for (int i = 0; i < length; i++) {
				grid[x - i][y].setHasShip(true);
			}
		} else if (direction.equals("r") || direction.equals("R")) {
			
			for (int i = 0; i < length; i++) {
				grid[x + i][y].setHasShip(true);
			}
		}
	}
	
	public void printGrid() {
		String row = "   -";

		for (int i = 0; i < grid[0].length; i++) {
			row += "----";
		}
		
		System.out.println(row);
		
		for (int i = grid.length; i > 0; i--) {
			String shipRow = " |";
			for (int j = 0; j  < grid[0].length; j++) {
				if (grid[i - 1][j].getHasShip() == true) {
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
		
		for (int i = 1; i < grid[0].length+1; i++) {
			if (i < 10) {
				System.out.print(" " + i + "  ");
			} else {
				System.out.print(" " + i + " ");
			}
			
		}
	}
}
