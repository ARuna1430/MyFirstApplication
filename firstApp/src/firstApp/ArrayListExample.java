package firstApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListExample {
	public static void main(String ar[]) {
		ArrayList al= new ArrayList();
		al.add("java");
		printRawTypeList(al);
		printUnboundedTypeList(al);
	}
	public static void printRawTypeList(ArrayList rawType) {
		for(Object o:rawType) {
			System.out.println("rawType is:"+rawType);
			
		}
		rawType.add(101);
		rawType.add("110");
		rawType.add(121.22);
		
	}
	public static void printUnboundedTypeList(ArrayList<?> unboundList) {
		for(Object o:unboundList) {
			System.out.println("rawType is:"+unboundList);
			
		}
		//unboundList.add(300);
		List al = new ArrayList();
		al.add("kavi");
		al.add("sanu");
		al.add("vetri");
		al.add("kalai");
		
		for(Object o:al) {
			System.out.println(o.toString());
		}
	Collections.sort(al);
	System.out.println("The sorted list is:"+al.toString());
	Collections.reverse(al);
	System.out.println("The sorted list is:"+al.toString());


	}
}
