package com.maven.junit.testing.JunitTesting;

import junit.framework.TestCase;

public class JavaTest extends TestCase{
	protected int value1,value2;
	
	protected void setUp() {
		value1 = 3;
		value2 = 3;
	}
	
	//test method to add two values
	public void testAdd() {
		double result = value1+value2;
		assertTrue(result == 6);
	}

}
