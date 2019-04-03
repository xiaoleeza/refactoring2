package com.example.refactoring2.extract.subclass;

public class Employee {

	private int _rate;
	
	public int getRate() {
		return _rate;
	}
	
	public Employee(int rate) {
		_rate = rate;
	}
}
