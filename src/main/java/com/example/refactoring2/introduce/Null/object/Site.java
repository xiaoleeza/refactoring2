package com.example.refactoring2.introduce.Null.object;

public class Site {

	Customer _customer;
	
	Customer getCustomer() {
		return _customer;
	}
	
	public static void main(String[] args) {
		Site site = new Site();
		Customer customer = site.getCustomer();
		
		BillingPlan plan;
		if (customer == null) {
			plan = BillingPlan.basic();
		} else {
			plan = customer.getPlan();
		}
		
		String customerName;
		if (customer == null) {
			customerName = "occupant";
		} else {
			customerName = customer.getName();
		}
		
		int weeksDelinquent;
		if (customer == null) {
			weeksDelinquent = 0;
		} else {
			weeksDelinquent = customer.getHistory().getWeeksDelinquentInLastYear();
		}
	}
}
