package com.example.refactoring2.introduce.parameter.object;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class Account {

	private Vector<Entry> _entries = new Vector<Entry>();

	double getFlowBetween(Date start, Date end) {
		double result = 0;
		Enumeration<Entry> e = _entries.elements();
		while (e.hasMoreElements()) {
			Entry each = (Entry) e.nextElement();
			if (each.getDate().equals(start)
					|| each.getDate().equals(end)
					|| (each.getDate().after(start) && each.getDate().before(
							end))) {
				result += each.getValue();
			}
		}
		return result;
	}

	// -->

	double getFlowBetween(DateRange range) {
		double result = 0;
		Enumeration<Entry> e = _entries.elements();
		while (e.hasMoreElements()) {
			Entry each = (Entry) e.nextElement();
			if (range.includes(each.getDate())) {
				result += each.getValue();
			}
		}
		return result;
	}
}
