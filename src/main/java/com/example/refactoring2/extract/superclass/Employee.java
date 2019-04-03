package com.example.refactoring2.extract.superclass;

public class Employee {

	private String _name;
	
	private int _annualCost;
	
	private String _id;
	
	public Employee(String name, String id, int annualCost) {
		_name = name;
		_id = id;
		_annualCost = annualCost;
	}
	
	public int getAnnualCost() {
		return _annualCost;
	}
	
	public String getId() {
		return _id;
	}
	
	public String getName() {
		return _name;
	}
}
