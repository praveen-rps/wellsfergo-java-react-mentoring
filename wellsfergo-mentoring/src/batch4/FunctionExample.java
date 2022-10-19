package batch4;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Double> s = ()-> Math.random();
		
		Function<Integer,Integer> f1 = x->x*x;
		Function<Integer,Integer> f2 = x->x/2;
		Predicate<Emp> p4 = emp-> emp.sal <1000;
		
		Function<Emp,Emp> f= emp->{
				if(p4.test(emp))
					emp.sal+=1000;
			return emp;
		};
		
		Consumer<Emp> c= emp->{
			System.out.println("Employee Id: "+emp.id );
			System.out.println("Employee Name: "+emp.name );
			System.out.println("Employee Salary: "+emp.sal );
		};
		System.out.println(f1.apply(4));
		System.out.println(f2.apply(4));
		System.out.println(f1.andThen(f2).apply(4));
		System.out.println(f1.compose(f2).apply(4));
		
		Emp e1 = new Emp(1001,"praveen",500);
		Emp e2 = new Emp(1003,"kishore",500);
		Emp e3 = new Emp(1005,"sai",25000);
		
		c.accept(f.apply(e1));
		c.accept(f.apply(e2));
		c.accept(f.apply(e3));
		
		System.out.println(s.get());
		
		System.out.println(s.get());
		
		System.out.println(s.get());
		
		
	}

}
