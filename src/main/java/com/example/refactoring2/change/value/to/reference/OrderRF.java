package com.example.refactoring2.change.value.to.reference;

import java.util.Collection;
import java.util.Iterator;

public class OrderRF {

	private CustomerRF _customer;
	
	public OrderRF(String customerName) {
		_customer = CustomerRF.getNamed(customerName);
	}
	
	public void setCustomer(String customerName) {
		_customer = CustomerRF.getNamed(customerName);
	}
	
	public String getCustomerName() {
		return _customer.getName();
	}
	
	public static int numberOfOrdersFor(Collection<OrderRF> orders, String customer) {
		int result = 0;
		Iterator<OrderRF> iter = orders.iterator();
		while (iter.hasNext()) {
			OrderRF each = (OrderRF) iter.next();
			if (each.getCustomerName().equals(customer))
				result++;
		}
		return result;
	}
}
