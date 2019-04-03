package com.example.refactoring2.replace.exception.with.test;

import java.util.EmptyStackException;
import java.util.Stack;


public class ResourcePool {

	Stack _available;
	Stack _allocated;
	
	/*Resource getResource() {
		Resource result;
		try {
			result = (Resource) _available.pop();
			_allocated.push(result);
			return result;
		} catch (EmptyStackException e) {
			result = new Resource();
			_allocated.push(result);
			return result;
		}
	}*/
	
	/*Resource getResourceRF() {
		Resource result;
		if (_available.isEmpty())
			result = new Resource();
		else
			result = (Resource) _available.pop();
		
		_allocated.push(result);
		return result;
	}*/
}
