package com.example.refactoring2.change.value.to.reference;

import java.util.Dictionary;
import java.util.Hashtable;

public class CustomerRF {

	private final String _name;
	
	private static Dictionary<String, CustomerRF> _instances = new Hashtable<String, CustomerRF>();
	
	static void loadCustomers() {
		new CustomerRF("Lemor Car Bile").store();
		new CustomerRF("Associated Coffee Machines").store();
		new CustomerRF("Bilstor Gasworks").store();
	}
	
	private void store() {
		_instances.put(this.getName(), this);
	}
	
	private CustomerRF(String name) {
		_name = name;
	}
	
	public String getName() {
		return _name;
	}
	
	public static CustomerRF getNamed(String name) {
		return (CustomerRF) _instances.get(name);
	}
}
