package StreamInteger;

import java.util.List;
import java.util.Optional;

public class Startswith {

	public static void main(String[] args) {

		List<Integer> list = List.of(21, 32, 35, 67, 77);

		list.stream()
		.map(x -> x + "")
		.filter(x -> x.startsWith("7"))
		.forEach(x -> System.out.println(x));
		
		// list.stream().map(x->x+"").filter(x->x.startsWith("2"))
//	.forEach(x->System.out.println(x));

//		list.stream().map(x->x+"").filter(x->x.startsWith("2"))
//		.forEach(x->System.out.println(x));

//		 Optional<Integer> f = list.stream().findFirst();
//		
//		System.out.println("First"+f.get());

	}
}
