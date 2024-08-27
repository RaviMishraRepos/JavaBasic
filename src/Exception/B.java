package Exception;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter 2 number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
			System.out.println(a / b);
		} catch (Exception e) {
			main(args);
		} finally {
			System.out.println("Program Ends");
		}
		
		
		System.gc();
	}

}
