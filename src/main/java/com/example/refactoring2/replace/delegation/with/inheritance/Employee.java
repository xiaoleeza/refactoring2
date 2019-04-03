package com.example.refactoring2.replace.delegation.with.inheritance;

public class Employee {

	Person _person = new Person();
	
	public String getName() {
		return _person.getName();
	}
	
	public void setName(String arg) {
		_person.setName(arg);
	}
	
	public String toString() {
		return "Emp: " + _person.getLastName();
	}
}
