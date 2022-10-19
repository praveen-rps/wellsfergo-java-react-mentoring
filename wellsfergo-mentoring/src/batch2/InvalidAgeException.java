package batch2;

public class InvalidAgeException extends RuntimeException{
	
	public InvalidAgeException() {
		super("Age cannot be <0 or >100");
	}

}
