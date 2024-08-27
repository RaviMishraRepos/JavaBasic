package Abstract;

import java.util.Random;

public class A extends Visa {

	public A(int transactionId) {
		super(transactionId);

	}

	public static void main(String[] args) {

		Random rand = new Random();
		int id = rand.nextInt(10, 100);

		A o = new A(id);
		o.Auth();
		o.OTPverify();
		o.transaction();
		System.out.println(o.TransactionId);
		o.Operation();

	}

	@Override
	public boolean Auth() {
		// code auth
		return false;
	}

	@Override
	public boolean OTPverify() {
		// code otp verifi
		return false;
	}

	@Override
	public String transaction() {
		// code for tran
		return "";
	}

}
