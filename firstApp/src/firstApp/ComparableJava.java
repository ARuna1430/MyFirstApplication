package firstApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class EmployeeDetails {
	int empID;
	String empName;
	String empAddress;
	
	public EmployeeDetails(int empID,String empName,String empAddress) {
		// TODO Auto-generated constructor stub
		this.empID = empID;
	    this.empName = empName;
	    this.empAddress = empAddress;
	}
	
	public String toString() {
		return this.empID+":"+this.empName+":"+this.empAddress;
		
	}
	
}
/*class SortByEmpID implements Comparable {

	public int compareTo(EmployeeObjectCreation o) {
		return o.empName.com;
	}
	
}*/

public class ComparableJava {
	public static void main(String ar[]) {
		ArrayList<EmployeeDetails> list = new ArrayList();
		
		list.add(new EmployeeDetails(10, "kavin", "Georgia"));
		list.add(new EmployeeDetails(30, "tharun", "Georgia"));
		list.add(new EmployeeDetails(50, "vivin", "Georgia"));
		list.add(new EmployeeDetails(20, "rose", "Georgia"));
		
		for(EmployeeDetails employeeDetails:list) 
		System.out.println(employeeDetails.toString());
		
		Collections.sort(list,(s1,s2)->s1.empID-s2.empID);
		
		System.out.println(list.toString());

	}

}
