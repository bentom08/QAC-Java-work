package com.qa.Hospital;

public class Doctor extends Employee {
	
	private String specialization;

	public Doctor(String name, int age, int salary, String specialization, String jobTitle) {
		super(name, age, salary, specialization);
		this.specialization = specialization;
	}
	
	public String getSpecialization() {
		return specialization;
	}
}
