package my.gradle.app;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTests {

	@Test
	public void testHi() {
		App app = new App();
		assertEquals("Hi!", app.hi());
	}

	@Test
	public void testNotHi() {
		App app = new App();
		assertNotEquals(app.hi(), "Not Hi!");
//		assertNotEquals(5, App.add(2, 2));
//		assertNotEquals(unexpected, actual);
	}
	
	
	
}
