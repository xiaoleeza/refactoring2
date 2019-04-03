/**
 * 
 */
package com.example.refactoring2.replace.magic.number.with.symbolic.constant;

/**
 * @author meng.sun
 *
 */
public class Refactor {

	double potentialEnergy(double mass, double height) {
		return mass * 9.81 * height;
	}
	
	static final double GRAVITATIONAL_CONSTANT = 9.81;
	
	double potentialEnergyRF(double mass, double height) {
		return mass * GRAVITATIONAL_CONSTANT * height;
	}
}
