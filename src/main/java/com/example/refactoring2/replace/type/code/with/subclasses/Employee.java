/**
 * 
 */
package com.example.refactoring2.replace.type.code.with.subclasses;

/**
 * @author meng.sun
 * 
 */
public class Employee {

	private int _type;
	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;

	Employee(int type) {
		_type = type;
	}
}
