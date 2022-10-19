package batch2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
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
		
		Supplier<Double> s = ()-> 10*Math.random();
		
		Predicate<Emp> p = emp-> emp.sal<1000;
		Consumer<Emp> c= emp->{
			System.out.println("Employee id---->"+emp.id);
			System.out.println("Employee Name---->"+emp.name);
			System.out.println("Employee Salary---->"+emp.sal);
			
		};
		
		Function<Emp,Emp> f = emp->{
			if(p.test(emp))
				emp.sal=emp.sal+1000;
			
			return emp;
		};
		
		Function<Integer,Integer> f1 = n->n*n;
		Function<Integer,Integer> f2 = n->n/2;
		
		System.out.println(f1.apply(4));
		System.out.println(f2.apply(4));
		
		System.out.println(f1.andThen(f2).apply(4));  //8
		System.out.println(f1.compose(f2).apply(4));/// 4
		
		Emp e1 = new Emp(1001,"praveen",5000);
		Emp e2 = new Emp(1003,"kishore",500);
		Emp e3 = new Emp(1001,"sunil",3000);
		
		c.accept(f.apply(e1));
		c.accept(f.apply(e2));
		c.accept(f.apply(e3));
		
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		
		
	}

}

/* Employee Id ---> 1001 
 * Employee Name--> praveen
 *  Employee Salary ---> 5000
 * 
 * 
 * */
