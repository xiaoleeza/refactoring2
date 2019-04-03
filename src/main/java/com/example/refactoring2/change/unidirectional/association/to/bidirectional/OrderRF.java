/**
 * 
 */
package com.example.refactoring2.change.unidirectional.association.to.bidirectional;

/**
 * @author meng.sun
 *
 */
public class OrderRF {

	Customer _customer;

	public Customer getCustomer() {
		return _customer;
	}

	public void setCustomer(Customer customer) {
		if (_customer != null) {
			_customer.friendOrders().remove(this);
		}
		_customer = customer;
		if (_customer != null) {
			_customer.friendOrders().add(this);
		}
	}
}
