package firstApp;

public class checkPolindromeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stubint
		int number = 757;
		int tempNo=number;
		int reminder;
		int sum=0;
		String s = "avira";
		char revStr[];
		for(int j=s.length()-1;j>=0;j--) {
			//revStr = revStr.concat(s[j]);
		}
		StringBuffer s1 = new StringBuffer (s.toLowerCase());
		System.out.println("s1::::"+s1);
	    StringBuffer t = s1;
		StringBuffer s2 = new StringBuffer(s1.reverse());
		System.out.println("s1::::"+s1);

		char c[] = null;
		System.out.println("Given Number is:"+number);
		while(number>0) {
			reminder = number % 10;
			sum = (sum * 10) + reminder ;
			number = number / 10;
			
		}
		if(tempNo == sum)
			System.out.println("given no is polindrome");
		else
			System.out.println("given no is not a polindrome");
		System.out.println("+++++++++++");
		
		System.out.println("Given string is:"+t);
		System.out.println("duplicate string is:"+s2);

		if(t.equals(s2)) 
			System.out.println("String is Polindtrome::"+s1);
		else
			System.out.println("String is not Polindtrome::"+s1);

		//StringBuffer t1 = new StringBuffer("amma");
		StringBuffer str = new StringBuffer("abba");
		StringBuffer t2 = new StringBuffer();;
		for(int i=str.length()-1;i>=0;i--) {
			t2 = t2.append(str.charAt(i));
			System.out.println("t2::::"+t2);
		    
		}
		
		System.out.println("duplicated string is:"+t2);
		System.out.println("original string is:"+str);

		if((str.toString()).equals(t2.toString()))
			System.out.println("given string is polindrome:"+t2);
		else
			System.out.println("not polindrome string is:"+t2);


	}
		

}
