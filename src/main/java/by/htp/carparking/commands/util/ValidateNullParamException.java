package by.htp.carparking.commands.util;

public class ValidateNullParamException extends RuntimeException{

	private static final long serialVersionUID = -9100922698227694323L;

	public ValidateNullParamException() {
		super();
	}

	public ValidateNullParamException(String message, Throwable cause) {
		super(message, cause);
	}

	public ValidateNullParamException(String message) {
		super(message);
	}

	public ValidateNullParamException(Throwable cause) {
		super(cause);
	}
	
	
	

}
