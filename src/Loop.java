
public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Loop is a property that is use to perform single task multiple times
		// for loop, while loop, do-while loop, for each loop
		
		for(int i=1;i<=10;i++)  // initiating, limit, updation
		{
			System.out.println("HI "+i);
		}
		
		for(int i=1;i<=10;i+=2)  // initiating, limit, updation
		{
			System.out.println("HI "+i);
		}
		
		for(int i=10;i>=1;i--)
		{
			System.out.println("Result"+i);
		}
		
//		for(;;)
//		{
//			System.out.println("Amit");
//		}
		
		int i=1;
		while(i<=10)
		{
			System.out.println("HI"+i);
			i++;
			
		}
		
//		while(true)
//		{
//			System.out.println("Saransh");
//		}
//		
		
		//execute atlease once because condition or limit is set at ends of the program
		 i=1;
		do {
			System.out.println("HI");
			i++;
		}while(i<=10);
		
		
		do {
			System.out.println("Do while");
		}while(true);
		
	}

}
