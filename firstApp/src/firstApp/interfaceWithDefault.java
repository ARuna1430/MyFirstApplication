/**
 * 
 */
package firstApp;

/**
 * @author arunapeter
 *
 */
interface myFirstInterface {
	
	public void sum(int a);
	public void doPrint();
	
	default void display() {
		System.out.println("From default method");
	}
}
public class interfaceWithDefault implements myFirstInterface{

	/**
	 * @param args
	 */
	public void sum(int b){
		System.out.println("The sum value is:"+(b+b));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interfaceWithDefault obj = new interfaceWithDefault();
		obj.display();
		obj.sum(100);
		obj.doPrint();

	}
	@Override
	public void doPrint() {
		// TODO Auto-generated method stub
		System.out.print("inside overriden method");
		
	}

}
