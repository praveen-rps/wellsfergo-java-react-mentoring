package batch4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProcessingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> data = new ArrayList<>();
		data.add("praveen");
		data.add("sai");
		data.add("mahesh");
		data.add("balu");
		
		Predicate<String> p = str->str.length()<=4;
		
	String n=	data.stream()
		.filter(p)
		//.sorted((s1,s2)->s1.compareTo(s2))
		.max((s1,s2)->s1.compareTo(s2)).get();
		//.collect(Collectors.toList());
	
	System.out.println(n);

	}

}
