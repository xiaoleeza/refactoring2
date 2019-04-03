package com.example.refactoring2.replace.parameter.with.explicit.methods;

public class Refactor {

	int _height;
	int _width;

	void setValue(String name, int value) {
		if (name.equals("height")) {
			_height = value;
			return;
		}
		if (name.equals("width")) {
			_width = value;
			return;
		}
		// Assert.shouldNeverReachHere();
	}

	// -->

	void setHeight(int arg) {
		_height = arg;
	}

	void setWidth(int arg) {
		_width = arg;
	}

	// ---

	/*static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;

	static Employee create(int type) {
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
	
	// -->
	
	static Employee createEngineer() {
		return new Engineer();
	}
	
	static Employee createSalesman() {
		return new Salesman();
	}
	
	static Employee createManager() {
		return new Manager();
	}*/
}
