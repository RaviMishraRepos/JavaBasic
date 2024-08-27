
public class NonPrimitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Non Primitive DAta Types - Object/class
		// Object - its parent of all non primitive data Types / can store all type of values into object
		Object obj = 23;
		Object obj2 = 34.45f;
		Object obj3 = 34.23;
		Object obj4 = true;
		Object obj5 = 'A';
		Object obj6 = "Hi Object";
		System.out.println(obj);
		System.out.println(obj2);
		//System.out.println(obj+Obj2);   //not work
		System.out.println((int)obj+(float)obj2);  //type casting
		
		String name = "Ravi Shankar MIshra";    // immutable - can't change its value
		String nameage = "Ravi Shankar Mishra 29";
		String check = "23>34";
		System.out.println(nameage);
		System.out.println(check);
		name = "anvar";
		System.out.println(name);
		

	}

}
