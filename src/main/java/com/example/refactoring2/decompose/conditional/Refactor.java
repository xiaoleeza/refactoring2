package com.example.refactoring2.decompose.conditional;

public class Refactor {

	public static void main(String[] args) {
		/*if (date.before(SUMMER_START) || data.after(SUMMER_END))
			charge = quantity * _winterRate + _winterServiceCharge;
		else
			charge = quantity * _summerRate;
		
		-->
		
		if (notSummer(date))
			charge = winterCharge(quantity);
		else
			charge = summerCharge(quantity);*/
	}
}
