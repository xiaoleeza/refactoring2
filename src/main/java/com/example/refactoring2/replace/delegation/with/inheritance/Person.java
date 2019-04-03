package com.example.refactoring2.replace.delegation.with.inheritance;

public class Person {

	String _name;
	
	public String getName() {
		return _name;
	}
	
	public void setName(String arg) {
		_name = arg;
	}
	
	public String getLastName() {
		return _name.substring(_name.lastIndexOf(' ') + 1);
	}
}
