package batch4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l1 = new ArrayList();
		List<Integer> l2 = new ArrayList();
		Predicate<Integer> p = x->x%5==0;
		Function<Integer,Integer> f = x->x+10;
		
		l1.add(10);
		l1.add(20);
		l1.add(43);
		l1.add(24);
		l1.add(50);
		
		for(int x: l1) {
			if(x%5==0)
				l2.add(x);
		}		
		
		/*
		List<Integer> result1 = 
				l1.stream().filter(p).collect(Collectors.toList());
		System.out.println(result1);
		*/
		/*
		
		List<Integer> result2 = 
				l1.stream().map(f).collect(Collectors.toList());
				
				
		*/
		
		//long cnt = l1.stream().filter(p).count();
		Comparator<Integer> c= (a,b)->-(a-b);
		System.out.println(l1.stream().filter(p).sorted(c));
	
	}

}
