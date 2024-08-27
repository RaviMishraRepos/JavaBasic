package Interface;

public class B implements A,C {

	public static void main(String[] args) {
		B o = new B();
		o.message();
		o.print();
		A.welcome();
		System.out.println(D.num);
		o.sum();

	}

	@Override
	public void message() {
		// TODO Auto-generated method stub

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub

	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		
	}

}
