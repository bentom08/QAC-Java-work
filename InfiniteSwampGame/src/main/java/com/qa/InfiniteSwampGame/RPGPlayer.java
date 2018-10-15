package com.qa.InfiniteSwampGame;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RPGPlayer extends Player{

	private List<String> inventory = new ArrayList<>();
	private int HP;
	private int hunger = 0;
	
	public RPGPlayer(int HP) {
		this.HP = HP;
	}
	
	public void addInv(String item) {
		System.out.println("You pick up the " + item + " and put it in your pocket");
		inventory.add(item);
	}
	
	public void useItem(String item) {
		inventory = inventory.stream().filter(i -> !i.equals(item)).collect(Collectors.toList());
	}
	
	public boolean searchInventory(String item) {
		if (inventory.stream().filter(i -> i.equals(item)).collect(Collectors.toList()).size() == 0) {
			return false;
		} else {
			return true;
		}
	}
	
	public void reduceHP() {
		this.HP -= 1;
	}
	
	public void increaseHP() {
		this.HP += 1;
	}
	
	public void eat(int food) {
		hunger -= food;
		
		if (hunger < 0) {
			hunger = 0;
		}
	}
	
	public void step() {
		hunger += 1;
		
		if (hunger == 5) {
			System.out.println("\n" + "You are becoming more hungry by the second. You should find food soon, or you won't have the energy to continue.");
		} else if (hunger == 10) {
			System.out.println("The pain in your stomach becomes too much to bear, and you no longer have the energy to go on. You keel over clutching\n"
							+  "your stomach in agony. It won't be long now until the wild animals are feasting on your rotting corpse. Game Over!");
			System.exit(0);
		}
	}
}