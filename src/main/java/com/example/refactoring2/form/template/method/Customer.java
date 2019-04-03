package com.example.refactoring2.form.template.method;

import java.util.Enumeration;

public class Customer {

	/*public String statement() {
		Enumeration rentals = _rentals.elements();
		String result = "Rental Record for " + getName() + "\n";
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += "\t" + each.getMovie().getTitle() + "\n" + 
						String.valueOf(each.getCharger()) + "\n";
		}
		result += "Amount owed is " + 
					String.valueOf(getTotalCharger()) + "\n";
		result += "You earned" +
					String.valueOf(getTotalFrequentRenterPoints()) + 
					" frequent renter points";
		return result;
	}*/
	
	/*public String htmlStatement() {
		Enumeration rentals = _rentals.elements();
		String result = "<H1>Rental Record <EM>" + getName() + "<EM></H1><p>\n";
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += "\t" + each.getMovie().getTitle() + ":" + 
						String.valueOf(each.getCharge()) + "<BR>";
		}
		result += "<P>Amount owed <EM>" + 
					String.valueOf(getTotalCharger()) + "</EM><P>\n";
		result += "You earned <EM>" +
					String.valueOf(getTotalFrequentRenterPoints()) + 
					"<EM> frequent renter points<P>";
		return result;
	}*/
}
