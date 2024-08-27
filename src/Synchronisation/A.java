package Synchronisation;

public class A extends Thread {
	int qunatity = 3;

	synchronized void order() {
		if (qunatity > 0) {
			System.out.println(Thread.currentThread().getName() + "Order Placed");
			this.qunatity--;
		} else {
			System.out.println("out of stock");
		}
	}

	@Override
	public void run() {
//		synchronized (this) {
//			order();
//		}

		order();

	}

	public static void main(String[] args) {

		A o = new A();
		Thread t1 = new Thread(o);
		t1.setName("Milan");
		t1.start();
		Thread t2 = new Thread(o);
		t2.setName("Jordan");
		t2.start();
		Thread t3 = new Thread(o);
		t3.setName("Ravi");
		t3.start();
		Thread t4 = new Thread(o);
		t4.setName("Muhi");
		t4.start();
		Thread t5 = new Thread(o);
		t5.setName("Haben");
		t5.start();

	}
}
