package ImpQuestions;

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

		List<List<String>> ListOfList = stringList.stream().map(str -> Arrays.asList(str.split(".")))
				.collect(Collectors.toList());
		System.out.println(ListOfList);

		List<String> flatMap = stringList.stream().flatMap(str -> Arrays.asList(str.split(",")))
				.collect(Collectors.toList());
		System.out.println("flatMap---> "+flatMap);
	

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

	}

}
