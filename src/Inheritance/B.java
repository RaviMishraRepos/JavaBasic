package Inheritance;

public class B extends C {

	int num;
	static String name;

	B() {
		this.num = 89;
		this.name = "Roberto";
	}

	void message() {
		System.out.println("Messafe is called");
	}

	static void print() {
		System.out.println(name);
	}
}
