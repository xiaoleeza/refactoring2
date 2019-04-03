/**
 * 
 */
package com.example.refactoring2.replace.type.code.with.subclasses;

/**
 * @author meng.sun
 * 
 */
public abstract class EmployeeRF {

	private int _type;
	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;

	protected EmployeeRF(int type) {
		_type = type;
	}

	abstract int getType();

	static EmployeeRF create(int type) throws IllegalAccessException {
		switch (type) {
		case ENGINEER:
			return new Engineer();
		case SALESMAN:
			return new Salesman();
		case MANAGER:
			return new Manager();
		default:
			throw new IllegalAccessException("incorrect type code value");
		}
	}
}
