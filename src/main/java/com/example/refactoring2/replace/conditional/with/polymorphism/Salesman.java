/**
 * 
 */
package com.example.refactoring2.replace.conditional.with.polymorphism;

/**
 * @author meng.sun
 *
 */
public class Salesman extends EmployeeType{
	
	int payAmount(EmployeeRF emp) {
		return emp.get_monthlySalary() + emp.get_commission();
	}
}
