package polymorphism;

public class A extends B {

	void message(String name) {
		System.out.println("Greeting " + name);
	}

	void message()
	{
		System.out.println("Welcome ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B o = new B();
		o.message("Jordan");

		A o2 = new A();
		o2.message("Milan");
		o2.message();

	}

}
