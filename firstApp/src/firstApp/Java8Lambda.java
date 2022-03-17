
package firstApp;

import java.util.stream.Stream;

public class Java8Lambda {
	
	final static String salutation = "Hello";
	int a=0;
	public static void  main (String ar[]) {
	
		//a=a+1;
	//GreetingService service = s -> System.out.println(s+saluation);
	//salutation = salutation + "aruna";
		
	GreetingService insertService = s -> {
		return s + salutation;
	};
	System.out.println(insertService.insertEmployee("Welcome"));
	
	}
	
	

}

 interface GreetingService {
 String insertEmployee(String message);
}
