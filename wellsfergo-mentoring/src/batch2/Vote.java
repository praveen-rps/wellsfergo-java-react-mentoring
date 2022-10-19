package batch2;

public class Vote {
	
	public void checkEligibility(int age) throws InvalidAgeException,
	InsufficientAgeException
	{
		if(age < 0 || age > 100)
			throw new InvalidAgeException();
		else if( age >0 && age < 17)
			throw new InsufficientAgeException();
		else
			System.out.println("you are eligible to vote...");
	}

}
