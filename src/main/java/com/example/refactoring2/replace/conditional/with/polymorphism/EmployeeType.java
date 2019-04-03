/**
 * 
 */
package com.example.refactoring2.replace.conditional.with.polymorphism;


/**
 * @author meng.sun
 *
 */
abstract class EmployeeType {
	
	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;
	
	
	static EmployeeType newType(int code) throws IllegalAccessException {
		switch(code) {
		case ENGINEER:
			return new Engineer();
		case SALESMAN:
			return new Salesman();
		case MANAGER:
			return new Manager();
		default:
			throw new IllegalAccessException("Incorrect Employee Code");
		}
	}
	
	abstract int payAmount(EmployeeRF emp) ;
}
