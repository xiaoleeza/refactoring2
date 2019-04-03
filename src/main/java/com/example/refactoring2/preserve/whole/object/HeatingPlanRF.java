package com.example.refactoring2.preserve.whole.object;

public class HeatingPlanRF {

	private TempRangeRF _range;
	
	boolean withinRange(TempRangeRF roomRange) {
		return (_range.includes(roomRange));
	}
}
