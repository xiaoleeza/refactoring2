package com.example.refactoring2.form.template.method;

public abstract class Statement {

	public String value(CustomerRF customer) {
		/*
		 * Enumeration rentals = _rentals.elements(); String result =
		 * headerString(customer); while (rentals.hasMoreElements()) { Rental
		 * each = (Rental) rentals.nextElement(); result +=
		 * eachRentalString(each); } result += result += footerString(customer);
		 * return result;
		 */
		return "";
	}

/*	abstract String headerString(CustomerRF customer);

	abstract String eachRentalString(Rental aRental);

	abstract String footerString(CustomerRF aCustomer);*/
}
