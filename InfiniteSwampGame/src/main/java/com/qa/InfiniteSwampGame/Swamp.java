package com.qa.InfiniteSwampGame;

import java.util.Random;

public class Swamp {

	private double playerToTreasure;
	private Treasure treasure;
	private Player player;
	
	public Swamp() {
		Random r = new Random();
		double x = 10 * r.nextDouble() - 5;
		double y = 10 * r.nextDouble() - 5;
		
		this.player = new Player();
		this.treasure = new Treasure(x, y);
		updatePlayerToTreasure();
	}
	
	public double move(String direction) {
		switch(direction) {
			case "n":
				player.setPlayerY(player.getPlayerY() + 1);
				break;
			case "s":
				player.setPlayerY(player.getPlayerY() - 1);
				break;
			case "e":
				player.setPlayerX(player.getPlayerX() + 1);
				break;
			case "w":
				player.setPlayerX(player.getPlayerX() - 1);
				break;
		}
		updatePlayerToTreasure();
		
		return this.playerToTreasure;
	}
	
	public double move(double direction) {
		player.setPlayerX(player.getPlayerX() + Math.sin(Math.toRadians(direction)));
		player.setPlayerY(player.getPlayerY() + Math.cos(Math.toRadians(direction)));
		
		updatePlayerToTreasure();
		
		return this.playerToTreasure;
	}
	
	public void updatePlayerToTreasure() {
		this.playerToTreasure = Math.sqrt(Math.pow(treasure.getX() - player.getPlayerX(), 2) + Math.pow(treasure.getY() - player.getPlayerY(), 2));
	}
	
	public double getPlayerToTreasure() {
		return playerToTreasure;
	}
}
