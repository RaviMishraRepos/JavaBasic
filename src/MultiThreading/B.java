package MultiThreading;

public class B implements Runnable {

	void s1() {
		for (int i = 2; i <= 20; i += 2) {
			System.out.println(i);
		}
	}

	void s2() {
		for (int i = 13; i <= 130; i += 13) {
			System.out.println(i);
		}
	}

	@Override
	public void run() {

		if (Thread.currentThread().getName().equals("ABC")) {
			s1();
		}
		if (Thread.currentThread().getName().equals("XYZ")) {
			s2();
		}
	}

	public static void main(String[] args) {

		B b = new B();
		Thread o1 = new Thread(b);
		o1.setName("ABC");
		o1.start();

		Thread o2 = new Thread(b);
		o2.setName("XYZ");
		o2.start();

	}
}
