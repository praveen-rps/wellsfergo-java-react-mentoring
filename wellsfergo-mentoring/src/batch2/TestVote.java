package batch2;

import java.util.Scanner;

public class TestVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Vote v = new Vote();
		System.out.println("Enter your age");
		int age = sc.nextInt();
		try {
			v.checkEligibility(age);
		}
		catch(InvalidAgeException e) {
			System.out.println(e);
		}
		catch(InsufficientAgeException e) {
			System.out.println(e);
		}
		

	}

}
