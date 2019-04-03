package com.example.refactoring2.replace.subclass.with.fileds;

public class Male extends Person {
	@Override
	char getCode() {
		return 'M';
	}

	@Override
	boolean isMail() {
		return true;
	}
}
