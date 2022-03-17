package firstApp;



class Employee {
	String name;
	int id;
	public static String comName = "Georgia";
	public static int counter=0;

	public Employee (String name,int id) {
		System.out.println("Inside constructor:");
		this.name = name;
		this.id = id;
	}
}

public class StaticClassExample {
	private static Employee employeeDetail(String name,int id) {
		System.out.println("Inside static method");
		return new Employee(name, id) ;
		
	}
	public static void main(String ar[]) {
		System.out.println("Inside main method"+Employee.comName);
		System.out.println("Inside main method"+test.comName);
		String s = test.display();
		System.out.println(s);


		String empName = "Megha";
		int empId = 123;
		Employee emp = employeeDetail(empName,empId);
		System.out.println("Name:"+emp.name);
		System.out.println("id:"+emp.id);

		
		
	}

}
