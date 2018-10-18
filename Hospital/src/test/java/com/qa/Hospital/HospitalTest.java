package com.qa.Hospital;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class HospitalTest {

	Hospital myHospital;
	Patient ben;
	Patient joe;
	Doctor gareth;
	Doctor vinul;
	Doctor harrison;
	
	@Before
	public void testSetup() {
		myHospital = new Hospital();
		gareth = new Doctor("Gareth", 23, 23500, "Undecided", "Intern");
		vinul = new Doctor("Vinul", 23, 35000, "Neurology", "Junior Neurosurgeon");
		harrison = new Doctor("Harrison", 21, 90000, "Dermatology", "Head of Dermatology");
		ben = new Patient("Ben", 25, new TreatmentPlan(), "18/10/2018", harrison);
		joe = new Patient("Joesph", 24, new TreatmentPlan(), "19/10/2018", vinul);
	}
	
	@Test
	public void testAdmit() {
		myHospital.admitPatient(ben);
		List<Patient> myList = myHospital.admitPatient(joe);
		
		assertEquals("Ben", myList.get(0).getName());
		assertEquals("19/10/2018", myList.get(1).getCheckInDate());
		assertEquals(2, myList.size());
	}
	
	@Test 
	public void testCreateTeam() {
		DoctorTeam team = myHospital.createTeam((Arrays.asList(gareth, harrison)), "Team not real doctors");
		
		assertEquals("Head of Dermatology", team.getTeam().get(1).getJobTitle());
		assertEquals("Gareth", team.getTeam().get(0).getName());
		assertEquals("Team not real doctors", team.getName());
		assertEquals(2, team.getTeam().size());
	}
	
	@Test
	public void testAddRemoveTeam() {
		List<Doctor> doctors = new ArrayList<>();
		doctors.add(gareth);
		doctors.add(harrison);
		DoctorTeam team = myHospital.createTeam(doctors, "Team not real doctors");
		
		assertEquals(true, team.remove(gareth));
		
		assertEquals("Harrison", team.getTeam().get(0).getName());
		assertEquals(1, team.getTeam().size());
		
		team.add(vinul);
		
		assertEquals(35000, team.getTeam().get(1).getSalary());
		assertEquals(2, team.getTeam().size());
	}
	
	@Test
	public void testPromote() {
		gareth.promote(30000, "Resident");
		vinul.promote(50000, "Neurosurgeon");
		
		assertEquals(50000, vinul.getSalary());
		assertEquals("Resident", gareth.getJobTitle());
		assertEquals(30000, gareth.getSalary());
		assertEquals("Neurosurgeon", vinul.getJobTitle());
	}
	
	@Test
	public void testRecordTreatment() {
		ben.giveDiagnosis("Tonsillitis");
		ben.giveTreatment("Penicillin");
		
		assertEquals("Penicillin", ben.getTreatmentPlan().getCurrentTreatment());
		
		ben.giveTreatment("Tonsilectomy");
		
		assertEquals("Penicillin", ben.getTreatmentPlan().getPreviousTreatments().get(0));
		
		ben.giveTreatment("Bedrest");
		
		assertEquals(2, ben.getTreatmentPlan().getPreviousTreatments().size());
		
		System.out.println(ben);
	}
}
