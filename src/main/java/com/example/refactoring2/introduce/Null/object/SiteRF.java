package com.example.refactoring2.introduce.Null.object;

public class SiteRF {

	CustomerRF _customer;
	
	CustomerRF getCustomer() {
		return (_customer == null) ? CustomerRF.newNull() : _customer;
	}
	
	public static void main(String[] args) {
		SiteRF site = new SiteRF();
		CustomerRF customer = site.getCustomer();
		
		BillingPlan plan = customer.getPlan();
		
		String customerName = customer.getName();
		
		int weeksDelinquent = customer.getHistory().getWeeksDelinquentInLastYear();
	}
}
