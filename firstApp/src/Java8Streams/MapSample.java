package Java8Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	int empID;
	String empName;
	int empSalary;
	
	Employee(int empID,String empName,int empSalary) {
	this.empID = empID;
	this.empName = empName;
	this.empSalary = empSalary;
	}
	
	
}

public class MapSample {
	public static void main(String ar[])
	{
		List<String> studentList = Arrays.asList("aruna","vetri","shriya");
		
		List<String> studentList1 = Arrays.asList("sarani","kalai","mahi");

		List<String> studentList2 = Arrays.asList("sanu","sasu","malar");
		
		List<List<String>> finalList = Arrays.asList(studentList,studentList1,studentList2);
		
		studentList.stream().filter(s->s.startsWith("a")).forEach(x->System.out.println(x));
		
		List<String> stList = finalList.stream().flatMap(stuList->stuList.stream()).filter(stringObj->stringObj.startsWith("s")).collect(Collectors.toList());
		System.out.println(stList);

		List<Employee> empList1 = Arrays.asList(new Employee(23,"john",10000),new Employee(21,"smith",20000));
		List<Employee> empList2 = Arrays.asList(new Employee(12,"peter",30000),new Employee(13,"paul",40000));
		List<List<Employee>> finalEmpList = Arrays.asList(empList1,empList2);
		
		List names=finalEmpList.stream().flatMap(emp->emp.stream()).map(e->e.empName).collect(Collectors.toList());
		System.out.println(names);

		
	}

}
