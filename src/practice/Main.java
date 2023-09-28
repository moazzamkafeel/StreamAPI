package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) 
	{
//     List<String> list = List.of("Mom","Afzal","Moazzam","Moazzam");
//Map<Object, Long> map = list.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()));
//		map.forEach((a,b)->System.out.println(a+""+b));
//		
//		String str="Mohammad Moazzam Kafeel";
//		Map<Object, Long> map1 = str.chars().mapToObj(x->(char)x)
//				.collect(Collectors.groupingBy(x->x,Collectors.counting()));
//		map1.forEach((a,b)->System.out.println(a+""+b));
		
		
		Map<Integer, String> hm = new HashMap<>();
		hm.put(9, "Moazzam");
		hm.put(4, "Kafeel");
		hm.put(6, "Yasir");
		hm.put(8, "mehtab");
		hm.put(9, "Saddo");
		System.out.println(hm);
		var  sortedMap = hm.entrySet()
		            .stream()
		            .sorted(Map.Entry.comparingByValue())
		            .collect(Collectors.toMap(
		                Map.Entry::getKey,
		                Map.Entry::getValue,
		                (e1, e2) -> e1,
		                LinkedHashMap::new // Using LinkedHashMap to maintain the order
		            ));
		   System.out.println(sortedMap+"-----sortedMap");
		   
		   
		    List<String> names = Arrays.asList("Alice", "Bob", "Carol");

	        // Using Function.identity() in a map to preserve names as keys
	        Map<String, Integer> nameLengths = names.stream()
	                .collect(Collectors.toMap(
	                        Function.identity(), // Use the name itself as the key
	                        String::length       // Use the length of the name as the value
	                ));

	        System.out.println(nameLengths);
	}

}
