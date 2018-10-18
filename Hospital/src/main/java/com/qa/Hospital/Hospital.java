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
}
