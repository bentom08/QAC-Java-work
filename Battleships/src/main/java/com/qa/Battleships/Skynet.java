package com.qa.Battleships;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

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
			return T1000_Difficulty(grid);
		}
		return null;
	}
	
	private int[] T800_Difficulty(Grid grid) {
		return getRandomSquare(grid);
	}
	
	private int[] T1000_Difficulty(Grid grid) {
		List<int[]> hitSquares = getUnsunkShipSquares(grid);
		r = new Random();
		int[] coords = new int[2];
		
		if (hitSquares.size() == 0) {
			coords = getRandomSquare(grid);
		} else {
			
			int i = 0;
			
			while (true) {
				int direction = r.nextInt(4);
			
				switch (direction) {
					case 0:
						coords = new int[] {hitSquares.get(i)[0] + 1, hitSquares.get(i)[1]};
						break;
					case 1:
						coords = new int[] {hitSquares.get(i)[0] - 1, hitSquares.get(i)[1]};
						break;
					case 2:
						coords = new int[] {hitSquares.get(i)[0], hitSquares.get(i)[1] + 1};
						break;
					case 3:
						coords = new int[] {hitSquares.get(i)[0], hitSquares.get(i)[1] - 1};
						break;
				}
			
				if (coords[0] >= 0 && coords[1] >= 0 && coords[0] < grid.getGrid().length && coords[1] < grid.getGrid()[0].length && !grid.getGrid()[coords[0]][coords[1]].getIsHit()) {
					break;
				}
				
				List<Boolean> isHit = new ArrayList<>();
				
				try {isHit.add(grid.getGrid()[hitSquares.get(i)[0] + 1][hitSquares.get(i)[1]].getIsHit());} catch (ArrayIndexOutOfBoundsException e){}
				try {isHit.add(grid.getGrid()[hitSquares.get(i)[0] - 1][hitSquares.get(i)[1]].getIsHit());} catch (ArrayIndexOutOfBoundsException e){}
				try {isHit.add(grid.getGrid()[hitSquares.get(i)[0]][hitSquares.get(i)[1] + 1].getIsHit());} catch (ArrayIndexOutOfBoundsException e){}
				try {isHit.add(grid.getGrid()[hitSquares.get(i)[0]][hitSquares.get(i)[1] - 1].getIsHit());} catch (ArrayIndexOutOfBoundsException e){}
				
				if (isHit.stream().filter(k -> k == false).collect(Collectors.toList()).size() == 0) {
					i++;
				}
				
			}
		}
				
		return coords;
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
	
	private List<int[]> getUnsunkShipSquares(Grid grid) {
		List<int[]> hitSquares = new ArrayList<>();
		
		for (int i = 0; i < grid.getGrid().length; i++) {
			for (int j = 0; j < grid.getGrid()[0].length; j++) {
				if (grid.getGrid()[i][j].getIsHit() && grid.getGrid()[i][j].getHasShip() && !grid.getGrid()[i][j].getShip().getSunk()) {
					hitSquares.add(new int[2]);
					hitSquares.get(hitSquares.size() - 1)[0] = i;
					hitSquares.get(hitSquares.size() - 1)[1] = j;
				}
			}
		}
		
		return hitSquares;
	}
}
