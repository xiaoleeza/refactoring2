/**
 * 
 */
package com.example.refactoring2.replace.type.code.with.subclasses;

/**
 * @author meng.sun
 *
 */
public class Engineer extends EmployeeRF{
	
	int getType() {
		return EmployeeRF.ENGINEER;
	}
	
	public Engineer() {
		super(EmployeeRF.ENGINEER);
	}
}
