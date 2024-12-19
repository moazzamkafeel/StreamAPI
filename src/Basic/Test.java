package Basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import HardQuestions.Emp;

public class Test {
	
	public static void main(String[] args) {

		List<Integer> list = List.of(56, 77, 55, 44, 44);

		list.stream().filter(x -> x % 2 != 0)

				.forEach(x -> System.out.println("Odd--->" + x));
		list.stream().filter(x -> x % 2 == 0).forEach(x -> System.out.println("Even--->" + x));
 
		double sum1 = list.stream().mapToDouble(x -> x).sum();
		System.out.println(sum1);
		Integer sum4 = list.stream().reduce(Integer::sum).get();
		System.out.println(sum4);
		double sum2 = list.stream().mapToDouble(Integer::intValue).sum();
		System.out.println(sum2);
		long sum3 = list.stream().mapToInt(x -> x).summaryStatistics().getSum();
		System.out.println(sum3);

		// Max                                                                                   
		double max1 = list.stream().mapToDouble(x -> x).max().getAsDouble();
		System.out.println(max1);
		Integer max2 = list.stream().max(Comparator.naturalOrder()).get();
		System.out.println(max2);
		Integer max3 = list.stream().reduce(Integer::max).get();
		System.out.println(max3);
		int max4 = list.stream().mapToInt(s -> s).summaryStatistics().getMax();
		System.out.println(max4);

		// Average
		double average1 = list.stream().mapToDouble(x -> x).average().getAsDouble();
		System.out.println(average1);
		double average2 = list.stream().mapToInt(x -> x).summaryStatistics().getAverage();
		System.out.println(average2);

		// Count
		long count = list.stream().count();
		System.out.println(count);

		// SecondHighest
		list.stream().sorted(Collections.reverseOrder()).skip(1).limit(1).forEach(x -> System.out.println(x));
		// Reverse Order
		list.stream().sorted(Collections.reverseOrder()).forEach(x -> System.out.println("Sorted-->" + x));

		// StartsWith
		list.stream().map(x -> x + "").filter(x -> x.startsWith("4"))
				.forEach(x -> System.out.println("startsWith 4---> " + x));

		// find Duplicate and print
		list.stream().filter(x -> Collections.frequency(list, x) > 1)
				.forEach(x -> System.out.println("duplicate-->" + x));

		// Remove Duplicate
		list.stream().distinct().forEach(x -> System.out.println("distinct--->" + x));

		// string
		String text = "Moazzam";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (char c : text.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {km              m
				map.put(c, 1);
			}
		}

		Map<Character, Long> map1 = text.chars().mapToObj(x -> (char) x)
				.collect(Collectors.groupingBy(x -> x, Collectors.counting()));
		map1.forEach((k, v) -> {
			if (v == 1) {

				System.out.println(k + "---" + v);

			}
		});

        //Reverse String
		
		String str = "moazzam";

		String str2 = "";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			
			str2 += str.charAt(i);
			
		}
		System.out.println(str2);

		List<String> T = List.of("MGaurav26", "MAzam28", "FPooja23");

		List<Emp> A = new ArrayList<>();
		List<Emp> B = new ArrayList<>();
		List<Emp> C = new ArrayList<>();

		for (String c : T) {

		}
	}
}
