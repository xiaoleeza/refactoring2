/**
 * 
 */
package com.example.refactoring2.replace.type.code.with.subclasses;

/**
 * @author meng.sun
 *
 */
public class Manager extends EmployeeRF{
	
	int getType() {
		return EmployeeRF.MANAGER;
	}
	 
	public Manager() {
		super(EmployeeRF.MANAGER);
	}
}
