package firstApp;

public class DependencyJAVA {
	private interfaceWithDefault inObj;

	public DependencyJAVA(interfaceWithDefault inObj) {
		this.inObj = inObj;
		// TODO Auto-generated constructor stub
		
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DependencyJAVA depObj = new DependencyJAVA(new interfaceWithDefault());
		System.out.println("Inside main method");
		
	depObj.inObj.display();

	}

}
