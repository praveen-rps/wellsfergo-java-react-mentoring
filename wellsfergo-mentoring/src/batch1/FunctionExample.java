package batch1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

class Emp{
		int id;
		String name;
		int sal;
		public Emp(int id, String name, int sal) {
			super();
			this.id = id;
			this.name = name;
			this.sal = sal;
		}
		@Override
		public String toString() {
			return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
		}
		
}

public class FunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<Double> s = ()-> Math.random();
		
		Function<Integer,Integer> f1 = n->n*n;
		Function<Integer,Integer> f2= n->n/2;
		Function<Emp,Emp> f3 = emp->{
			if(emp.sal<1000)
				emp.sal=emp.sal+1000;
			
			return emp;
		};
		
		Consumer<Emp> c = emp->{
			System.out.println("Employee Id: "+emp.id);
			System.out.println("Employee Name: "+emp.name);
			System.out.println("Employee Salary: "+emp.sal);
		};
		
		System.out.println(f1.apply(4));
		System.out.println(f2.apply(8));
		
		System.out.println("And Then: 4-->" +f1.andThen(f2).apply(4));
		System.out.println("Compose : 4-->"+f1.compose(f2).apply(4));
		
		Emp e1 = new Emp(1001,"praveen",5000);
		Emp e2 = new Emp(1006,"sunil",500);
		Emp e3 = new Emp(1003,"kishore",3000);
		// Employee Name: xxxxx
		// Employee Salary: nnnnn
		// Employee id: yyyy
		
		c.accept(f3.apply(e1));
		c.accept(f3.apply(e2));
		c.accept(f3.apply(e3));
		
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	
		
	}
}
