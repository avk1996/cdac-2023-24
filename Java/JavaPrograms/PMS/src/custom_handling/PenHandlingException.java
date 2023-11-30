package custom_handling;

@SuppressWarnings("serial")
//what warning is given?
public class PenHandlingException extends Exception{
	public PenHandlingException(String errorMessage) {
		super(errorMessage);
	}
}