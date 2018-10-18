package com.qa.Hospital;

import java.util.List;

public class DoctorTeam {

	private List<Doctor> team;
	private String name;
	
	public DoctorTeam(List<Doctor> doctors, String name) {
		team = doctors;
		this.name = name;
	}
	
	public List<Doctor> getTeam() {
		return team;
	}
	
	public String getName() {
		return name;
	}
	
	public void add(Doctor doctor) {
		team.add(doctor);
	}
	
	public boolean remove(Doctor doctor) {
		return team.remove(doctor);
	}
}
