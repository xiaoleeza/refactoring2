package com.example.refactoring2.introduce.parameter.object;

import java.util.Date;

public class DateRange {

	private final Date _start;
	
	private final Date _end;
	
	DateRange (Date start, Date end) {
		_start = start;
		_end = end;
	}
	
	Date getStart() {
		return _start;
	}
	
	Date getEnd() {
		return _end;
	}
	
	boolean includes (Date arg) {
		return (arg.equals(_start) ||
				arg.equals(_end) ||
				(arg.after(_start) && arg.before(_end)));
	}
}
