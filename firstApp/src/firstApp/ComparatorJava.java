package firstApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student {
	int rollNo;
	String firstName;
	String lastName;
	
	public Student(int rollNo,String firstName,String lastName) {
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	public String getLasName(Student s) {
		return s.lastName;
	}
	
	public String toString() {
		return this.firstName + "+++++++"+this.rollNo+"+++"+this.lastName;
		
	}
}

/*class SortByName implements Comparator<Student>
	{
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.firstName .compareTo(o2.firstName);
	}


}
class SortByRollNo implements Comparator <Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.rollNo-o2.rollNo;
	}
	
}*/

public class ComparatorJava {
	public static void  main(String ar[]) {
		ArrayList<Student> al = new ArrayList();
		al.add(new Student(111, "Aruna","Mani"));
		al.add(new Student(121, "Megha","Peter"));
		al.add(new Student(11, "Avira","Peter"));
		al.add(new Student(8,"vetri","raja"));
		al.add(new Student(2,"riya","raja"));

		
		for(Object s:al)
			System.out.println(s);
		
		//Collections.sort(al,(s1,s  
		
		Collections.sort(al,(s1,s2)->( s1.firstName.compareTo(s2.firstName))) ;
        System.out.println("After sorted by name:"+al);
        
		Collections.sort(al,(s1,s2)->s1.rollNo-s2.rollNo);
        System.out.println("After sorted by name:"+al);
        
        Collections.sort(al,(s1,s2)->s1.lastName.compareTo(s2.lastName));

        List<Student> l = al.stream().filter(student -> student.lastName.startsWith("M")).collect(Collectors.toList());
        l.forEach(x->System.out.println(x.lastName));
		
		
	}

}
