package com.example.refactoring2.replace.constructor.with.factory.method;

public class Employee {

	private int _type;

	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;

	Employee(int type) {
		_type = type;
	}

	// -->

	/*private Employee(int type) {
		_type = type;
	}
	
	static Employee create(int type) {
		return new Employee(type);
	}*/
	
	/*static Employee create(int type) {
		switch (type) {
			case ENGINEER:
				return new Engineer();
			case SALESMAN:
				return new Salesman();
			case MANAGER:
				return new Manager();
			default:
				throw new IllegalArgumentException("Incorrect type code value");
		}
	}
	
	-->
	
	static Employee create(String name) {
		try {
			return (Employee) Class.forName(name).newInstance();
		} catch (Exception e) {
			throw new IllegalArgumentException("Unabel to instantiate " + name);
		}
	}*/
	
}
