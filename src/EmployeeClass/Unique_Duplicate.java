package EmployeeClass;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Unique_Duplicate {
	public static void main(String[] args) {
//		
		List<String> list = List.of("Moazzam", "Yasir", "Kafeel", "Asim", "Yasir", "Yasir");
//		
//		

//
	 Map<Object, Long> oc = list.stream().collect(Collectors
		.groupingBy(x->x,Collectors.counting()));
//		
//	oc.entrySet().stream().forEach(x->System.out.println(x.getKey()+"--"+x.getValue()));
		String str = "Moazzam";
		Map<Character, Long> map = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		map.entrySet().stream().forEach(x -> System.out.println(x.getKey() + "  -- " + x.getValue()));

	}

}
