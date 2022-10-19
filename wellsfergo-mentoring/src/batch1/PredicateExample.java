package batch1;

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
		
		Predicate<Integer> p1 = n-> n>20;
		Predicate<String> p2 = str -> str.length()>10;
		Predicate<Integer> p3 = n -> n%2==0;
		
		Predicate<User> p4 = usr-> usr.uid.equals("admin") && usr.pwd.equals("12345");
		
		System.out.println(p1.test(25));  // true
		System.out.println(p1.test(2));  // false
		System.out.println(p2.test("praveen")); // false
		System.out.println(p2.test("praveen kumar")); // true
		System.out.println(p3.test(5));  // false
		System.out.println(p3.test(18));  // true
		
		System.out.println(p1.and(p3).test(27));
		System.out.println(p1.or(p3).test(27));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user name");
		String u = sc.next();
		System.out.println("Enter password");
		String p = sc.next();
		User user = new User(u,p);
		
		if(p4.test(user))
			System.out.println("Valid user");
		else
			System.out.println("Invalid user");
		

	}

}
