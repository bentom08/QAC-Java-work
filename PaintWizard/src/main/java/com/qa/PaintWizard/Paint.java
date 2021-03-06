package com.qa.PaintWizard;

public class Paint {

	private String name;
	private int areaPerLitre;
	private int cost;
	private int containerSize;
	private int areaPerContainer;
	private int roomCost;
	private int wastedPaint;
	
	public Paint(String name, int areaPerLitre, int cost, int containerSize) {
		this.name = name;
		this.areaPerLitre = areaPerLitre;
		this.cost = cost;
		this.containerSize = containerSize;
		this.areaPerContainer = areaPerLitre*containerSize;
	}
	
	public int getAreaPerLitre() {
		return this.areaPerLitre;
	}
	
	public int getCost() {
		return this.cost;
	}
	
	public int container() {
		return this.containerSize;
	}
	
	public int getAreaPerContainer() {
		return this.areaPerContainer;
	}
	
	public void setRoomCost(int roomCost) {
		this.roomCost = roomCost;
	}
	
	public int getRoomCost() {
		return this.roomCost;
	}
	
	public void setWastedPaint(int wastedPaint) {
		this.wastedPaint = wastedPaint;
	}
	
	public int getWastedPaint() {
		return this.wastedPaint;
	}
	
	public String toString() {
		return this.name;
	}
}
