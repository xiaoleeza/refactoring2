package com.example.refactoring2.preserve.whole.object;

public class TempRangeRF {

	int getHigh() {
		return 100; 
	}
	
	int getLow() {
		return -100;
	}
	
	boolean includes (TempRangeRF arg) {
		return (arg.getLow() >= this.getLow() && arg.getHigh() <= this.getHigh());
	}
}
