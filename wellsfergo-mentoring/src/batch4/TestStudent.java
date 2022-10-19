package batch4;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class NameComparators implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	
}


public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1001,"kumar");
		Student s2 = new Student(1004,"sai");
		Student s3 = new Student(1004,"sai");
		Set<Student> ts = new LinkedHashSet<>();
		
		List<Student> ar = new LinkedList<>();
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(ts);

	}

}
