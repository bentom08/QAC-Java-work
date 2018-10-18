package com.qa.Hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

	private List<Doctor> doctors;
	private List<Patient> patients;
	private List<DoctorTeam> teams;
	
	public Hospital() {
		doctors = new ArrayList<>();
		patients = new ArrayList<>();
		teams = new ArrayList<>();
	}
	
	public List<Patient> admitPatient(Patient patient) {
		patients.add(patient);
		return patients;
	}
	
	public DoctorTeam createTeam(List<Doctor> doctorTeam, String name) {
		return new DoctorTeam(doctorTeam, name);
	}
}
