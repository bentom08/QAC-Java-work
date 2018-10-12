package com.qa.Goldilocks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Table {
	
	private List<Porridge> porridgeList;
	private List<Luminosity> lightList;
	private List<Chair> chairList;
	private int weight;
	private int temp;
	
	public Table(int weight, int temp) {
		porridgeList = new ArrayList<>();
		lightList = new ArrayList<>();
		chairList = new ArrayList<>();
		this.weight = weight;
		this.temp = temp;
	}
	
	public void whichSeats() {
		System.out.print("The Correct seats are: ");
		
		List<Integer> porridgeNumbers=porridgeList.stream().filter(i -> i.getTemp() <= this.temp).collect(Collectors.toList());
		List<Integer> lightNumbers=lightList.stream().filter(i -> i.getLight() >= 70).collect(Collectors.toList());
		List<Integer> chairNumbers=chairList.stream().filter(i -> i.getWeight() <= this.weight).collect(Collectors.toList());

	
	}

	
	public void addSeat(int temp, int weight, int light) {
		porridgeList.add(new Porridge(temp));
		lightList.add(new Luminosity(light));
		chairList.add(new Chair(weight));
	}
}
