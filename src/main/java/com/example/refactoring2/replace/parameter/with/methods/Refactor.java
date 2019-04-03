package com.example.refactoring2.replace.parameter.with.methods;

public class Refactor {

	int _quantity;

	int _itemPrice;

	/*public double getPrice() {
		int basePrice = _quantity * _itemPrice;
		int discountLevel;
		if (_quantity > 100)
			discountLevel = 2;
		else
			discountLevel = 1;
		double finalPrice = discountedPrice(basePrice, discountLevel);
		return finalPrice;
	}

	private double discountedPrice(int basePrice, int discountLevel) {
		if (discountLevel == 2)
			return basePrice * 0.1;
		else
			return basePrice * 0.05;
	}*/

	// -->
	
	public double getPrice() {
		return discountedPrice();
	}
	
	private double discountedPrice() {
		if (getDiscountLevel() == 2)
			return getBasePrice() * 0.1;
		else
			return getBasePrice() * 0.05;
	}
	
	private double getBasePrice() {
		return _quantity * _itemPrice;
	}
	
	private int getDiscountLevel() {
		if (_quantity > 100) 
			return 2;
		else
			return 1;
	}
}
