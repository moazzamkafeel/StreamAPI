package StreamString;

import java.util.stream.Stream;

public class ConcateString {
	public static void main(String[] args) {
		
		String s1="Mr";
		String s2="Java";
//		System.out.println(s1.concat(s2));
		
		Stream<String> st = Stream.of(s1);
		Stream<String> st1 = Stream.of(s2);
 Stream.concat(st, st1).forEach(x->System.out.print(x));
		
		
		
		
		
	}

}
