package StreamInteger;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Remove_PrintDuplicate {

	public static void main(String[] args) {

		// Remove Element
		List<Integer> list = List.of(8, 3, 5, 3, 45, 64, 63, 24);
	//	list.stream().distinct().forEach(x -> System.out.println(x));

        //Print Duplicate
		Set<Integer> s = new HashSet<>();
		list.stream().filter(x -> !s.add(x)).forEach(x -> System.out.println(x));

		list.stream().distinct().forEach(x -> System.out.print(x));

		List<Integer> list2 = List.of(9, 8, 66, 66, 90, 90);

		// 2nd Method
		list2.stream().filter(i -> Collections.frequency(list2, i) > 1)
		.collect(Collectors.toSet())
				.forEach(System.out::println);

		list2.stream().filter(i -> Collections
				.frequency(list2, i) > 1).forEach(x -> System.out.println(x));

//		Set<Integer> s=new HashSet<Integer>();
//
//		 List<Integer> dl = list2.stream().filter(x->!s.add(x))
//				.collect(Collectors.toList());
//	System.out.println(dl);

	}

}
