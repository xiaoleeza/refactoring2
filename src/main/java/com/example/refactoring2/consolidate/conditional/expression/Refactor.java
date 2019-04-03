package com.example.refactoring2.consolidate.conditional.expression;

public class Refactor {

	public static void main(String[] args) {
		
		/*double disabilityAmount() {
			if (_senirrity < 2) return 0;
			if (_mouthsDisabled > 12) return 0;
			if (_isPartTime) return 0;
			...
		}
		
		-->
		
		double disabilityAmount() {
			if (isNotEligableForDisability()) return 0;
			...
		}*/
		
		
		/*if (onVacation())
			if (lengthOfService() > 10)
				return 1;
		return 0.5;
		
		-->
		
		if (onVacation() && lengthOfService() > 10)
			return 1;
		else
			return 0.5;
		
		-->
		
		return (onVacation() && lengthOfService() > 10) ? 1 : 0.5;*/
	}
}
