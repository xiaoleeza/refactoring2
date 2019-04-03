package com.example.refactoring2.extract.superclass;

abstract class Party {

	private String _name;
	
	public String getName() {
		return _name;
	}
	
	public Party(String name) {
		_name = name;
	}
	
	abstract public int getAnnualCost();
}
