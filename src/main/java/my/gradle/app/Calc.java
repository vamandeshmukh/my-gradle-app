package my.gradle.app;

public class Calc {

	public int add(int i, int j) {

		return i + j;
	}

	public String m1() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "m1";
	}

}
