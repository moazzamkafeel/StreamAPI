package MrJava;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Unique_DuplicateWords {
	public static void main(String[] args) {
		List<String> list = List.of("Mrjava", "Java", "Subscribe", "Subscribe", "Subscribe", "Like");

		list.stream().filter(x -> Collections.frequency(list, x) > 1).forEach(x -> System.out.println(x));

//list.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()))
//.forEach((k,v)->{
//	if(v==1) {
//System.out.println(k+""+v);
//	}
//});

//Map<Object, Long> map = list.stream().collect(Collectors.groupingBy
//		(x->x,Collectors.counting()));
//map.forEach((a,b)->System.out.println(a+""+b));

//Map<String, Long> map = list.stream()
//.collect(Collectors
////Divide into group By GroupingBy
//		.groupingBy(
////Counting
//		Function.identity(),
//		Collectors.counting()));
////Count duplicate Only
//map.forEach((k,v)->{
//	if(v>1)
//	{
//		System.out.println(k+""+v);
//	}
//});

//map.entrySet().stream().
//forEach(k->System.out.println
//		(k.getKey()+"-> "+k.getValue()));

//
////1st Create Set
//Set<String> s=new HashSet<>();
//// Compare with Set
//Set<String> duplicate = list.stream()
//.filter(x->!s.add(x))
//.collect(Collectors.toSet());
//System.out.println(duplicate);
//
////1st Way to find Unique Words
//Set<String> unique=new HashSet<>(list);
//System.out.println(unique);


	}

}
