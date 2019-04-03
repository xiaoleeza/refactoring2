/**
 * 
 */
package com.example.refactoring2.replace.type.code.with.Class;

/**
 * @author meng.sun
 *
 */
public class PersonRF {
//	public static final int O = BloodGroup.O.getCode();
//	public static final int A = BloodGroup.A.getCode();
//	public static final int B = BloodGroup.B.getCode(); 
//	public static final int AB = BloodGroup.AB.getCode(); 
//	
//	public PersonRF(int bloodGroup) {
//		_bloodGroup = BloodGroup.code(bloodGroup);
//	}
//	
//	public void setBloodGroup(int arg) {
//		_bloodGroup = BloodGroup.code(arg);
//	}
//	
//	public int getBloodGroupCode() {
//		return _bloodGroup.getCode();
//	}
	
	private BloodGroup _bloodGroup;
	
	public BloodGroup getBloodGroup() {
		return _bloodGroup;
	}
	
	public PersonRF(BloodGroup bloodGroup) {
		_bloodGroup = bloodGroup;
	}
	
	public void setBloodGroup(BloodGroup arg) {
		_bloodGroup = arg;
	}
	
	
}
