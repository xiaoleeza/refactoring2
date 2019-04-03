/**
 * 
 */
package com.example.refactoring2.change.bidirectional.association.to.unidirectional;

/**
 * @author meng.sun
 *
 */
public class Order {

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
	
	double getDisCountedPrice() {
		return getGrossPrice() * (1 - _customer.getDiscount());
	}
	
	double getGrossPrice() {
		return 1;
	}
}
