package MultiThreading;

public class A extends Thread {

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

		if (currentThread().getName().equals("ABC")) {
			s1();
		}
		if (currentThread().getName().equals("XYZ")) {
			s2();
		}
	}

	public static void main(String[] args) {

		A o1 = new A();
		o1.setName("ABC");
		o1.start();

		A o2 = new A();
		o2.setName("XYZ");
		o2.start();

	}
}
