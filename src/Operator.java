
public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// operator - in java operator is symbol that perform operations on variables and values 
		/* Type of Operator 
		 * Arithmetic operator - +,-,*,/,%(remainder)
		 * Relational operator - ==, !=, <, >, <=, >=   return type boolean
		 * Logical operator - !(not), &&(and), ||(or)
		 * Assignment operator - =, +=, -=, *=, /=
		 * Bitwise operator - &(And), |()or, <<(left shift), >>(right shift), ^(XOR)
		 * Ternary operator - ?:
		 * */
		//doesn't matter what type of arithmetic operation we are performing return of integer are always going to be integer
		
		int num1=34;
		int num2 = 3;
		System.out.println(num1/num2);  //11 - integer
		System.out.println((float)num1/num2);
		System.out.println(num1/(float)num2);
		
		int p=23;
		int q=5;
		System.out.println(p%q); // 3
		
		//Relational operator - ==, !=, <, >, <=, >=   return type boolean

		System.out.println('A'=='a'); // false
		System.out.println('A'==65);
		System.out.println('A'!='B');
		System.out.println(90<=90);  //true
		System.out.println(90>=34);  //true
		
		//Logical operator - &&(and), ||(or)
		
		System.out.println(23>34 && 90>23);  //false
		System.out.println(23>34 || 90>23);    //true
		
		// Assignment operator - =, +=, -=, *=, /=
		
		int a=90;
		int b=78;
		a += b;   // a = a+b;
		System.out.println(a);  //168
		
		a -= b;  // a = a-b;   168-78 = 90
		System.out.println(a);
		
		//Bitwise operator - &(And), |()or, <<(left shift), >>(right shift), ^(XOR)
		
		int x= 5;  // Binary 101
		int y= 3;  // Binary 011
		System.out.println(x&y);  //1
		
		
		//Ternary operator - ?:
		System.out.println(23>34?"first":"second");
		System.out.println(x>y?x:y); //max value
		
		
		
		
		
		
		
		
	}

}
