/**
 * 
 */
package com.example.refactoring2.encapsulate.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import junit.framework.Assert;

/**
 * @author meng.sun
 *
 */
public class Person {

	private Set<Course> _courses;
	
	public Set<Course> getCourses() {
		return _courses;
	}
	
	public void setCourses(Set<Course> arg) {
		_courses = arg;
	}
	
	public static void main(String[] args) {
		Person kert = new Person();
		Set<Course> s = new HashSet<Course>();
		s.add(new Course("Smalltalk Programming", false));
		s.add(new Course("Appreciation Single Malts", true));
		kert.setCourses(s);
		Assert.assertEquals(2, kert.getCourses().size());
		
		Course refact = new Course("Refactoring", true);
		kert.getCourses().add(refact);
		kert.getCourses().add(new Course("Brutal Sarcasm", false));
		Assert.assertEquals(4, kert.getCourses().size());
		
		kert.getCourses().remove(refact);
		Assert.assertEquals(3, kert.getCourses().size());
		
		Iterator<Course> iter = kert.getCourses().iterator();
		int count = 0;
		while (iter.hasNext()) {
			Course each = (Course) iter.next();
			if (each.isAdvanced()) {
				count++;
			}
		}
		System.out.println("advanced course number is " + count);
		
	}
}
