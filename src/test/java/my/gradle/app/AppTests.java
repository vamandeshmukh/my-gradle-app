package my.gradle.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTests {

	@Test
	public void testHi() {
		App app = new App();
		assertEquals(app.hi(), "Hi!");

	}

}
