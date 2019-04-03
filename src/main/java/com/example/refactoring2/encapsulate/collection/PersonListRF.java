/**
 * 
 */
package com.example.refactoring2.encapsulate.collection;

import java.util.ArrayList;
import java.util.List;


/**
 * @author meng.sun
 * 
 */
public class PersonListRF {

	private List<Course> _courses = new ArrayList<Course>();
	
	void setCourse(int index, Course newCourse) {
		_courses.set(index, newCourse);
	}
	
	Course[] getCourses() {
		return (Course[]) _courses.toArray(new Course[0]);
	}

}
