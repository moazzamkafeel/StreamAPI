package Basic;
  
public class CustomException extends Exception {

	public CustomException(String str) {
		super(str);
	}

	public CustomException(String str, Throwable th) {
		super(str, th);
	}
}
