package com.qa.InfiniteSwampGame;

import java.util.Scanner;

public class Runner {
	
	private static RPGPlayer player;

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
		
		player = new RPGPlayer(5);
		
		directionDecision();
		
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
	
	public static void directionDecision() {
		System.out.println("You can see something that looks like a church over to your left, a mountain over to the right, with a cave in its side, and an\n"
						+  "orchard straight in front of you. Your stomach rumbles.\n\n"
						+  "Enter L/R/F to go left, right or forward.");
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			String decision = sc.nextLine();
			
			if (decision.equals("l") || decision.equals("L")) {
				System.out.println("You begin walking towards the church");
				player.step();
				church();
				break;
			} else if (decision.equals("r") || decision.equals("R")) {
				System.out.println("You begin walking towards the cave");
				player.step();
				cave();
				break;
			} else if (decision.equals("f") || decision.equals("F")){
				System.out.println("You begin walking towards the orchard");
				player.step();
				orchard();
				break;
			} else {
				System.out.println("Please enter either L/F/R");
			}
		}
	}
	
	public static void church() {
		
	}
	
	public static void orchard() {
		
	}
	
	public static void cave() {
		System.out.println("As you approach the cave entrance you start to hear strange noises coming from within. Some sort of snarling\n"
						+  "that sounds like it could be coming from a vicious animal\n\n"
						+  "Do you want to turn back, look around or continue into the cave? (Back/Look/Continue)");
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			String decision = sc.nextLine();
			
			if (decision.equals("Back") || decision.equals("back") || decision.equals("B") || decision.equals("b")) {
				System.out.println("You decide to head back to the place that you stepped out of the door. Maybe you can find something to deal with whatever is\n"
								+  "in the cave.");
				player.step();
				directionDecision();
			} else if (decision.equals("Look") || decision.equals("look") || decision.equals("L") || decision.equals("l")) {
				System.out.println("You look at the area around the cave and find some sharp rocks that look like they could deal some damage\n"
								+  "Pick one up? (Y/N)");
				
				while (true) {
					String rockDecision = sc.nextLine();
					if (rockDecision.equals("Y") || rockDecision.equals("y")) {
						player.addInv("rock");
						player.step();
						cave();
					} else if (rockDecision.equals("N") || rockDecision.equals("n")) {
						System.out.println("You aren't stupid. That rock looks dangerous! It could hurt someone! You leave it alone and move back to the cave entrance.");
						player.step();
						cave();
					} else {
						System.out.println("Please enter a valid choice");
					}
				}
			} else if (decision.equals("Continue") || decision.equals("continue") || decision.equals("C") || decision.equals("c")) {
				player.step();
				enterCave();
			} else {
				System.out.println("Please enter a valid option.");
			}
		}
	}
	
	public static void enterCave() {
		System.out.println("As you step into the cave the snarling gets closer and closer. You see a huge shadow on the wall, twice your size. You take a step\n"
						+  "");
	}
	
}
