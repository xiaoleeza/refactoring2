package com.example.refactoring2.extract.subclass;

public class JobItem {

	private int _unitPrice;
	
	private int _quantity;
	
	private Employee _employee;
	
	private boolean _isLabor;
	
	public JobItem(int unitPrice, int quantity, boolean isLabor, Employee employee) {
		_employee = employee;
		_isLabor = isLabor;
		_quantity = quantity;
		_unitPrice = unitPrice;
	}

	public int getUnitPrice() {
		return _unitPrice;
	}

	public int getQuantity() {
		return _quantity;
	}

	public Employee getEmployee() {
		return _employee;
	}

	public int getTotalPrice() {
		return getUnitPrice() * _quantity;
	}
	
}
