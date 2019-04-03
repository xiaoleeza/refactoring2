package com.example.refactoring2.introduce.parameter.object;

import java.util.Date;

public class Entry {

	private Date _chargeDate;
	
	private double _value;
	
	Entry(double value, Date chargeDate) {
		_value = value;
		_chargeDate = chargeDate;
	}
	
	Date getDate() {
		return _chargeDate;
	}
	
	double getValue() {
		return _value;
	}
}
