package basic;

public class B {

	int a;

	B() {
		a = 90;
		System.out.println(a);
	}

	B(int num) {
		this.a = num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B o = new B();
		System.out.println(o.a);

		B o2 = new B(56);
		System.out.println(o2.a);

	}

}
