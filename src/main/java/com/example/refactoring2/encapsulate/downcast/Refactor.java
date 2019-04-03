package com.example.refactoring2.encapsulate.downcast;

public class Refactor {

	// *encapsulate

	/*
	 * Reading lastReading = (Reading) theSite.readings().lastElement();
	 * 
	 * -->
	 * 
	 * Reading lastReading = theSite.lastReading();
	 * 
	 * class Site...
	 * 
	 * Reading lastReading() { return (Reading) readings.lastElement(); }
	 */
}
