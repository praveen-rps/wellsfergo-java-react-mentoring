package batch3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> ar = new ArrayList<>();
		ArrayList<String> ar1 = new ArrayList<>();
		ar.add("praveen");
		ar.add("sai");
		ar.add("kishore");
		ar.add("kamal");
		ar.add("balu");
		System.out.println(ar);
		
		for(String s:ar) {
			if(s.length()<=4)
				ar1.add(s);
		}
		
		System.out.println(ar1);
		
		List<String> r = ar.stream().filter(x->x.length()<=4).collect(Collectors.toList());
		
		System.out.println(r);
		
		
		
		
		
		List<String> result = ar.stream()
		.filter(x->x.length()<=4)
		.collect(Collectors.toList());
		System.out.println(result);


	}

}
