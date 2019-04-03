package com.example.refactoring2.preserve.whole.object;

public class Room {
	
	TempRange daysTempRange() {
		return new TempRange();
	}
	
	boolean withinPlan(HeatingPlan plan) {
		int low = daysTempRange().getLow();
		int high = daysTempRange().getHigh();
		return plan.withinRange(low, high);
	}
}
