package com.example;

import com.example.utils.StringUtils;

public class App {
	public static void main(String[] args) {
		System.out.println("Application java de test jenkins");
		System.out.println("==============================");
		
		Calculator calc = new Calculator();
		System.out.println("Tests de calculatrice : ");
		System.out.println("5 + 3 = "+calc.add(5, 3));
		System.out.println("10 - 4 = "+calc.subtract(10, 4));
		System.out.println("6 * 7 = "+calc.multiply(6, 7));
		System.out.println("20 / 5 = "+calc.divide(20, 5));
		
		System.out.println("\nTests d'utilitaires:");
		String testing = "Hello jenkins";
		System.out.println("Capitalize : " + StringUtils.capitalize(testing));
		System.out.println("Reverse : " + StringUtils.reverse(testing));
		System.out.println("Is plindrome : " + StringUtils.isPalindrome("radar"));
		
		System.out.println("==============================");
		System.out.println("Application exécutée avec succès!");
	}
}
