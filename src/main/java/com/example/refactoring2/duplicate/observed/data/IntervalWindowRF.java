/**
 * 
 */
package com.example.refactoring2.duplicate.observed.data;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.Observable;
import java.util.Observer;


/**
 * @author meng.sun
 * 
 */
public class IntervalWindowRF extends Frame implements Observer {

	private static final long serialVersionUID = 1L;

	TextField _startField;
	TextField _endField;
	TextField _lengthField;

	private Interval _subject;

	public IntervalWindowRF() {
		_subject = new Interval();
		_subject.addObserver(this);
		update(_subject, null);
	}

	@Override
	public void update(Observable o, Object arg) {
		_endField.setText(_subject.getEnd());
		_startField.setText(_subject.getStart());
		_lengthField.setText(_subject.getLength());
	}
	
	String getEnd() {
		return _subject.getEnd();
	}
	
	void setEnd(String arg) {
		_subject.setEnd(arg);
	}
	
	String getStart() {
		return _subject.getStart();
	}
	
	void setStart(String arg) {
		_subject.setStart(arg);
	}
	
	String getLength() {
		return _subject.getLength();
	}
	
	void setLength(String arg) {
		_subject.setLength(arg);
	}
	
	class SymFocus extends FocusAdapter {
		@Override
		public void focusLost(FocusEvent e) {
			Object object = e.getSource();
			if (object == _startField) {
				StartField_FocusLost(e);
			} else if (object == _endField) {
				EndField_FocusLost(e);
			} else if (object == _lengthField) {
				LengthField_FocusLost(e);
			}
		}

	}

	void StartField_FocusLost(FocusEvent e) {
		setStart(_startField.getText());
		if (isNotInteger(getStart())) {
			setStart("0");
			_subject.calculateLength();
		}
	}

	void EndField_FocusLost(FocusEvent e) {
		setEnd(_endField.getText());
		if (isNotInteger(getEnd())) {
			setEnd("0");
			_subject.calculateLength();
		}
	}

	void LengthField_FocusLost(FocusEvent e) {
		setLength(_lengthField.getText());
		if (isNotInteger(getLength())) {
			setLength("0");
			_subject.calculateLength();
		}
	}
	
	boolean isNotInteger(String str) {
		return true;
	}
	
	
	
}
