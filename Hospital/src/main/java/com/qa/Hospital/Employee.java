package com.qa.Hospital;

public abstract class Employee extends Person {

	private int salary;
	private String jobTitle;

	public Employee(String name, int age, int salary, String jobTitle) {
		super(name, age);
		this.salary = salary;
		this.jobTitle = jobTitle;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getJobTitle() {
		return jobTitle;
	}
	
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
}
