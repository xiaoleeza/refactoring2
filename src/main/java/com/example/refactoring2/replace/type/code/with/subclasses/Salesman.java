/**
 * 
 */
package com.example.refactoring2.replace.type.code.with.subclasses;

/**
 * @author meng.sun
 *
 */
public class Salesman extends EmployeeRF{
	
	int getType() {
		return EmployeeRF.SALESMAN;
	}
	
	public Salesman() {
		super(EmployeeRF.SALESMAN);
	}
}
