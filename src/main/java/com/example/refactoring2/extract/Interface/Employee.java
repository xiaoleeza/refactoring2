package com.example.refactoring2.extract.Interface;

public class Employee {

	private int _rate;
	
	public int getRate() {
		return _rate;
	}
	
	public Employee(int rate) {
		_rate = rate;
	}
	
	public boolean hasSpecialSkill() {
		return true;
	}
}

/*-->

public class Employee implements Billable {
	...
}*/