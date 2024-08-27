
public class Welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to Java Training");
		System.out.print("\tIt is use for Tab Space ");
		System.out.println("Third Statement");
		System.out.println("\nFourth Line");

		var first = 23;
		var second = 78;
		var total = first + second;
		System.out.println("total of " + first + " and " + second + " is " + total);

		var a = 23;
		var b = 45;
		var c = 34;
		// product of 23, 45 and 34 is 23*45*34
		System.out.println("product of " + a + ", " + b + " and " + c + " is " + (a * b * c));

		// single line comment - ctrl+/
		// Data Type in Java
		// 1. Primitive Data Type
		// 2. Non Primitive Data Type

		// multiline comment - ctrl+ shift+/
		/*
		 * primitive Data Types int - non decimal value size - 32 bits / 4 bytes range -
		 * -2^31 to 2^31-1
		 * 
		 * byte - non decimal value size - 8 bits / 1byte range - -128 to 127
		 * 
		 * short - non decimal values size - 16 bits / 2 bytes range - -32,768 to 32,767
		 * 
		 * long - non decimal values size - 64 bits / 8 bytes range - -2^63 to 2^63-1
		 * 
		 * byte < short < int < long
		 * 
		 * float - decimal values size - 32 bits / 4 bytes range - +-3.4*1038 ( 6-7
		 * significant decimal digits)
		 * 
		 * double - decimal values size - 64 bits / 8 bytes range - 15 significant
		 * decimal digits
		 * 
		 * boolean - true/ false example - 78>90? false size - 1bits range - true or
		 * false
		 * 
		 * 
		 * char - 'A' or '@' or '8' size - 16 bits / 2bytes
		 * 
		 */

		int i = 34;
		int j = 45;
		int sum = i + j;
		System.out.println(sum);

		byte i2 = 34;
		byte j2 = 60;
		byte sum2 = (byte) (i2 + j2); // type casting
		System.out.println(sum2);

		short i3 = 89;
		short j3 = 67;
		short sum3 = (short) (i3 + j3);
		System.out.println(sum3);

		long i4 = 90293840290438l;
		long j4 = 78;
		long sum4 = i4 + j4;
		System.out.println(sum4);
		short sum5 = (short) (i4 + j4);
		System.out.println(sum5);

		float p = 23; // int into float
		System.out.println(p);
		float q = 2334232329l; // long can't store in float
		System.out.println(q);
		float r = 34.45f; // by default in java all the decimals are double
		System.out.println(r);

		double x = 34.45; // by default it is double
		double y = 23;
		double sum0 = x + y;
		System.out.println(sum0);
		System.out.println(x + y);
		
		char sign = 'A';
		System.out.println(sign);
		char sign2 = 65;     //ASCII 
		System.out.println(sign2);
		char sign3 = 66;
		System.out.println(sign3);
		char sign4 = 97;
		System.out.println(sign4);
		char sign5 = '7';
		System.out.println(sign5);
		
		boolean check = 34>23;  //true
		System.out.println(check);
		boolean check3 = 90!=90; //  not equals to  -  false
		System.out.println(check3);
		
		int k = 'a';
		System.out.println(k);
		

	}

}
