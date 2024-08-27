package basic;

public class A {

	int num = 23;
	static String name = "Ravi";

	void sum() {
		int a = 23, b = 45;
		System.out.println(a + b);
	}

	void sub(int a, int b) {   
		System.out.println(a - b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A o = new A();
		System.out.println(o.num);
		System.out.println(name);
		o.sum(); //
		o.sub(23, 30);

	}

}
