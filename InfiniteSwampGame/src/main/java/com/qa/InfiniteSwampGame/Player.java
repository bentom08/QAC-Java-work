package com.qa.InfiniteSwampGame;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private double playerX = 0;
	private double playerY = 0;
	private List<String> inventory = new ArrayList<>();

	public double getPlayerX() {
		return playerX;
	}
	
	public double getPlayerY() {
		return playerY;
	}
	
	public void setPlayerX(double playerX) {
		this.playerX = playerX;
	}
	
	public void setPlayerY(double playerY) {
		this.playerY = playerY;
	}
	
	public void addInv(String item) {
		inventory.add(item);
	}
}