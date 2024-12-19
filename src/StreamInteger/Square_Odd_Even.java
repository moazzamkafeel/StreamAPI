package StreamInteger;

import java.util.List;

public class Square_Odd_Even {

	public static void main(String[] args) {
//		//Square
		List<Integer> list = List.of(8,4,53,23,4,5,7);
		
//list.stream().map(x->x*x).forEach(x->System.out.println(x));

//Even 
		
		list.stream()
		.filter(x->x%2!=0)
		.forEach(System.out::println);
		
//     list.stream().filter(x->x%2!=0)
//     .forEach(x->System.out.println(x));
	
		
//	list.stream().map(x->x*x).forEach(x->System.out.println(x));

//		//Even
//	List<Integer> list1 = List.of(8,7,9,1,23,4,5);
//    list1.stream().filter(x->x%2==0)
//.forEach(x->System.out.println("Even Number"+x));
//		//Odd
//list1.stream().filter(x->x%2!=0)
//.forEach(x->System.out.println("odd Number"+x));
		
		
		
		
		
		
	}
}
