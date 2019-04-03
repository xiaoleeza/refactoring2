package com.example.refactoring2.introduce.Null.object;

public class CustomerRF {

	public boolean isNull() {
		return false;
	}
	
	protected CustomerRF() {
		
	}
	
	static CustomerRF newNull() {
		return new NullCustomer();
	}
	
	public String getName() {
		return null;
	}
	
	public BillingPlan getPlan() {
		return null;
	}
	
	public PaymentHistory getHistory() {
		return null;
	}
}
