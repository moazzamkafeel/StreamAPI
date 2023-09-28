package EmployeeClass;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmpQuestions {

	public static void main(String[] args) {

		System.out.println("");

		List<Emp> emp = new CopyOnWriteArrayList<>();
		  
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

		

//	Q-1 Given a list of employees, you need to filter all the employee
//				whose age is greaterthan 20 and print the employee names.

		List<String> listOfEmp = emp.stream().filter(age -> age.getAge() > 20).map(names -> names.getName())
				.collect(Collectors.toList());
		listOfEmp.forEach(print -> System.out.println("Age greater than 20 " + print));
		emp.stream().filter(x -> x.getAge() > 20).forEach(x -> System.out.println(x));

// Q-2 Given the list of employees, count number of employees with age 25 ?

		long countemp = emp.stream().filter(x -> x.getAge() == 25).count();
		System.out.println(countemp + "Count of Emp with age of 25");

//Q-3	Given the list of employees, find the employee with name “Moazzam" ?

		Emp moazzam = emp.stream().filter(x -> x.getName().equalsIgnoreCase("Moazzam")).findAny().get();
		System.out.println("Find specific name list" + moazzam);

// Q-4 Given a list of employee, find maximum age of employee?

		Emp max = emp.stream().max(Comparator.comparingInt(x -> x.getAge())).get();
		System.out.println("maxAge ->" + max);

// Q-5 Given a list of employees,vsort all the employee on the basis of age

		List<Emp> sorted = emp.parallelStream().sorted(Comparator.comparingInt(Emp::getAge))
				.collect(Collectors.toList());
		System.out.println("Sorted List by AGE" + sorted);

//Q-6 find by Designation ?

		emp.stream().collect(Collectors.groupingBy(Emp::getDesignation))
				.forEach((x, y) -> System.out.println(x + "->" + y));

//Q-7 Starts with "R" ?

		List<Emp> startsWith = emp.stream().filter(x -> x.getName().startsWith("R")).collect(Collectors.toList());
		System.out.println(startsWith);

//Q-8 Convert List into MAP

		Map<String, String> toMap = emp.stream().collect(Collectors.toMap(Emp::getName, Emp::getDesignation));
		toMap.forEach((a, b) -> System.out.println(a + "" + b));

//Q-9  Join the all employee names with “,” using java 8?

		String comaNames = emp.parallelStream().map(name -> name.getName()).collect(Collectors.joining(","));
		System.out.println(comaNames);

//Q-10  Given the list of numbers, remove the duplicate 

//Q-11 Find 3rd Highest salary emp na emp.stream().max(Comparator.comparingInt(x->x.getSalary())).sk

// Practice

// give me the data by country state district and count the records of voter in district
		System.out.println("__________________________________PRACTICE____________________________________________________________");
	Map<Object, Map<Object, Map<Object, Map<Object, Map<Object, Long>>>>> voterCount = emp.parallelStream().collect(
			Collectors.groupingBy(x->x.getCountry(),
			Collectors.groupingBy(x->x.getState(),
        	Collectors.groupingBy(x->x.getState(),
			Collectors.groupingBy(x->x.getDesignation(),	
Collectors.groupingBy(x->x.getDistrict(),Collectors.counting()
		)))
					)));
	
	voterCount.forEach((designation, salary) 
			-> System.out.println(designation + "------->   "   + salary));	
	
	System.out.println("________________________________________________________________________________");
		Map<Object, Map<Object, Map<Object, Long>>> salaryCount = emp.stream()
				.collect(Collectors.groupingBy(e -> e.getAge(),
						Collectors.groupingBy(x -> x.getSalary(), 
			        	Collectors.groupingBy(x -> x.getDesignation(), 
						Collectors.counting()))));
		
salaryCount.forEach((designation, salary) 
		-> System.out.println(designation + "------->   "   + salary));

	}
}
