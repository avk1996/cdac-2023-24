package custom_exception;

public class CustomerHandlingException extends Exception {
	public CustomerHandlingException(String exceptionMessage){
		super(exceptionMessage);
	}
}