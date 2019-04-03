/**
 * 
 */
package com.example.refactoring2.encapsulate.collection;


/**
 * @author meng.sun
 * 
 */
public class PersonArrayRF {

	private Course[] _courses;
	
	void setCourse(int index, Course newCourse) {
		_courses[index] = newCourse;
	}
	
	void setCourses(Course[] courses) {
		_courses = new Course[courses.length];
		for (int i = 0; i < courses.length; i++) {
			setCourse(i, courses[i]);
		}
	}
	
	Course[] getCourses() {
		Course[] result = new Course[_courses.length];
		System.arraycopy(_courses, 0, result, 0, _courses.length);
		return result;
	}

}
