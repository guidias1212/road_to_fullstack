package com.testing.jacoco;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class JacocoApplicationTests {

	@Test
	public void whenEmptyString_thenAccept() {
		Palindrome palindromeTester = new Palindrome();
		Assertions.assertTrue(palindromeTester.isPalindrome(""));
	}
}
