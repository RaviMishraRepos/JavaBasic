package Inheritance;

public class A extends B {

	public static void main(String[] args) {

		A o = new A();
		System.out.println(B.name);
		System.out.println(o.num);
		o.message();
		B.print();
		
		System.out.println(o.getName());
		o.setName("Jordan");
		System.out.println(o.getName());
		
	}
}
