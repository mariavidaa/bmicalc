package bmicalc;

public class NegativeValueException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	/**
	   * Exception thrown when the value of the parameter of the {@link Factorial#compute} method is a
	   * negative number
	   *
	   * @param errorMessage
	   */
	  public NegativeValueException(String errorMessage) {
	    super(errorMessage);
	  }

}
