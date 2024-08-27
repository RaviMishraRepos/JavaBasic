package basic;

public class C {

	static String name = "Rohit";
	static String welcome = "Greetings!!";

	static void message() {
		System.out.println(name);
	}

	static void welcome() {
		System.out.println(welcome);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(name);
		System.out.println(welcome);

		message();
		welcome();

	}

}
