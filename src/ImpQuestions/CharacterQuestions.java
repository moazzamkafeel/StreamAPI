package ImpQuestions;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterQuestions {
	public static void main(String[] args) {

//    Find Duplicate Character by Java 8
		
		String str = "MrJava";
		Map<Object, Long> duplicateChracter = str.chars().mapToObj(x -> (char) x)
				.collect(Collectors.groupingBy(x -> x, Collectors.counting()));
		duplicateChracter.forEach((a, b) -> {
			if (b > 1) {

				System.out.println(a + "" + b + "--->duplicateChracter");
			}
		});

//    Non Repeated Charcters

		Map<Character, Long> nonRepeatedCharater = str.chars().mapToObj(x -> (char) x)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		nonRepeatedCharater.forEach((k, v) -> {
			if (v == 1) {
				System.out.println(k + "--" + v);
			}
		});
	}
}
