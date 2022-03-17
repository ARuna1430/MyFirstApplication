package firstApp;

import java.util.ArrayList;

class GenericsImplementation<T> {
	T genObj;
	/*public GenericsImplementation(T genObj) {
		// TODO Auto-generated constructor stub
		this.genObj = genObj;
	}
	public T display() {
		return genObj;
		
	}*/
	public void print(T element) {
		System.out.println("element is:"+element);
		
}
}

public class JavaGenerics {
	public static void main(String ar[]) {
		System.out.println("Inside main mehtod:");
	//	Integer i = 23;
	//	String s= "Hi aruna";
	ArrayList al = new ArrayList();	
	al.add("Avi");
	al.add("Megha");
	al.add("10");
	for(Object x:al) {
		System.out.println("Arraylist is:"+(x.toString()));
		
	}
	
	System.out.println("First element is:"+al.get(0));
	System.out.println("First element is:"+al.get(2));

	
		GenericsImplementation<Integer> g = new GenericsImplementation();
		GenericsImplementation<String> gs = new GenericsImplementation();
		g.print(12);
		gs.print("Welcome");

		/*System.out.println(g.display());
		System.out.println(g.print(3));

		System.out.println(gs.display());
		System.out.println(gs.print("aruna"));*/

		
		
		
	}

}
