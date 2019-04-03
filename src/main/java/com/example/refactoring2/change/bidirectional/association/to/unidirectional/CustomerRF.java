/**
 * 
 */
package com.example.refactoring2.change.bidirectional.association.to.unidirectional;

import java.util.HashSet;
import java.util.Set;

import junit.framework.Assert;

/**
 * @author meng.sun
 * 
 */
public class CustomerRF {
	
	private Set<OrderRF> _orders = new HashSet<OrderRF>();

	Set<OrderRF> friendOrders() {
		return _orders;
	}

//	void addOrder(OrderRF order) {
//		order.setCustomer(this);
//	}

	double getDiscount() {
		return 1;
	}

	double getPriceFor(OrderRF order) {
		Assert.assertTrue(_orders.contains(order));
		return order.getDisCountedPrice(this);
	}
}
