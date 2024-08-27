package Composition;

import java.util.ArrayList;

public class B {

	int num;
	static String name;
	ArrayList<Person> persons;

	B(ArrayList<Person> persons) {
		this.num = 89;
		this.name = "Roberto";
		this.persons = persons;
	}

	public ArrayList<Person> getPersons() {
		return persons;
	}

	void message() {
		System.out.println("Messafe is called");
	}

	static void print() {
		System.out.println(name);
	}
}
