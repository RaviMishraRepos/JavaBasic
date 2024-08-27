
public class StringHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Ravi";
		String name2 = "Ravi";
		String name3 = new String("Ravi");
		System.out.println(name==name2);   // in case of string == refers to object
		System.out.println(name==name3);
		System.out.println(name.equals(name3));  //value & case
		String name4 = new String("ravi");
		System.out.println(name3==name4);  //objects are diff thats why false
		System.out.println(name3.equals(name4));  //false 
		System.out.println(name3.equalsIgnoreCase(name4)); // value
		
		//methods of String
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.charAt(0));
		System.out.println(name.concat(" Mishra"));
		System.out.println(name);
		System.out.println(name.startsWith("ra"));
		System.out.println(name.endsWith("vi"));
		System.out.println(name.substring(1));
		System.out.println(name.substring(2,4));
		System.out.println(name.indexOf('i'));
		
		String num = "23";
		int num2=34;
		System.out.println(num+num2);  //2334
		System.out.println(Integer.parseInt(num)+num2);  //57
		
		String num3 = "434.343f";
		System.out.println(Float.parseFloat(num3)+num2);
		
		String num4 = "23423.32423";
		System.out.println(Double.parseDouble(num4)+num2);

		
		int p=90;
		int q=23;
		System.out.println(String.valueOf(p)+q);
		
		
		
		
		
		
		
	}

}
