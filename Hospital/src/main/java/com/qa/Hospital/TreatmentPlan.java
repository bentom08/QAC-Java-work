package com.qa.Hospital;

import java.util.ArrayList;
import java.util.List;

public class TreatmentPlan {

	private String diagnosis = "Unknown";
	private String currentTreatment = "";
	private List<String> previousTreatments;
	
	public TreatmentPlan() {
		previousTreatments = new ArrayList<>();
	}
	
	public String getCurrentTreatment() {
		return currentTreatment;
	}
	
	public void setTreatment(String newTreatment) {
		if (!currentTreatment.equals("")) {
			previousTreatments.add(currentTreatment);
		}
		
		this.currentTreatment = newTreatment;
	}
	
	public String getDiagnosis() {
		return diagnosis;
	}
	
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	
	public List<String> getPreviousTreatments() {
		return previousTreatments;
	}
	
	public String toString() {
		return "Diagnosis: " + diagnosis + "\nCurrent Treatment: " + currentTreatment + "\nPrevious Treatments: " + previousTreatments;
	}
}