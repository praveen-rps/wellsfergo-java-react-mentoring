package batch1;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
/*

class Employee implements Comparable<Employee>{

	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int compareTo(Employee obj) {
		// TODO Auto-generated method stub
		
		if( this.id > obj.id)
			return -1;
		else if( this.id < obj.id)
			return 1;
		else
		return 0;
	}
	
	@Override
	public String toString() {
		return this.id+" "+this.name;
	}
	
}

*/

class Employee extends Object{

	int id;
	String name;
	public Employee() {
		
	}
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
	 public boolean equals(Object obj) {
		    if (obj instanceof Employee) {
		    	
		    	Employee emp = (Employee) obj;
		    	
		    	
		    }
		 
		    return false;
		}
	
	
	
	
}

class IdComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if( o1.id > o2.id)
			return 1;
		else if( o1.id < o2.id)
			return -1;
		else
		return 0;
	}
	
}

//(e1,e2)-> e1.id-e2.id;





class NameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	
}

/*
 * (e1,e20-> e1.name.compareTo(e1.name);
 * 
 * 
 */
public class TestCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//TreeSet s = new TreeSet<>(new IdComparator());
		
		
		/*s.add("india");
		s.add("china");
		s.add("japan");
*/
		//Set<Employee> s = new TreeSet<>((e1,e2)-> e1.id-e2.id);
		Set<Employee> s = new TreeSet<>((e1,e2)-> e1.name.compareTo(e2.name));
		
		Employee e1 = new Employee(1001,"praveen");
		Employee e2 = new Employee(1006,"kumar");
		Employee e4 = new Employee(1003,"anil");
		s.add(e1);
		s.add(e2);
		s.add(e4);
		s.forEach(System.out::println);
		/*
		if(e2.equals(e3))
			System.out.println("both are equals");
		else
			System.out.println("both are not equal");
		s.add(e1);
		s.add(e2);
		
		for(Employee e: s) {
			System.out.println("name: "+e.name+ "id:  "+e.id);
		}
		
		
		Iterator<Employee> itr = s.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		

		*/
		
		
		
				

	}

}
