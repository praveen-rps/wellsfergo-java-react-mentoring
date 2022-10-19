package batch4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

class NameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	
}


class DeptComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.dept.compareTo(o2.dept);
	}
	
}

class IdComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.id > o2.id)
		return 1;
	else if(o1.id < o2.id)
		return -1;
	else
		return 0;
	}
	
}

class TitleComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return -o1.compareTo(o2);
	}
	
}

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet hs = new HashSet();
		hs.add("mango");
		hs.add("top");
		hs.add("apple");
		hs.add(100);
		System.out.println(hs);  // unsorted
		
		
		
		TreeSet<String> ts = new TreeSet();
		ts.add("mango");
		ts.add("top");
		ts.add("apple");
		//System.out.println(ts);  //  apple mango top
		for(String s:ts) {
			System.out.println(s);
		}
		
		ts.forEach(System.out::println);
				
		Employee e1 = new Employee(1020,"praveen","finance");
		Employee e2 = new Employee(1001,"sunil","sales");
		Employee e3 = new Employee(1015,"balu","quality");
		Employee e4 = new Employee(1009,"kamal","marketing");
		Employee e5 = new Employee(1009,"kamal","marketing");
		
		
		if(e4.equals(e5))
			System.out.println("equal");
		else
			System.out.println("not equal");
		
		TreeSet ts1 = new TreeSet(new DeptComparator());
		ts1.add(e1);
		ts1.add(e2);
		ts1.add(e3);
		ts1.add(e4);
		ts1.add(e5);
		System.out.println(ts1);
		
		
		/*
		TreeSet ts1 = new TreeSet(new DeptComparator());
		ts1.add(e1);
		ts1.add(e2);
		ts1.add(e3);
		ts1.add(e4);
		ts1.add(e5);
		System.out.println(ts1);// 
		
		ArrayList ar = new ArrayList<>();
		ar.add("mango");
		ar.add("top");
		ar.add("apple");
		System.out.println(ar);
		
		Collections.sort(ar,new TitleComparator());
		System.out.println(ar);
		*/

	}

}
