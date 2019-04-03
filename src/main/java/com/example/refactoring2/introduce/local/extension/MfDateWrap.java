package com.example.refactoring2.introduce.local.extension;

import java.util.Date;

public class MfDateWrap {

	private Date _original;
	
	public MfDateWrap(String dateString) {
		_original = new Date(dateString);
	}
	
	public MfDateWrap(Date arg) {
		_original = arg;
	}
	
	public int getYear() {
		return _original.getYear();
	}
	
	public int getMonth() {
		return _original.getMonth();
	}
	
	public int getDate() {
		return _original.getDate();
	}
	
	Date nextDay() {
		return new Date(getYear(), getMonth(), getDate() + 1);
	}
}
