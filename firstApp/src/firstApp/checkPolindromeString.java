package firstApp;

import java.util.Scanner;

public class checkPolindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = scan.next();
		s= s.toLowerCase();
		System.out.println("The entered string is:"+s);
		String t="";
	
		for(int j=s.length()-1;j>=0;j--) {
			t = t+ s.charAt(j);
			System.out.println("t::::"+t);
		}
		if(t.equals(s))
			System.out.println("String is polindrome");
		else
			System.out.println("Not a polindrome");


	}

}
