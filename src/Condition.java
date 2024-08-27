
public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 123;
		int b = 34;
		System.out.println(a > b ? a : b);
		System.out.println(a > b ? "Max value is " + a : "Max value is " + b);
		int c = 678;

		System.out.println(a > b ? (a > c ? a : c) : (b > c ? b : c));

		// if-else
		if (a > b) {
			System.out.println("Max value is " + a);
		} else {
			System.out.println("Max value is " + b);
		}

		if (a > b && a > c) {
			System.out.println("max value is " + a);
		} else if (b > a && b > c) {
			System.out.println("Max value is " + b);
		} else {
			System.out.println("Max value is " + c);
		}

		int p = 90, q = 23, r = 34, s = 56;
		if (p > q && p > r && p > s) {
			System.out.println(p + " has max value");
		} else if (q > p && q > r && q > s) {
			System.out.println(q + " has max value");
		} else if (r > p && r > q && r > s) {
			System.out.println(r + " has max value");
		} else {
			System.out.println(s + " has max value");
		}

		//Switch -- equal
		
		int month =5;
		switch(month)
		{
		case 1:System.out.println("Jan");
		break;
		case 2: System.out.println("Feb");
		break;
		case 3: System.out.println("MArch");
		break;
		default: System.out.println("Invalid Month");
		}
			
	}

}
