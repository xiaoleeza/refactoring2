package com.example.refactoring2.replace.error.code.with.exception;

public class Refactor {

	/*unchecked exception
	
	if (account.withdraw(account) == -1)
		handleOverdrawn();
	else
		doTheUsualThing();
	
	-->
	
	if (!account.canWithdraw(amount))
		handleOverdraw();
	else {
		amount.withdraw(amount);
		doTheUsualThing();
	}
	
	void withdraw(int amount) {
		if (amount > _balance)
			throw new IllegalArgumentException("Amount too large");
		_balance -= amount;
	}
	
	-->
	
	class Account...
	void withdraw(int amount) {
		Assert.isTrue("sufficient funds", amount <= _balance);
		_balance -= amount;
	}
	
	class Assert...
	static void isTrue(String comment, boolean test) {
		if (!test)
			throw new RuntimeException("Assertion failed: " + comment);
	}*/
	
	
	
	
	/*checked exception
	
	class BalanceException extends Exception {}
	
	try {
		account.withdraw(amount);
		doTheUsualThing();
	} catch (BalanceException e) {
		handleOverdrawn();
	}
	
	void withdraw(int amount) throws BalanceException {
		if (amount > _balance)
			throw new BalanceException();
		_balance -= amount;
	}
	
	-->
	
	if (account.withdraw(amount) == -1)
		handleOverdrawn();
	else
		doTheUsualThing();
	
	class Account...
	int withdraw(int amount) {
		if (amount > _balance)
			return -1;
		else {
			_balance -= amount;
			return 0;
		}
	}
	
	-->
	
	void newWithdraw(int amount) throws BalanceException {
		if (amount > _balance)
			throw new BalanceException();
		_balance -= amount;
	}
	
	int withdraw(int amount) {
		try {
			newWithdraw(amount);
			return 0;
		} catch (BalanceException e) {
			return -1;
		}
	}
	
	try {
		account.newWithdraw(amount);
		doTheUsualThing();
	} catch (BalanceException e) {
		handleOverdrawn();
	}*/
}

