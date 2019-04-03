/**
 * 
 */
package com.example.refactoring2.encapsulate.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

import junit.framework.Assert;

/**
 * @author meng.sun
 * 
 */
public class PersonVectorRF {

	private Vector<Course> _courses = new Vector<Course>();

	public void addCourse(Course arg) {
		_courses.addElement(arg);
	}

	public void removeCourse(Course arg) {
		_courses.addElement(arg);
	}

	@SuppressWarnings("unchecked")
	public Vector<Course> getCourses() {
		return (Vector<Course>) _courses.clone();
	}

	public void initializeCourses(Vector<Course> arg) {
		Assert.assertTrue(_courses.isEmpty());
		Enumeration<Course> e = arg.elements();
		while (e.hasMoreElements()) {
			addCourse((Course) e.nextElement());
		}
//		_courses.addAll(arg);
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

}
