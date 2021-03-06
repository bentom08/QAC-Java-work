package com.qa.PaintWizard;

import java.util.List;
import java.util.Arrays;

public class Runner {

	public static void main(String[] args) {
		Paint CheapoMax = new Paint("CheapoMax", 10, 1999, 21);
		Paint ThatOneWithTheDog = new Paint("ThatOneWithTheDog", 12, 3438, 40);
		Paint AverageJoes = new Paint("AverageJoes", 11, 1799, 16);
		Paint DuluxourousPaints = new Paint("DuluxourousPaints", 22, 2500, 10);
		
		List<Paint> paints = Arrays.asList(CheapoMax, ThatOneWithTheDog, AverageJoes, DuluxourousPaints);
		
		PaintWizard myWiz = new PaintWizard(paints);
		
		System.out.println(myWiz.leastWaste(220));
	}
}
