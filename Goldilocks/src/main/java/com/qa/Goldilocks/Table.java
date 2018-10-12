package com.qa.Goldilocks;

import java.util.ArrayList;
import java.util.List;

public class Table {
	
	private List<Seat> myTable;
	private int weight;
	private int temp;
	
	public Table(int weight, int temp) {
		myTable = new ArrayList<>();
		this.weight = weight;
		this.temp = temp;
	}
	
	public void whichSeats() {
		System.out.print("The Correct seats are: ");
		
		myTable.stream().filter(i -> i.getLight() >= 70)
						.filter(i -> i.getWeight() >= weight)
						.filter(i -> i.getTemp() <= temp)
						.forEach(i -> System.out.print(i.getSeatNo() + ", "));
	}
	
	public void addSeat(int weight, int temp, int light) {
		myTable.add(new Seat(new Chair(weight), new Porridge(temp), new Luminosity(light)));
	}
}
