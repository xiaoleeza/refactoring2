package com.example.refactoring2.extract.superclass;

public class EmployeeRF extends Party{

	private int _annualCost;
	
	private String _id;
	
	public EmployeeRF(String name, String id, int annualCost) {
		super(name);
		_id = id;
		_annualCost = annualCost;
	}
	
	public int getAnnualCost() {
		return _annualCost;
	}
	
	public String getId() {
		return _id;
	}
	
}
