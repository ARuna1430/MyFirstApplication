package firstApp;

class base {
	int a=5;
	public void baseMethod() {
		System.out.println("From basse Method:"+a);
	}
	
}

class sub  extends base{
	int b=105;
	public void subMethod() {
		System.out.println("From sub Method:"+b);
	
}
}
public class test {
	public static String comName = "XXX";
	
	public static String display() {
		return "im from test class static method";
		
	}

	public static void main(String args[]) {
		System.out.println("hello world");
		sub sobj = new sub();
		sobj.baseMethod();
		sobj.subMethod();
		System.out.println("a:"+sobj.a);
		System.out.println("b:"+sobj.b);

	}

}
