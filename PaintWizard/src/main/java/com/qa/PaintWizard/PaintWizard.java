package com.qa.PaintWizard;

import java.util.Comparator;
import java.util.List;

public class PaintWizard {

	List<Paint> paints;

	public PaintWizard(List<Paint> paints) {
		this.paints = paints;
	}

	public Paint cheapestPaint(int roomSize) {
		return paints.stream().map(i -> {i.setRoomCost((int)
								Math.ceil(((double)roomSize / (double)i.getAreaPerContainer()))
								* i.getCost()); 
								return i; })
							  .min(Comparator.comparing(i -> i.getRoomCost())).get();
	}

	public Paint leastWaste(int roomSize) {
		return paints.stream().map(i -> {i.setWastedPaint((int)
										Math.ceil((double)roomSize / (double)i.getAreaPerContainer())
										*i.getAreaPerContainer() - roomSize);
										return i;})
							  .min(Comparator.comparing(i -> i.getWastedPaint())).get();
	}
}
