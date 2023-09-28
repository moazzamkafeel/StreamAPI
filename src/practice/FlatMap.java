package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {

	public static void main(String[] args) {

		
		List<String> stringList = Arrays.asList("1,2,3", "4,5,6", "7,8,9");
		
	 List<List<String>> ListOfList = stringList.stream()
				.map(str->Arrays.asList(str.split(","))).collect(Collectors.toList());
		System.out.println(ListOfList);
		
		List<String> list = stringList.stream()
		.flatMap(str->Arrays.stream(str.split(","))).collect(Collectors.toList());
		System.out.println(list);
	
//		List<List<String>> listOfLists = stringList.stream()
//		        .map(str -> Arrays.asList(str.split(",")))
//		        .collect(Collectors.toList());
//		
//		System.out.println(stringList);
//		
//		System.out.println("map "+listOfLists);
//		
//		
//		List<String> listOfValues = stringList.stream()
//		        .flatMap(str -> Arrays.stream(str.split(",")))
//		        .collect(Collectors.toList());
//
//		System.out.println("FlatMap"+listOfValues);
		
		
//		// Find duplicate word in list
//		String str="My name is Moazzam";
//
//		List<String> list = List.of("Kafeel", "Moazzam",
//				"Yasir", "Yasir");

//		Set<String> s = new HashSet<>();
//		Set<String> dup = list.stream().filter(x -> !s.add(x)).collect(Collectors.toSet());
//        System.out.println(dup);

        
//     Map<Character, Long> map = list.stream().collect(Collectors.groupingBy
//        		(Function.identity(),Collectors.counting()));
        
//     map.forEach((k,v)->System.out.println(k+"->"+v));
        
        
        
//       Map<Character, Long> map1 = str.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//        
//        map1.forEach((x,y)->System.out.println(x+" "+y));
        
        
        
        
        
        
        
        
        
	}

}
