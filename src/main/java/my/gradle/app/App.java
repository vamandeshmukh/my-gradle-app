package my.gradle.app;

public class App {

	public String hi() {
		return "Hi!";
	}

	public static void main(String[] args) {
		System.out.println("Start");
		App app = new App();
		System.out.println(app.hi());
	}

}
