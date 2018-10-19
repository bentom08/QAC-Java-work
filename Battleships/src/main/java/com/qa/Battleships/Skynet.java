package com.qa.Battleships;

import java.util.Random;

public class Skynet {

	private String difficulty;
	private Random r;
	
	public Skynet(String difficulty) {
		this.difficulty = difficulty;
		r = new Random();
	}
	
	public int[] skynetOnline() {
		if (difficulty.equals("T-800")) {
			return T800_Difficulty();
		} else if (difficulty.equals("T-1000")) {
			T1000_Difficulty();
		}
		return null;
	}
	
	private int[] T800_Difficulty() {
		r = new Random();
		int[] coords = {r.nextInt(6), r.nextInt(6)};
		return coords;
	}
	
	private void T1000_Difficulty() {
		
	}
}
