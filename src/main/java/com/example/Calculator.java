package com.example;

public class Calculator {
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int subtract(int a, int b) {
		return a - b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public double divide(int a, int b) {
		if(b == 0) throw new ArithmeticException("Division par zéro impossible");
		
		return (double) a / b;
	}
	
	public double power(double base, double exponent) {
		return Math.pow(base,  exponent);
	}
	
	public long factorial(int n) {
		if(n < 0) throw new IllegalArgumentException("Factorielle non définie pour les nombres négatifs");
		if(n == 0) return 1;
		long result = 1;
		
		for(int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
}
