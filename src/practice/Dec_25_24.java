package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import EmployeeClass.Emp;

public class Dec_25_24 {

	public static void main(String[] args) {
		List<Emp> emp = new ArrayList<>();
		emp.add(new Emp(16, 1000, "Ramesh", 20, "Java Developer", "India", "Delhi", "South Delhi"));
		emp.add(new Emp(17, 1000, "Moazzam", 20, "Java Developer", "India", "Delhi", "North Delhi"));
		emp.add(new Emp(18, 2000, "Naresh", 20, "Java Developer", "Dubai", "Riyad", "North Riyad"));
		emp.add(new Emp(19, 9000, "Rahul", 18, "Project Manager", "India", "Delhi", "South Delhi"));
		emp.add(new Emp(20, 2000, "Rajesh", 18, "Java Developer", "America", "Delhi", "North America"));
		emp.add(new Emp(1, 1000, "Alex", 25, "Java Developer", "India", "Delhi", "South Delhi"));
		emp.add(new Emp(2, 1500, "Emily", 30, "UI/UX Designer", "India", "Delhi", "North Delhi"));
		emp.add(new Emp(3, 2000, "Daniel", 28, "QA Engineer", "India", "Delhi", "East Delhi"));
		emp.add(new Emp(4, 3000, "Sophie", 22, "UI/UX Designer", "India", "Delhi", "West Delhi"));
		emp.add(new Emp(5, 2500, "Benjamin", 29, "Data Analyst", "India", "Delhi", "Central Delhi"));
		emp.add(new Emp(6, 1200, "Ava", 24, "Java Developer", "India", "Delhi", "North Delhi"));
		emp.add(new Emp(7, 1800, "Matthew", 32, "Product Manager", "India", "Delhi", "South Delhi"));
		emp.add(new Emp(8, 2200, "Isabella", 27, "Quality Analyst", "India", "Delhi", "East Delhi"));
		emp.add(new Emp(9, 2800, "William", 26, "Java Developer", "India", "Delhi", "West Delhi"));
		emp.add(new Emp(10, 1600, "Mia", 31, "Project Lead", "India", "Delhi", "Central Delhi"));
		emp.add(new Emp(11, 1900, "Liam", 26, "Java Developer", "India", "Delhi", "South Delhi"));
		emp.add(new Emp(12, 2100, "Olivia", 29, "Data Scientist", "India", "Delhi", "East Delhi"));
		emp.add(new Emp(13, 2300, "Noah", 23, "Java Developer", "India", "Delhi", "West Delhi"));
		emp.add(new Emp(14, 2700, "Emma", 28, "Software Architect", "India", "Delhi", "Central Delhi"));
		emp.add(new Emp(15, 1400, "Lucas", 30, "Java Developer", "India", "Delhi", "North Delhi"));

		emp.stream().filter(x -> x.getSalary() > 1000).forEach(System.out::println);

		Emp name = emp.stream().filter(x -> x.getName().equalsIgnoreCase("Moazzam")).findFirst().get();

		System.out.println("Name --> Moazzam " + name);

		long count = emp.stream().filter(age -> age.getAge() == 25).count();
		System.out.println(count);

		Optional<Emp> max = emp.stream().max(Comparator.comparingInt(x -> x.getAge()));

		System.out.println(max.get());

		emp.stream().sorted(Comparator.comparingInt(age -> age.getAge())).forEach(x -> System.out.println(x));
		System.out.println("Sorted without stream --------------");
		emp.sort((e1, e2) -> e1.getAge() - e2.getAge());
		emp.forEach(System.out::println);

		String collect = emp.stream().map(x -> x.getName()).collect(Collectors.joining(","));
		System.out.println(collect);

		Map<String, List<Emp>> groupByname = emp.stream().collect(Collectors.groupingBy(x -> x.getName()));

		groupByname.forEach((x, y) -> System.out.println(x + "" + x));

		OptionalDouble average = emp.stream().mapToInt(x -> x.getSalary() * x.getSalary()).filter(x -> x > 10000)
				.average();

		System.out.println(average.getAsDouble());

		// integr

		List<Integer> list = List.of(22, 44, 55, 44, 66, 66, 77);
		HashSet<Integer> hs = new HashSet<Integer>();
		list.stream().filter(x -> !hs.add(x)).forEach(x -> System.out.println(x));

		Optional<Integer> skip = list.stream().sorted(Collections.reverseOrder()).skip(1).findAny();
		// list.stream().filter(x-> Collections.frequency(list,
		// x)).collect(Collectors.toList());
		System.out.println("Second ->  " + skip.get());

		list.stream().filter(x -> x % 2 == 0).forEach(x -> System.out.println(x));

		list.stream().filter(x -> x % 2 != 0).forEach(x -> System.out.println(x));

		list.stream().map(x -> x * x).forEach(x -> System.out.println(x + "-------Square"));

		Optional<Integer> max2 = list.stream().max(Comparator.comparingInt(x -> x));

		System.out.println(max2.get());

		Optional<Integer> min = list.stream().min(Comparator.comparingInt(x -> x));
		System.out.println("Min--->" + min);
		
		Optional<Integer> sum = list.stream().reduce(Integer::sum);
	System.out.println(sum);
		
	
	List<String> lists = List.of("Moazzam","Kafeel","Moazzam");
	
//	lists.stream().filter(x->Collections.frequency(lists,x)).forEach(x->System.out.println(x));
	
	String str ="Mrjava";
	Map<Character, Long> sadaf = str.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(x->x,Collectors.counting()));
	
	sadaf.forEach((x,y)-> {
		if(y>1) {
			System.out.println(y+""+x);
		}
	});
	}
}
