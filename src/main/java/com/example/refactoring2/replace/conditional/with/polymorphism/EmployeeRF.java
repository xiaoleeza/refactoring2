/**
 * 
 */
package com.example.refactoring2.replace.conditional.with.polymorphism;

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
	
	int _monthlySalary;
	int _commission;
	int _bonus;

	int payAmount() {
		return _type.payAmount(this);
	}

	public int get_monthlySalary() {
		return _monthlySalary;
	}

	public void set_monthlySalary(int monthlySalary) {
		_monthlySalary = monthlySalary;
	}

	public int get_commission() {
		return _commission;
	}

	public void set_commission(int commission) {
		_commission = commission;
	}

	public int get_bonus() {
		return _bonus;
	}

	public void set_bonus(int bonus) {
		_bonus = bonus;
	}
	
	

}
