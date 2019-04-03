package com.example.refactoring2.parameterize.method;

public class Refactor {

	double salary;

	void tenPercentRaise() {
		salary *= 1.1;
	}

	void fivePercenteRaise() {
		salary *= 1.05;
	}

	// -->

	void raise(double factor) {
		salary *= (1 + factor);
	}

	// -----
	
	/*protected Dollars baseCharge() {
		double result = Math.min(lastUsage(), 100) * 0.03;
		if (lastUsage() > 100) {
			result += (Math.min(lastUsage(), 200) - 100) * 0.05;
		}
		if (lastUsage() > 200) {
			result += (lastUsage() - 200) * 0.07;
		}
		return new Dollars(result);
	}

	-->
	
	protected Dollars baseCharge() {
		double result = usageInRange(0, 100) * 0.03;
		result += usageInRange(100, 200) * 0.05;
		retult += usageInRange(200, Integer.MAX_VALUE) * 0.07;
		return new Dollars(result);
	}
	
	protected int usageInRange(int start, int end) {
		if (lastUsage() > start)
			return Math.min(lastUsage(), end) - start;
		else
			return 0;
	}*/
}
