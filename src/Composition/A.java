package Composition;

import java.util.ArrayList;

public class A {

	public static void main(String[] args) {

		Person p1 = new Person("Muhi");
		Person p2 = new Person("Zaynab");

		ArrayList<Person> persons = new ArrayList<Person>();
		persons.add(p1);
		persons.add(p2);

		B o = new B(persons);
		System.out.println(o.num);
		System.out.println(B.name);
		B.print();
		o.message();
		System.out.println(o.getPersons());

	}
}
