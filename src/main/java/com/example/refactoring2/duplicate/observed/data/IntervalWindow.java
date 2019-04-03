/**
 * 
 */
package com.example.refactoring2.duplicate.observed.data;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.management.RuntimeErrorException;

/**
 * @author meng.sun
 * 
 */
public class IntervalWindow extends Frame {

	private static final long serialVersionUID = 1L;
	
	TextField _startField;
	TextField _endField;
	TextField _lengthField;

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
		if (isNotInteger(_startField.getText())) {
			_startField.setText("0");
			calculateLength();
		}
	}

	void EndField_FocusLost(FocusEvent e) {
		if (isNotInteger(_endField.getText())) {
			_endField.setText("0");
			calculateLength();
		}
	}

	void LengthField_FocusLost(FocusEvent e) {
		if (isNotInteger(_lengthField.getText())) {
			_lengthField.setText("0");
			calculateLength();
		}
	}
	
	boolean isNotInteger(String str) {
		return true;
	}
	
	void calculateLength() {
		try {
			int start = Integer.parseInt(_startField.getText());
			int end = Integer.parseInt(_endField.getText());
			int length = end - start;
			_lengthField.setText(String.valueOf(length));
		} catch (NumberFormatException e) {
			throw new RuntimeErrorException(new Error("Unexpected Number Format Error"));
		}
	}
	
	void calculateEnd() {
		try {
			int start = Integer.parseInt(_startField.getText());
			int length = Integer.parseInt(_lengthField.getText());
			int end = start + length;
			_endField.setText(String.valueOf(end));
		} catch (NumberFormatException e) {
			throw new RuntimeErrorException(new Error("Unexpected Number Format Error"));
		}
	}

}
