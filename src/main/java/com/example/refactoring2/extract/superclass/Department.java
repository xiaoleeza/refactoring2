package com.example.refactoring2.extract.superclass;

import java.util.Enumeration;
import java.util.Vector;

public class Department {

	private String _name;
	
	private Vector _staff = new Vector();
	
	public Department(String name) {
		_name = name;
	}
	
	public int getTotalAnnualCost() {
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
	
	public String getName() {
		return _name;
	}
}
