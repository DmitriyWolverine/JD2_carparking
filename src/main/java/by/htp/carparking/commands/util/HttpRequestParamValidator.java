package by.htp.carparking.commands.util;

public final class HttpRequestParamValidator {
	private HttpRequestParamValidator() {
		
	}
	
	public static void validateRequestParamNotNull(String ... str) {
		for(int i = 0 ; i < str.length ; ++i) {
			if(str[i] == null) {
				throw new ValidateNullParamException("Empty parameter recieved!");
			}
		}
	}
}
