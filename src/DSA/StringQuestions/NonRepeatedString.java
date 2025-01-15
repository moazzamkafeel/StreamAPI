package DSA.StringQuestions;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatedString {

	public static void main(String[] args) {
		
		// Method 1 toCharArray
		String s = "mazozam";

		for (char ch : s.toCharArray()) {
			
			if (s.indexOf(ch) == s.lastIndexOf(ch)) {
				System.out.println("First non Repeated Character is--> " + ch);
				break;
			}
		}
		
		
		// java 8 method
		System.out.println("By Java 8---->  " + firstNonRepeatable(s));

	}
	// Method 2nd Using Java 8 smajh nhi aya

	public static Character firstNonRepeatable(String str) {

		Map<Character, Integer> map = new LinkedHashMap();

		for (Character ch : str.toCharArray()) {
			map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
		}
		return map.entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get().getKey();

	}

}