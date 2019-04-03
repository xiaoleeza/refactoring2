/**
 * 
 */
package com.example.refactoring2.encapsulate.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import junit.framework.Assert;

/**
 * @author meng.sun
 *
 */
public class PersonRF {

	private Set<Course> _courses = new HashSet<Course>();
	
	public void addCourse(Course arg) {
		_courses.add(arg);
	}
	
	public void removeCourse(Course arg) {
		_courses.remove(arg);
	}
	
	public Set<Course> getCourses() {
		return Collections.unmodifiableSet(_courses);
	}
	
	public void initializeCourses(Set<Course> arg) {
		Assert.assertTrue(_courses.isEmpty());
//		Iterator<Course> iter = arg.iterator();
//		while (iter.hasNext()) {
//			addCourse(iter.next());
//		}
		_courses.addAll(arg);
	}
	
	int numberOfAdvancedCources() {
		Iterator<Course> iter = getCourses().iterator();
		int count = 0;
		while (iter.hasNext()) {
			Course each = (Course) iter.next();
			if (each.isAdvanced()) {
				count++;
			}
		}
		return count;
	}
	
	int numberOfCources() {
		return _courses.size();
	}
	
	public static void main(String[] args) {
		PersonRF kert = new PersonRF();
		kert.addCourse(new Course("Smalltalk Programming", false));
		kert.addCourse(new Course("Appreciation Single Malts", true));
		Assert.assertEquals(2, kert.numberOfCources());
		
		Course refact = new Course("Refactoring", true);
		kert.addCourse(refact);
		kert.addCourse(new Course("Brutal Sarcasm", false));
		Assert.assertEquals(4, kert.numberOfCources());
		
		kert.removeCourse(refact);
		Assert.assertEquals(3, kert.numberOfCources());
		
		
		System.out.println("advanced course number is " + kert.numberOfAdvancedCources());
		
	}
}
