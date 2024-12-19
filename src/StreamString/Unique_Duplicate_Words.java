package StreamString;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Unique_Duplicate_Words {
	
	public static void main(String[] args) {

		List<String> list = List.of("Moazzam", "Yasir", "Kafeel", "Ahtu", "Yasir", "Yasir");
        //Unique Words
		
		// 1.By Inbuilt Method Distinct

		List<String> distinctWord = list.stream().distinct().collect(Collectors.toList());
		System.out.println("By Inbuilt Method Distinct----> " + distinctWord);

       //2.Unique Word By SET

		Set<String> uniqueWordsBySET = new HashSet<>(list);
		System.out.println("unique Word sBy SET -->  " + uniqueWordsBySET);

//3.By GroupingBy

		Map<String, Long> uniqueWordsgroupingBy = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		uniqueWordsgroupingBy.forEach((key, value) -> {
//			if (value == 1)
//			{
//	" value);
//		});

//Print Duplicate words by frequency

		List<String> duplicateWordsfrequency = list.stream().filter(word -> Collections.frequency(list, word) > 1)
				.collect(Collectors.toList());
		System.out.println(duplicateWordsfrequency);

// By Set
		
		Set<String> duplicateBySet = list.stream().filter(x -> !uniqueWordsBySET.add(x)).collect(Collectors.toSet());
		System.out.println(duplicateBySet);
		
	}
