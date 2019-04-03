package com.example.refactoring2.introduce.local.extension;

import java.util.Date;

public class MfDateSub extends Date {

	public MfDateSub(String dateString) {
		super(dateString);
	}

	public MfDateSub(Date arg) {
		super(arg.getTime());
	}
	
	/*Date...
	private static Date nextDay(Date arg) {
		return new Date(arg.getYear(), arg.getMonth(), arg.getDate() - 1);
	}*/
	
	Date nextDay() {
		return new Date(getYear(), getMonth(), getDate() + 1);
	}
}
