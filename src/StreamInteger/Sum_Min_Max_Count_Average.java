package StreamInteger;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Sum_Min_Max_Count_Average {

	public static void main(String[] args) {

		List<Integer> list = List.of(98, 6, 5, 7, 7, 6);

// SUM
		
		Integer SUM = list.stream().reduce(Integer::sum).get();
		System.out.println(SUM + "-->Sum by Reduce");

		long summuryStatistics = list.stream().mapToInt(x -> x).summaryStatistics().getSum();
		System.out.println("summuryStatistics SUM-->" + summuryStatistics);

// MIN

		Integer minimum = list.stream().min(Comparator.naturalOrder()).get();
		System.out.println(minimum + "-->Min");

		int min = list.stream().mapToInt(Integer::intValue).min().getAsInt();
		int minsummaryStatistics = list.stream().mapToInt(x -> x).summaryStatistics().getMin();
		System.out.println("minsummaryStatistics-->" + minsummaryStatistics);

//MAX   

		int max = list.stream().mapToInt(Integer::intValue).max().getAsInt();
		System.out.println("Max by MapToInt:---> " + max);

		Integer maxComparator = list.stream().max(Comparator.naturalOrder()).get();
		System.out.println(maxComparator + "--> maxComparator ");

		int maxsummaryStatistics = list.stream().mapToInt(x -> x).summaryStatistics().getMax();
		System.out.println("maxsummaryStatistics-->" + maxsummaryStatistics);

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
