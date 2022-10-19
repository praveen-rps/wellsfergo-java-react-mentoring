package batch4;

import java.util.Scanner;
import java.util.function.Predicate;
class User{
	String uname;
	String passwd;
	public User(String uname, String passwd) {
		super();
		this.uname = uname;
		this.passwd = passwd;
	}
	@Override
	public String toString() {
		return "User [uname=" + uname + ", passwd=" + passwd + "]";
	}
	
}

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

public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> p1= x-> x%2==0;
		Predicate<Integer> p2= x-> x >10;
		Predicate<Emp> p4 = emp-> emp.sal <1000;
		Predicate<User> p3 = 
	    user-> user.uname.equals("admin") && user.passwd.equals("12345");
		
	    Scanner sc= new Scanner(System.in);
		
		System.out.println(p1.test(10));
		System.out.println(p1.test(17));
		System.out.println(p2.test(7));
		System.out.println(p2.test(27));
		
		System.out.println(p1.or(p2).test(4));
		System.out.println(p1.and(p2).test(24));
		System.out.println("Enter user id");
		String u = sc.next();
		System.out.println("Enter password");
		String p = sc.next();
		User user = new User(u,p);
		if(p3.test(user))
			System.out.println("Valid user");
		else
			System.out.println("invalid user");
		
		Emp e1 = new Emp(1001,"praveen",1000);
		Emp e2 = new Emp(1003,"kishore",500);
		Emp e3 = new Emp(1005,"sai",25000);
		
		System.out.println(p4.test(e1));
		System.out.println(p4.test(e2));
		System.out.println(p4.test(e3));
		
		
		
		
	}

}
