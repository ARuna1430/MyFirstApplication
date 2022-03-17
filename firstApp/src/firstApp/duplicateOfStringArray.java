package firstApp;

public class duplicateOfStringArray {
	public static void main(String args[]) {
		String[] str = {"avira","aruna","peter","megha","avira","peter","avira","avira","aruna"};
		String[] s = {} ;
		int count ;
		for(int i=0;i<str.length;i++)
		{
		 count =1;
		 s =new String[str.length];
		 System.out.println("The length of S is:"+s.length);
			System.out.println("The string is:"+str[i]);

		    s[i] = str[i].toString();
			System.out.println("The new string is:"+s[i]);
			for(int k=0;k<s.length;k++) {
				if(s[k]!=s[i]) {

			for(int j=i+1;j<str.length;j++) {
			
				if(str[i].equals(str[j]) ) {
					count++;
					System.out.println("The duplicated string is:"+str[i]);
					System.out.println("The count is:"+count);
				}
				}
			}
				}
			}
	 	 }
		
		}

