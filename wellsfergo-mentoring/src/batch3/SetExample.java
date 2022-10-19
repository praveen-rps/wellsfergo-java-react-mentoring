package batch3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;



class Employee{//implements Comparable<Employee>{
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return this.id+" "+this.name;
	}
	
	@Override
	public boolean equals(Object Obj) {
		
		 if (Obj instanceof Employee) {
		        Employee another = (Employee) Obj;
		        if (this.id==another.id &&
		            this.name.equals(another.name))  {
		                return true;
		        }
		    }
		 
		 return false;
	}
	
	@Override
	public int hashCode() {
		return this.id;
	}

/*
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		//return -this.name.compareTo(o.name);
		
		if(this.id > o.id)
			return -1;
		else if (this.id < o.id)
			return 1;
		else
			return 0;
	}
	*/
}


class IdComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.id > o2.id)
			return 1;
		else if (o1.id < o2.id)
			return -1;
		else
			return 0;
	}
	
}

// 

class NameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.name.compareTo(o2.name);
	}
	
}
// (e1,e2)->e1.name.equals(e2.name));
public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set hs;
		
		// hs= new HashSet();
		// hs = new LinkedHashSet();
		 hs= new TreeSet();
		hs.add("india");
		hs.add("china");
		hs.add("japan");
		System.out.println(hs); // random
		
		TreeSet ts = new TreeSet();
		ts.add("india");
		ts.add("china");
		ts.add("japan");
		ts.add("india");
		System.out.println(ts);  //  sorted  china , india, japan
		
		Employee e1 = new Employee(1001,"kumar");
		Employee e2 = new Employee(1020,"anil");
		Employee e3 = new Employee(1006,"mahesh");
		Employee e4 = new Employee(1006,"mahesh");
		
		/*
		 * addEmployee(emp);
		 * 
		 * 
		 */
		
		if(e3.equals(e4))
			System.out.println("both are equal");
		else
			System.out.println("both are not equal..");
		
		TreeSet<Employee> hs1 = 
				new TreeSet<Employee>((e8,e9)->e1.name.compareTo(e2.name));
		hs1.add(e1);
		hs1.add(e2);
		hs1.add(e3);
		hs1.add(e4);
		System.out.println(hs1);
		
		ArrayList<Employee> ar = new ArrayList<>();
		ar.add(e1);
		ar.add(e2);
		ar.add(e3);
		System.out.println("before sorting...");
		
		for(Employee e:ar) {
			System.out.println(e);
		}
		System.out.println(ar);
		
		Collections.sort(ar,new NameComparator() );
		System.out.println("After sorting...");
		
		ar.forEach(System.out::println);
		//System.out.println(ar);
		
		
		
		

	}

}
