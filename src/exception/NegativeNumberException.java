package exception;

public class NegativeNumberException extends Exception{
	
	public NegativeNumberException (double weight) {
		super ("You are trying to uso a negative number "+weight);
	}
}
