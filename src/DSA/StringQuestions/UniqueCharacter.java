package DSA.StringQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UniqueCharacter {

	public static void main(String[] args) {

		// String has a unique character
		
		String s = "Moazzam";
		Stream<String> ss = Stream.of(s);
		List.of();
		
		List<String> list = ss
				.map(x -> x.split(""))// Split string into array of stream
				.flatMap(Arrays::stream)// Flatten from array to stream
				.distinct()
				.collect(Collectors.toList());
	  	         System.out.println(list);
		// System.out.println("print all unique character"+getUniqueCharacter(s));
		boolean result = false;

		HashSet<Character> hs = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			result = hs.add(s.charAt(i));
			if (result == false)
				break;
		}
		System.out.println(result);
	}

//	//All 
//	public static String getUniqueCharacter(String  s) {
//	 System.out.println(Stream.of(s)
//	           .map(w -> w.split(""))
//	           .flatMap(Arrays::stream)
//	           .distinct()
//	           .collect(Collectors.toList()));
//	return s;
//	}
}
