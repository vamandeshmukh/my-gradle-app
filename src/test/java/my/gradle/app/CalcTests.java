package my.gradle.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
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

	@Test
	public void testAdd() {
		Calc calc = new Calc();
		int expected = 10;
		int actual = calc.add(5, 5);
		assertEquals(expected, actual);
	}

	@Test
	public void testNotAdd() {
		Calc calc = new Calc();
		int unexpected = 11;
		int actual = calc.add(5, 5);
		assertNotEquals(unexpected, actual);
	}
}
