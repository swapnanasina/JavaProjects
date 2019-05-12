package com.maven.junit.testing.JunitTesting;

import static org.junit.Assert.*;

import org.junit.Test;


public class CalculatorTest {

	

	@Test
	public void test() {
		Calculator testing = new Calculator();
		long output = testing.add(5, 2);
		assertEquals(7, output);

	}

	@Test
	public void test1() {
		Calculator testing = new Calculator();
		long output = testing.substract(5, 2);
		assertEquals(3, output);

	}

	@Test
	public void test2() {
		Calculator testing = new Calculator();
		long output = testing.multiply(5, 2);
		assertEquals(10L, output);

	}

	@Test
	public void test3() {
		Calculator testing = new Calculator();
		long output = testing.divide(5, 5);
		assertEquals(1L, output);

	}

}
