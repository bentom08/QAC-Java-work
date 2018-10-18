package com.qa.Hospital;

public class Patient extends Person {

	private TreatmentPlan plan;
	private String checkInDate;
	
	public Patient(String name, int age, TreatmentPlan plan, String checkInDate) {
		super(name, age);
		this.plan = plan;
		this.checkInDate = checkInDate;
	}
	
	public TreatmentPlan getTreatment() {
		return plan;
	}
	
	public String getCheckInDate() {
		return checkInDate;
	}
}
