package com.qa.DelegateClass;

public class Delegate {

	private int techSkills;
	private int UID;
	private String name;
	
	public Delegate(int techSkills, int UID, String name) {
		this.techSkills = techSkills;
		this.UID = UID;
		this.name = name;
	}
	
	public void remove() {
		System.out.println("Deleted");
	}
	
	public void setTechSkills(int techSkills) {
		this.techSkills = techSkills;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void printInfo() {
		System.out.println(name + " - " + UID);
		System.out.println("Technical skills: " + techSkills + "/10");
	}
}
