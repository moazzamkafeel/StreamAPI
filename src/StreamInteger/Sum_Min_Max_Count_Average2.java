package StreamInteger;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Sum_Min_Max_Count_Average2 {

	public static void main(String[] args) {
		
	 List<Integer> list = List.of(98,6,5,7,7,6);	
	 
//	Optional<Integer> max = list.stream().reduce(Integer::sum);
//	 System.out.println(max.get());
	 
   
  Integer g = list.stream().max(Comparator
    		.naturalOrder()).get();
System.out.println(g+"Max");

Integer v = list.stream().min(Comparator
		.naturalOrder()).get();
System.out.println(v+"Min");
	 
	
   //    List<Integer> numbers = Arrays.asList(1, 5, 2, 9, 3, 8, 4);
//       
//     int max = numbers.stream().mapToInt(Integer::intValue)
//		 .max().getAsInt();
//        System.out.println("The highest number is: " + max);
        
       
 
 
 
 list.stream().mapToInt(x->x).summaryStatistics().get
 
	long sum = list.stream().mapToInt(x->x).summaryStatistics().
		System.out.println("sum"+sum);
//		//Max
//	int max = list.stream().mapToInt(x->x).summaryStatistics().getMax();
//	System.out.println("max"+max);
//		
//	int min = list.stream().mapToInt(x->x).summaryStatistics().getMin();
//	System.out.println("min"+min);
//
//	double average = list.stream().mapToInt(x->x).summaryStatistics().getAverage();
//	System.out.println("average"+average);
//	
	long count = list.stream().map(x->x).count();
	System.out.println("Count by terminal"+count);
//	
//	long countbySummuryStatistics = list.stream().mapToInt(x->x).summaryStatistics().getCount();
//	System.out.println("countbySummuryStatistics"+countbySummuryStatistics);
//	
//	  list.stream().sorted().forEach(x->System.out.println(x));
//	
	  
	  
	  
	}

}
