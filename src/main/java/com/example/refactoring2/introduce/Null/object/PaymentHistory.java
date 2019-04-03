package com.example.refactoring2.introduce.Null.object;

public class PaymentHistory {

	int pay;
	
	int getWeeksDelinquentInLastYear() {
		return pay;
	}
	
	static PaymentHistory newNull() {
		return new NullPaymentHistory();
	}
	
	protected PaymentHistory() {}
}
