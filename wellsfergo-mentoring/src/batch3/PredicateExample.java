package batch3;

import java.util.Scanner;
import java.util.function.Predicate;
class User{
	String uid;
	String pwd;
	@Override
	public String toString() {
		return "User [uid=" + uid + ", pwd=" + pwd + "]";
	}
	public User(String uid, String pwd) {
		super();
		this.uid = uid;
		this.pwd = pwd;
	}
	
}

public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> p1 = x->x%2==0;
		Predicate<Integer> p2 = x->x>10;
		
		Predicate<User> p3 = user-> user.uid.equals("admin") 
				&& user.pwd.equals("admin");
		
		System.out.println(p1.test(10));  //  true
		System.out.println(p2.test(20));  // true
		System.out.println(p1.test(11)); // false
		System.out.println(p2.test(2)); // false
		
		System.out.println(p1.and(p2).test(25));
		System.out.println(p1.or(p2).test(25));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter user name");
		String u= sc.next();
		System.out.println("Enter password");
		String p = sc.next();
		User user = new User(u,p);
		if(p3.test(user))
			System.out.println("Valid user");
		else
			System.out.println("Invalid user");

	}

}
