package StreamString;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NonRepeatedCharacter {
	public static void main(String[] args) {
		String str = "moazzam";
//By GroupingBy
		str.chars().mapToObj(x -> (char) x).collect(Collectors.groupingBy(x -> x, Collectors.counting()))
				.forEach((x, y) -> System.out.println(x + "--" + y));

		Map<Character, Long> map = str.chars().mapToObj(x -> (char) x)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		map.forEach((k, v) -> System.out.println(k + "-----" + v));
		map.forEach((k, v) -> {
			if (v == 1) {
				System.out.println(k + "--" + v);
			}
		});
		
// By Distinct
// String has a unique character
		String s = "Moazzam";
		Stream<String> ss = Stream.of(s);
		List.of();
		List<String> list = ss.map(x -> x.split(""))// Split string into array of stream
				.flatMap(Arrays::stream)// Flatten from array to stream
				.distinct().collect(Collectors.toList());
		System.out.println(list);

	}
}
