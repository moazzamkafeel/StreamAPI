package StreamInteger;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Sum_Min_Max_Count_Average {

	public static void main(String[] args) {

		List<Integer> list = List.of(98, 6, 5, 7, 7, 6);

// SUM
		//1st
		double sum1 = list.stream().mapToDouble(x->x).sum();
		System.out.println(sum1);
		//2nd
		Integer sum4 = list.stream().reduce(Integer::sum).get();
		System.out.println(sum4 );
		//3rd
		double sum2 = list.stream().mapToDouble(Integer::intValue).sum();
	    System.out.println(sum2);
	    //4th
	    long sum3 = list.stream().mapToInt(x->x).summaryStatistics().getSum();
	    System.out.println(sum3);
	    
// MIN
//1st
		Integer minimum = list.stream().min(Comparator.naturalOrder()).get();
		System.out.println(minimum + "-->Min");
//2nd
		int min = list.stream().mapToInt(Integer::intValue).min().getAsInt();
//3rd	
		int minsummaryStatistics = list.stream().mapToInt(x -> x).summaryStatistics().getMin();
		System.out.println("minsummaryStatistics-->" + minsummaryStatistics);

//MAX   

		    double max1 = list.stream().mapToDouble(x->x).max().getAsDouble();
		    System.out.println(max1);
		    Integer max2 = list.stream().max(Comparator.naturalOrder()).get();
		    System.out.println(max2);
		    Integer max3 = list.stream().reduce(Integer::max).get();
		    System.out.println(max3);
		    int max4 = list.stream().mapToInt(s->s).summaryStatistics().getMax();
		    System.out.println(max4);

// Count	

		long count = list.stream().map(x -> x).count();
		System.out.println("Count-->" + count);

		long countbySummuryStatistics = list.stream().mapToInt(x -> x).summaryStatistics().getCount();
		System.out.println("countbySummuryStatistics-->" + countbySummuryStatistics);

// Average

		double average = list.stream().mapToInt(x -> x).summaryStatistics().getAverage();
		System.out.println("average-->" + average);

	}

}
