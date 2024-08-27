package Abstract;

public abstract class Visa {

	int TransactionId;

	public Visa(int transactionId) {

		TransactionId = transactionId;
	}

	protected void Operation() {
		System.out.println("CHecking balance");
		System.out.println("Status of transaction");
	}

	public abstract boolean Auth();

	public abstract boolean OTPverify();

	public abstract String transaction();

}
