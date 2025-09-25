package com.example.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
	@Test
	void testCapitalize() {
		assertEquals("Hello", StringUtils.capitalize("hello"));
		assertEquals("Jenkins", StringUtils.capitalize("jenkins"));
		assertEquals("", StringUtils.capitalize(""));
		assertNull(StringUtils.capitalize(null));
	}
	
	@Test
	void testReverse() {
		assertEquals("olleH", StringUtils.reverse("Hello"));
		assertEquals("snikneJ", StringUtils.reverse("Jenkins"));
		assertEquals("", StringUtils.reverse(""));
		assertNull(StringUtils.reverse(null));
	}
	
	@Test
	void testIsPalindrome() {
		assertTrue(StringUtils.isPalindrome("radar"));
		assertTrue(StringUtils.isPalindrome("A man a plan a canal Panama"));
		assertFalse(StringUtils.isPalindrome("hello"));
		assertFalse(StringUtils.isPalindrome(null));
	}
	
	@Test
	void testCountWords(){
		assertEquals(3, StringUtils.countWords("Hello Jenkins World"));
		assertEquals(1, StringUtils.countWords("Hello"));
		assertEquals(0, StringUtils.countWords(""));
		assertEquals(0, StringUtils.countWords("   "));
	}
}
