package batch2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> ar = new ArrayList<>();
		List<Integer> ar1 = new ArrayList<>();
		
		ar.add(100);
		ar.add(20);
		ar.add(34);
		ar.add(45);
		ar.add(8);
		for(int x:ar)
		{
			if(x%5==0)
				ar1.add(x);
		}
		System.out.println(ar1);
		
		
		//List<Integer> result = ar.stream().filter(x->x%5==0).collect(Collectors.toList());
		
		List<Integer> result = ar.stream().map(x->x+10).collect(Collectors.toList());
		
		Optional<Integer> x1 =ar.stream().map(x->x+10).min((a,b)->-(a-b));
		
		System.out.println(result);
		System.out.println(x1);
		
		
		

	}

}
