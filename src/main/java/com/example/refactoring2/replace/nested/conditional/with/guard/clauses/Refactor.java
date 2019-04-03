package com.example.refactoring2.replace.nested.conditional.with.guard.clauses;

public class Refactor {

	/*public double getAdjustedCapital() {
		double result = 0.0;
		if (_capital > 0.0) {
			if (_intRate > 0.0 && _duration > 0.0) {
				result = (_income / _duration) * ADJ_FACTOR;
			}
		}
		return result;
	}
	
	-->
	
	public double getAdjustedCapital() {
		if (_capital <= 0.0) retun 0.0;
		if (_intRate <= 0.0 || _duration <= 0.0) return 0.0;
		return (_income / _duration) * ADJ_FACTOR;
	}*/
}
