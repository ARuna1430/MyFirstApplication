package collectionsPrograms;

import java.util.*;

public class simpleArrayList {
	public static void main(String args[]) {
		
		ArrayList al = new ArrayList();
		al.add("megha");
		al.add("avira");
		al.add("aruna");
		al.add("peter");
		al.add("megha");
		al.add("aruna");
		
		Iterator itr = al.iterator();
		//System.out.println("+++++"+al.contains("megha"));
		String str=new String();
		while(itr.hasNext()) {
			str= itr.next().toString();
			
			System.out.println("The String is:"+str);
			
			for(int i=1;i<al.size();i++) {
			System.out.println("al.get is"+al.get(i));
			if(str.equals(al.get(i))) {
				System.out.println("duplicated"+str);
			}
			
			
			
		}
			

		}
		
		
		
	}

}
