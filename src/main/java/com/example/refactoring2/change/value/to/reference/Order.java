package com.example.refactoring2.change.value.to.reference;

import java.util.Collection;
import java.util.Iterator;

public class Order {

	private Customer _customer;
	
	public Order(String customerName) {
		_customer = new Customer(customerName);
	}
	
	public void setCustomer(String customerName) {
		_customer = new Customer(customerName);
	}
	
	public String getCustomerName() {
		return _customer.getName();
	}
	
	private static int numberOfOrdersFor(Collection<Order> orders, String customer) {
		int result = 0;
		Iterator<Order> iter = orders.iterator();
		while (iter.hasNext()) {
			Order each = (Order) iter.next();
			if (each.getCustomerName().equals(customer))
				result++;
		}
		return result;
	}
}
