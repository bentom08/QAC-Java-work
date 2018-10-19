package com.qa.Battleships;

import java.util.Random;

public class Skynet {

	private String difficulty;
	private Random r;
	
	public Skynet(String difficulty) {
		this.difficulty = difficulty;
		r = new Random();
	}
	
	public int[] skynetOnline(Grid grid) {
		if (difficulty.equals("T-800")) {
			return T800_Difficulty(grid);
		} else if (difficulty.equals("T-1000")) {
			T1000_Difficulty(grid);
		}
		return null;
	}
	
	private int[] T800_Difficulty(Grid grid) {
		return getRandomSquare(grid);
	}
	
	private void T1000_Difficulty(Grid grid) {
		
	}
	
	private int[] getRandomSquare(Grid grid) {
		r = new Random();
		int[] coords = {r.nextInt(6), r.nextInt(6)};
		
		while (grid.getGrid()[coords[0]][coords[1]].getIsHit()) {
			coords[0] = r.nextInt(6);
			coords[1] = r.nextInt(6);
		}
		return coords;
	}
}
