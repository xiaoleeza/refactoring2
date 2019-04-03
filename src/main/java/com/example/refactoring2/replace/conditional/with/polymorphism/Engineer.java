/**
 * 
 */
package com.example.refactoring2.replace.conditional.with.polymorphism;

/**
 * @author meng.sun
 *
 */
class Engineer extends EmployeeType{
	
	int payAmount(EmployeeRF emp) {
		return emp.get_monthlySalary();
	}
	
}
