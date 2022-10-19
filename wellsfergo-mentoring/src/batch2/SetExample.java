package batch2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;




class Employee { //extends Object implements Comparable<Employee> {

	Integer id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	/*
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(this.id> o.id)
			return -1;
		else if(this.id < o.id)
			return 1;
		else
			return 0;
	}
	*/
	
	@Override
	public String toString() {
		return this.id+" "+this.name;
	}
	
	
	@Override
	public boolean equals(Object Obj) {
		
		 if (Obj instanceof Employee) {
		        Employee another = (Employee) Obj;
		        if (this.id.equals(another.id) &&
		            this.name.equals(another.name))  {
		                return true;
		        }
		    }
		 
		 return false;
	}
	@Override
	public int hashCode() {
		
		return 346798;
	}
	
	
}
/*
class NameComporator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	
}

// (e1,e2)->e1.name.compareTo(e2.name);


class IdComporator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.id> o2.id)
			return 1;
		else if(o1.id < o2.id)
			return -1;
		else
			return 0;
	}
	
}


 * (e1,e2)-> e1.id - e2.id;
 * 
 */
public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashSet hs = new HashSet<>();
		Set ss;
		
	//	TreeSet hs = new TreeSet<>();
		Set<String> hs = new TreeSet<>();
		TreeSet<Employee> ts =new TreeSet<>((e1,e2)->e1.name.compareTo(e2.name));
		TreeSet<Employee> ts1= new TreeSet<>((e1,e2)-> e1.id-e2.id);
		ArrayList<Employee> ar = new ArrayList<>();
		
		
		ar.add(new Employee(1001,"kishore"));
		ar.add(new Employee(1020,"anil"));
		ar.add(new Employee(1005,"ravi"));
		System.out.println("Inside the array");
		System.out.println(ar);
		Collections.sort(ar, (e1,e2)-> e1.id-e2.id);
		System.out.println("list after sorting on name basis");
		System.out.println(ar);
		
		
		ts.add(new Employee(1001,"kishore"));
		ts.add(new Employee(1020,"anil"));
		ts.add(new Employee(1005,"ravi"));
		
		ts1.add(new Employee(1001,"kishore"));
		ts1.add(new Employee(1020,"anil"));
		ts1.add(new Employee(1005,"ravi"));
		System.out.println("with name sorting..");
		System.out.println(ts);
		
		System.out.println("with id sorting..");
		System.out.println(ts1);
		
		
		hs.add("india");
		hs.add("china");
		hs.add("japan");
		hs.add("india");
		System.out.println(hs);
		
		System.out.println("by using forEach");
		
		hs.forEach(System.out::println);
		
		for(String e:hs) {
		System.out.println(e);	
		}
		
		
		String str1="Hello";
		String str2="Hello";
		if(str1.equals(str2))
			System.out.println("equal");
		else
			System.out.println("not equal..");
		
				
		Employee e1 = new Employee(1001,"kishore");
		Employee e2 = new  Employee(1002,"kishore");
		
		Set<Employee> emps= new HashSet<>();
		emps.add(e1);
		emps.add(e2);
		System.out.println(emps);
		if(e1.equals(e2))
			System.out.println("equal");
		else
			System.out.println("not equal..");
		
		String str4="hello";
		String str5="hello";
		if(str4==str5)
			System.out.println("EQUAL");
		
		String str6=new String("hello");
		String str8=new String("hello");
		if(str6==str8)
			System.out.println("equal");
		else
			System.out.println("NOT EQUAL");

	}

}
