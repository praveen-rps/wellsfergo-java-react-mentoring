package batch3;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
class Emp{
	int id;
	String name;
	int sal;
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	public Emp(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
}

public class FunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Emp> p = emp->emp.sal<1000;
		
		Supplier<Double> s = ()-> 10000*Math.random();
		
		Consumer<Emp> c= emp->{
			System.out.println("Employee Number : "+emp.id);
			System.out.println("Employee Name : "+emp.name);
			System.out.println("Employee salary : "+emp.sal);
		};
		
		Function<Emp,Emp> f = emp->{
			if(p.test(emp))
				emp.sal+=1000;
			return emp;
		};
		
		Function<Integer, Integer> f1= x->x*x;
		Function<Integer,Integer> f2 =x->x/2;
		
		System.out.println(f1.apply(4));
		System.out.println(f2.apply(4));
		
		System.out.println(f1.andThen(f2).apply(4));
		System.out.println(f1.compose(f2).apply(4));
		
		Emp e1 = new Emp(1001,"praveen",4000);
		Emp e2 = new Emp(1031,"balu",400);
		Emp e3 = new Emp(1020,"sai",2500);
		
		c.accept(f.apply(e1));
		c.accept(f.apply(e2));
		c.accept(f.apply(e3));
		
		
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		
		
		

	}

}
