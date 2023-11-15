package MrJava;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatedCharacter {
	public static void main(String[] args) {
		String str = "moazzam";

  str.chars().mapToObj(x -> (char) x).collect(Collectors.groupingBy(x -> x, Collectors.counting()))
  .forEach((x, y) -> System.out.println(x + "--" + y));

	 Map<Character, Long> map = str.chars().mapToObj(x->(char)x)
	.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
     map.forEach((k,v)->System.out.println(k+"-----"+v));
	 map.forEach((k,v)->{
		if(v==1){
         	System.out.println(k+"--"+v);
		}
});
	
	
	
	
	}
}
