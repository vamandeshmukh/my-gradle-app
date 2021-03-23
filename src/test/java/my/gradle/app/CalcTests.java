package my.gradle.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//TDD - Test driven development 
//
//test-first approach 
//------------------- 
//
//Requirement - 
//
//create an app to add two numbers. 
//
//1. write a test case. 
//2. Write just enough code to pass the test. 
//3. Run the test. 
//4. Refactor the code, if the test fails. 
//5. Run the test again to pass. 

public class CalcTests {

	private static Calc calc;

	@BeforeAll
	public static void setUp() {
		calc = new Calc();
		System.out.println("BeforeAll");
	}

	@BeforeEach
	public void someMethod() {
		System.out.println("BeforeEach");
	}

	@AfterAll
	public static void tearDown() { // like finally block
		calc = null;
		System.out.println("AfterAll");
	}

	@AfterEach
	public void someOtherMethod() {
		System.out.println("AfterEach");
	}

	@Test
	public void testAdd() {
		int expected = 10; // 11
		int actual = calc.add(5, 5);
		assertEquals(expected, actual, "Wrong addition");
		System.out.println("testAdd");
	}

	@Test
	public void testNotAdd() {
		int unexpected = 11;
		int actual = calc.add(5, 5);
		assertNotEquals(unexpected, actual);
		System.out.println("testNotAdd");
	}
}
