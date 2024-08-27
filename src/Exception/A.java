package Exception;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			throw new Exception("User Defined Exception");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			int i = 2 / 0;
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		} finally {
			System.out.println("Finally");

		}
		A o = new A();
		try {
			A o2 = (A) o.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println(e.getLocalizedMessage());
		} finally {
			System.out.println("Finally Block");

		}

	}

}
