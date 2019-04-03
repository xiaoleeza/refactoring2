package com.example.refactoring2.change.value.to.reference;

public class Customer {

	private final String _name;
	
	public Customer(String name) {
		_name = name;
	}
	
	public String getName() {
		return _name;
	}
}
