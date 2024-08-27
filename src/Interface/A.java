package Interface;

public interface A extends D {



	static void welcome() {
		System.out.println("Welcome is called");
	}

	default void sum() {
		System.out.println(12 + 34);
	}

	void message();

	void print();

}
