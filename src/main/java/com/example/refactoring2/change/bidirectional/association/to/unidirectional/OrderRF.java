/**
 * 
 */
package com.example.refactoring2.change.bidirectional.association.to.unidirectional;


/**
 * @author meng.sun
 *
 */
public class OrderRF {

//	CustomerRF _customer;

	public CustomerRF getCustomer() {
//		Iterator<CustomerRF> iter = CustomerRF.getInstances().iterator();
//		while (iter.hasNext()) {
//			CustomerRF each = (CustomerRF) iter.next();
//			if (each.containsOrder (this)) {
//				return each;
//			}
//		}
		return null;
	}
//
//	public void setCustomer(CustomerRF customer) {
//		if (_customer != null) {
//			_customer.friendOrders().remove(this);
//		}
//		_customer = customer;
//		if (_customer != null) {
//			_customer.friendOrders().add(this);
//		}
//	}
	
	double getDisCountedPrice(CustomerRF customer) {
		return getGrossPrice() * (1 - customer.getDiscount());
	}
	
	double getGrossPrice() {
		return 1;
	}
}
