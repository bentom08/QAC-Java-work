package com.qa.Hospital;

public class Patient extends Person {

	private TreatmentPlan plan;
	private Doctor doctor;
	private String checkInDate;
	
	public Patient(String name, int age, TreatmentPlan plan, String checkInDate, Doctor doctor) {
		super(name, age);
		this.plan = plan;
		this.checkInDate = checkInDate;
		this.doctor = doctor;
	}
	
	public TreatmentPlan getTreatmentPlan() {
		return plan;
	}
	
	public String getCheckInDate() {
		return checkInDate;
	}
	
	public void assignNewDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	
	public void giveDiagnosis(String diagnosis) {
		plan.setDiagnosis(diagnosis);
	}
	
	public void giveTreatment(String treatment) {
		plan.setTreatment(treatment);
	}
	
	public String toString() {
		return "Name: " + getName() + "\nAge: " + getAge() + "\nCheck in Date: " + checkInDate + "\nDoctor: " + doctor.getName() + "\n"  + plan;
	}
}
