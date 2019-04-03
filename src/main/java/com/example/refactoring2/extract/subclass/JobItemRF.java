package com.example.refactoring2.extract.subclass;

public class JobItemRF {

	private int _unitPrice;
	
	private int _quantity;
	
	protected JobItemRF(int unitPrice, int quantity) {
		_quantity = quantity;
		_unitPrice = unitPrice;
	}
	
	public int getUnitPrice() {
		return _unitPrice;
	}

	public int getQuantity() {
		return _quantity;
	}

	public int getTotalPrice() {
		return getUnitPrice() * _quantity;
	}
	
	protected boolean isLabor() {
		return false;
	}
	
}
