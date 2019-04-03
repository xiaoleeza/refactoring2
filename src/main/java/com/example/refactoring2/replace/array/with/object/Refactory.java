/**
 * 
 */
package com.example.refactoring2.replace.array.with.object;

/**
 * @author meng.sun
 *
 */
public class Refactory {

	public static void main(String[] args) {
		
		String[] row = new String[3];
		row[0] = "Livepool";
		row[1] = "15";
		
		/*-->
		 * 
		Performance row = new Performance();
		row.setName("Livepool");
		row.setWins("15");*/
	}
}
