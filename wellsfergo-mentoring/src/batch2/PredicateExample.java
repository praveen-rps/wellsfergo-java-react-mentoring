package batch2;

import java.util.Scanner;
import java.util.function.Predicate;
class User{
	String uid;
	String pwd;
	public User(String uid, String pwd) {
		super();
		this.uid = uid;
		this.pwd = pwd;
	}
	
}

public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Predicate<Integer> p1 = x->x%2==0;
		Predicate<Integer> p2 = x->x>20;
		Predicate<User> p3  = user-> user.uid.equals("admin") &&
				user.pwd.equals("12345");
		
		
		System.out.println(p1.test(10)); //true
		System.out.println(p1.test(15)); //false
		System.out.println(p2.test(10)); //false
		System.out.println(p2.test(100)); //true
		
		System.out.println("Enter user name ");
		String u = sc.next();
		System.out.println("Enter password");
		String p = sc.next();
		User user = new User(u,p);
		if(p3.test(user))
			System.out.println("Valid user");
		else
			System.out.println("Invalid user");
		
		System.out.println(p1.and(p2).test(31));
		System.out.println(p1.or(p2).test(31));
		
		

	}

}
