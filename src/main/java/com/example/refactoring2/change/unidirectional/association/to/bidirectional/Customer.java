/**
 * 
 */
package com.example.refactoring2.change.unidirectional.association.to.bidirectional;

import java.util.HashSet;
import java.util.Set;

/**
 * @author meng.sun
 *
 */
public class Customer {
	
	private Set<OrderRF> _orders = new HashSet<OrderRF>();
	
	Set<OrderRF> friendOrders() {
		return _orders;
	}
	
	void addOrder(Order order) {
		order.setCustomer(this);
	}
}
