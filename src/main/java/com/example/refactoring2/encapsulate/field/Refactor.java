/**
 * 
 */
package com.example.refactoring2.encapsulate.field;

/**
 * @author meng.sun
 *
 */
public class Refactor {

	public String _name;
	
	private String _nameRF;
	
	public String getName() {
		return _nameRF;
	}
	
	public void setName(String arg) {
		_nameRF = arg;
	}
}
