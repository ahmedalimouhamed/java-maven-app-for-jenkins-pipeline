package com.example.utils;

public class StringUtils {
	public static String capitalize(String str) {
		if(str == null || str.isEmpty()) return str;
		
		return str.substring(0, 1).toUpperCase() + str.substring(1);
	}
	
	public static String reverse(String str) {
		if(str == null) return null;
		
		return new StringBuilder(str).reverse().toString();
	}
	
	public static boolean isPalindrome(String str) {
		if(str == null) return false;
		
		String cleaned = str.replaceAll("\\s+", "").toLowerCase();
		return cleaned.equals(reverse(cleaned));
				
	}
	
	public static int countWords(String str) {
		if(str == null || str.trim().isEmpty()) return 0;
		
		return str.trim().split("\\s+").length;
	}
}
