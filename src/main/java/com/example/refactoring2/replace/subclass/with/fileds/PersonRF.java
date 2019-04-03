package com.example.refactoring2.replace.subclass.with.fileds;

class PersonRF {

	private final boolean _isMale;
	private final char _code;

	protected PersonRF(boolean isMale, char code) {
		_isMale = isMale;
		_code = code;
	}

	boolean isMale() {
		return _isMale;
	}

	char getCode() {
		return _code;
	}

	static PersonRF createMale() {
		return new PersonRF(true, 'M');
	}

	static PersonRF createFemale() {
		return new PersonRF(false, 'F');
	}
}
