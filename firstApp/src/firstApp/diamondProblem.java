package firstApp;


class A
{
	public void display() {
		System.out.println("From class A");
	}
}
class B extends A
{
	public void display() {
		System.out.println("From class B");
	}
}
class C extends A
{
	public void display() {
		System.out.println("From class C");
	}
}
public class diamondProblem extends B
{             
	public static void main(String args[]) {
		diamondProblem dobj = new diamondProblem() ;		
		dobj.display();	
	}
	
}
