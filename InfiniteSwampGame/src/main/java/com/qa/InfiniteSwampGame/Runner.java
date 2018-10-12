package com.qa.InfiniteSwampGame;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		System.out.println("Grey foggy clouds float oppressively close to you, reflected in the murky grey water which reaches up your shins.");
		System.out.println("Some black plants barely poke out of the shallow water.\n");
		System.out.println("Try \"n\",\"s\",\"e\",or \"w\"\n");
		System.out.println("You notice a small watch-like device in your left hand.");
		System.out.println("It has hands like a watch, but the hands don't seem to tell time.\n");
		
		Swamp mySwamp = new Swamp();
		Scanner sc = new Scanner(System.in);
		
		while (mySwamp.getPlayerToTreasure() >= 1.0) {
			System.out.println("The Dial Reads: " + Math.round(mySwamp.getPlayerToTreasure() * 100d) / 100d);
			mySwamp.move(sc.nextLine());
		}
		
		System.out.println("You see a box sitting on the plain.   Its filled with treasure!  You win!  The end.​​");
	}
}
