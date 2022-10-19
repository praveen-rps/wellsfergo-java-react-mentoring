package batch2;

public class InsufficientAgeException extends RuntimeException{
	
	
	public InsufficientAgeException() {
		super("Age is not sufficient to vote");
	}

}
