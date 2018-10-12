package com.qa.InfiniteSwampGame;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		System.out.println("Grey foggy clouds float oppressively close to you, reflected in the murky grey water which reaches up your shins.\n"
						+  "Some black plants barely poke out of the shallow water.\n\n"
						+  "Try \"n\",\"s\",\"e\", \"w\" or a bearing\n\n"
						+  "You notice a small watch-like device in your left hand.\n"
						+  "It has hands like a watch, but the hands don't seem to tell time.\n");
		
		lostInSwamp();
		
		System.out.println("You see a box sitting behind the reeds of the swamp. You open it. It conatins a piece of paper​​ which reads:\n\n"
						+  "Feed me and I will live, but give me water and you'll witness my death\n"
						+  "Speak my name and you shall continue on your quest");
		
		riddleAnswer();
		
		System.out.println("Under your breath you whisper \"fire\". A door starts to materialise in front of you, becoming more solid by the second.\n"
						+  "You reach out and open it to reveal a whole world within the door. Do you step through? (Y/N)");
		
		doorDecision();
		
		System.out.println("You brace yourself for the wonders or horrors you may see, and step through the door.\n\n"
						+  "As you step over the threshold the light blinds your eyes and you instinctively reach up to cover them.\n"
						+  "As your eyes start adjusting to the light you begin to make out shapes in the distance.");
		
		Player player = new Player();
		
		directionDecision(player);
		
	}
	
	public static void lostInSwamp() {
		Swamp mySwamp = new Swamp();
		Scanner sc = new Scanner(System.in);
		
		while (mySwamp.getPlayerToTreasure() >= 0.8) {
			System.out.println("The Dial Reads: " + Math.round(mySwamp.getPlayerToTreasure() * 100d) / 100d);
			
			String userInput = sc.nextLine();
			
			try {
				double doubleInput = Double.parseDouble(userInput);
				mySwamp.move(doubleInput);
			} catch (NumberFormatException e) {
				mySwamp.move(userInput);
			}
		}
	}
	
	public static void riddleAnswer() {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			String userInput = sc.nextLine();
			
			if (userInput.equals("my name")) {
				System.out.println("You're the worst");
				System.exit(0);
			} else if (userInput.equals("fire") || userInput.equals("Fire")) {
				break;
			} else if (n == 5) {
				System.out.println("\n The box starts to heat up, slowly at first, but it quickly starts radiating heat and becomes too hot to touch\n"
								+  "A circle of magical flames suddenly surrounds you and you get the feeling you won't get many more chances.");
				n++;
			} else if (n == 9) {
				System.out.println("The flames close in around you, buring your flesh, and turning your bones to ash. Game Over!");
				System.exit(0);
			} else {
				System.out.println("Under your breath you whisper \"" + userInput + "\" but nothing appears to happen");
				n++;
			}
		}
	}
	
	public static void doorDecision() {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			String decision = sc.nextLine();
			
			if (decision.equals("n") || decision.equals("N")) {
				System.out.println("You begin to step forward, then hesitate. \"Why am I doing this?\" You wonder to yourself\n"
								+  "You decide that you're happy right here, and have no need to visit another world.\n"
								+  "The door seems to sense your decision, closes itself, and diappears.\n\n"
								+  "Two weeks later you find yourself still in the swamp with no food, and begin to regret your decision.\n"
								+  "Maybe the other world wouldn't have been so bad after all. Game Over!");
				System.exit(0);
			} else if (decision.equals("y") || decision.equals("Y")) {
				break;
			} else {
				System.out.println("Please enter Y or N");
			}
		}
	}
	
	public static void directionDecision(Player player) {
		System.out.println("You can see something that looks like a church over to your left, a mountain over to the right, with a cave in its side, and an\n"
						+  "orchard straight in front of you. Your stomach rumbles.\n\n"
						+  "Enter L/R/F to go left, right or forward.");
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			String decision = sc.nextLine();
			
			if (decision.equals("l") || decision.equals("L")) {
				church(player);
				break;
			} else if (decision.equals("r") || decision.equals("R")) {
				cave(player);
				break;
			} else if (decision.equals("f") || decision.equals("F")){
				orchard(player);
				break;
			} else {
				System.out.println("Please enter either L/F/R");
			}
		}
	}
	
	public static void church(Player player) {
		System.out.println("You begin walking towards the church");
	}
	
	public static void orchard(Player player) {
		System.out.println("You begin walking towards the orchard");
	}
	
	public static void cave(Player player) {
		System.out.println("You begin walking towards the cave");
		
		System.out.println("As you approach the cave you start to hear strange noises coming from within. Some sort of snarling\n"
						+  "that sounds like it could be coming from a vicious animal\n\n"
						+  "Do you want to turn back, look around or continue into the cave? (T/L/C)");
	}
	
}




