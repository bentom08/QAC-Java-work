package com.qa.Hospital;

import java.util.ArrayList;
import java.util.List;

public class TreatmentPlan {

	private String diagnosis;
	private String currentTreatment;
	private List<String> previousTreatments;
	
	public TreatmentPlan() {
		previousTreatments = new ArrayList<>();
	}
	
	public String getCurrentTreatment() {
		return currentTreatment;
	}
	
	public void setTreatment(String currentTreatment) {
		this.currentTreatment = currentTreatment;
	}
	
	public String getDiagnosis() {
		return diagnosis;
	}
	
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
}
