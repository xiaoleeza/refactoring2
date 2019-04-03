package com.example.refactoring2.separate.query.from.modifier;

public class Refactor {

	String foundMiscreant(String[] people) {
		for (String person : people) {
			if (person.equals("Don")) {
				sendAlert();
				return "Don";
			}
			if (person.equals("John")) {
				sendAlert();
				return "John";
			}
		}
		return "";
	}
	
	void sendAlert(){}
	
//	-->
	
	String foundPerson(String[] people) {
		for (String person : people) {
			if (person.equals("Don")) {
				return "Don";
			}
			if (person.equals("John")) {
				return "John";
			}
		}
		return "";
	}
	
	void sendAlert(String[] people) {
		for (String person : people) {
			if (person.equals("Don")) {
				sendAlert();
				return;
			}
			if (person.equals("John")) {
				sendAlert();
				return;
			}
		}
	}
}
