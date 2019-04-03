package com.example.refactoring2.remove.control.flag;

public class Refactor {

	void checkSecurity(String[] people) {
		boolean found = false;
		for (int i = 0; i < people.length; i++) {
			if (!found) {
				if (people[i].equals("Don")) {
					sendAlert();
					found = true;
				}
				if (people[i].equals("John")) {
					sendAlert();
					found = true;
				}
			}
		}
	}

	void checkSecurityRF(String[] people) {
		for (int i = 0; i < people.length; i++) {
			if (people[i].equals("Don")) {
				sendAlert();
				break;
			}
			if (people[i].equals("John")) {
				sendAlert();
				break;
			}
		}
	}

	public void sendAlert() {

	}

	void checkSecurity1(String[] people) {
		String found = "";
		for (int i = 0; i < people.length; i++) {
			if (found.equals("")) {
				if (people[i].equals("Don")) {
					sendAlert();
					found = "Don";
				}
				if (people[i].equals("John")) {
					sendAlert();
					found = "John";
				}
			}
			someLaterCode(found);
		}
	}

	void checkSecurity1RF(String[] people) {
		String found = foundMiscreant(people);
		someLaterCode(found);
	}

	String foundMiscreant(String[] people) {
		for (int i = 0; i < people.length; i++) {
			if (people[i].equals("Don")) {
				sendAlert();
				return "Don";
			}
			if (people[i].equals("John")) {
				sendAlert();
				return "John";
			}

		}
		return "";
	}

	public void someLaterCode(String found) {
	}

}
