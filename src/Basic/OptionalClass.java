package Basic;

import java.util.Optional;

public class OptionalClass {
	
	public static void main(String[] args) {
		
		String s=null;
		
		Optional<String> m = Optional.ofNullable(s);
		System.out.println(m.isPresent());
		
		System.out.println(m.orElse("Null is available"));
		
		
		
		
		
		
	}

}
