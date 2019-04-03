package com.example.refactoring2.pull.up.constructor.body;

public class Refactor {

	/*class Manager extends Employee...
	public manager(String name, String id, int grade) {
		_name = name;
		_id = id;
		_grade = grade;
	}
	
	-->
	
	public Manager(String name, String id, int grade) {
		super(name, id);
		_grade = grade;
	}*/
}
