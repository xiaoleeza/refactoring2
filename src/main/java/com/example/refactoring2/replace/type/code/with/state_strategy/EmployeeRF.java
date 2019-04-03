/**
 * 
 */
package com.example.refactoring2.replace.type.code.with.state_strategy;

/**
 * @author meng.sun
 * 
 */
public class EmployeeRF {

	private EmployeeType _type;

	EmployeeRF(int type) {
		try {
			_type = EmployeeType.newType(type);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	int getType() {
		return _type.getTypeCode();
	}

	void setType(int arg) throws IllegalAccessException {
		try {
			_type = EmployeeType.newType(arg);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	
	int _monthlySalary;
	int _commission;
	int _bonus;

	int payAmount() {
		switch (getType()) {
		case EmployeeType.ENGINEER:
			return _monthlySalary;
		case EmployeeType.SALESMAN:
			return _monthlySalary + _commission;
		case EmployeeType.MANAGER:
			return _monthlySalary + _bonus;
		default:
			throw new RuntimeException("Incorrect Employee");
		}
	}

}
