package com.example.refactoring2.extract.superclass;

import java.util.Enumeration;
import java.util.Vector;

public class DepartmentRF extends Party{

	private Vector _staff = new Vector();
	
	public DepartmentRF(String name) {
		super(name);
	}
	
	public int getAnnualCost() {
		Enumeration e = getStaff();
		int result = 0;
		while (e.hasMoreElements()) {
			Employee each = (Employee) e.nextElement();
			result += each.getAnnualCost();
		}
		return result;
	}
	
	public int getHeadCount() {
		return _staff.size();
	}
	
	public Enumeration getStaff() {
		return _staff.elements();
	}
	
	public void addStaff(Employee arg) {
		_staff.addElement(arg);
	}
	
}
