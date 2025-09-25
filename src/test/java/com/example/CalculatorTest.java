package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
	private Calculator calculator;
	
	@BeforeEach
	void setUp() {
		calculator = new Calculator();
	}
	
	@Test
	void testAddition() {
		assertEquals(5, calculator.add(2, 3));
		assertEquals(0, calculator.add(-1, 1));
		assertEquals(10, calculator.add(5, 5));
	}
	
	@Test
	void testSubtraction() {
		assertEquals(2, calculator.subtract(5, 3));
		assertEquals(-5, calculator.subtract(0, 5));
		assertEquals(0, calculator.subtract(5, 5));
	}
	
	@Test
	void testMultiplication() {
		assertEquals(20, calculator.multiply(4, 5));
		assertEquals(0, calculator.multiply(0, 5));
		assertEquals(-6, calculator.multiply(2, -3));
	}
	
	@Test
	void testDivision() {
		assertEquals(2.5, calculator.divide(5, 2));
		assertEquals(3.0, calculator.divide(9, 3));
	}
	
	@Test
	void testDivisionByZero() {
		ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
			calculator.divide(5, 0);
		});
		
		assertEquals("Division par zéro impossible", exception.getMessage());
	}
	
	@Test
	void testPower() {
		assertEquals(8.0, calculator.power(2, 3));
		assertEquals(1.0, calculator.power(5, 0));
	}
	
	@Test
	void testFactoriel() {
		assertEquals(1, calculator.factorial(0));
		assertEquals(120, calculator.factorial(5));
		assertEquals(3628800, calculator.factorial(10));
	}
	
	@Test
	void testFactorialNegative() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			calculator.factorial(-1);
		});
		
		assertTrue(exception.getMessage().contains("nombres négatifs"));
	}
}
