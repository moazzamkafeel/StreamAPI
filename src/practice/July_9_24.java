package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.StringJoiner;
import java.util.concurrent.CopyOnWriteArrayList;

import EmployeeClass.Emp;

public class July_9_24 {

	static List<Integer> list = List.of(24, 55, 66, 88, 66, 99, 88);

	public static void main(String[] args) {

		// second highest
		list.stream().sorted(Collections.reverseOrder()).skip(1).limit(1)
				.forEach(x -> System.out.println("Second Highest---> " + x));

		// Print duplicate
		list.parallelStream().filter(x -> Collections.frequency(list, x) > 1)
				.forEach(x -> System.out.println("Duplicate ALL : " + x));

		// By Set
		HashSet<Integer> hashSet = new HashSet<Integer>();
		list.stream().filter(x -> !hashSet.add(x)).forEach(x -> System.out.println("Duplicate " + x));

		// String joiner
		String str = "Mohammad";
		String str1 = "oazzam";
		String str2 = "Kafeel";
		StringJoiner stringJoiner = new StringJoiner("-", "Mr", "Er");
		stringJoiner.add(str);
		stringJoiner.add(str1);
		stringJoiner.add(str2);
		System.out.println(stringJoiner);

		// first NonRepeted
		for (char c : str1.toCharArray()) {
			if (str1.indexOf(c) == str1.lastIndexOf(c)) {
				System.out.println(c);
				break;
			}
		}

		//Reverse a String
		String strr = "mazzam";
		String rev = "";
		for (int i = 0; i < strr.length(); i++) {
			rev = strr.charAt(i) + rev;
		}
		if (strr.equals(rev))
			System.out.println("Plindrom--->"+rev);
		else {
			System.out.println("Not a palindrom");
		}
		
		//Print Unique charcter
		HashSet<Character> character = new HashSet<Character>();
		boolean result=true;
		for(int i=0;i<strr.length();i++) {
			result=character.add(strr.charAt(i));
			if(result==false)
			{
				break;
			}
		}
		System.out.println(character);
		
		//Emp
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

		emp.stream().filter(x->x.getDesignation().equalsIgnoreCase("Java Developer")).map(e->{
			int curruntsalary = e.getSalary();
			double increased = curruntsalary*1.30;
			e.setSalary((int)increased);
			return e;
		})
		.forEach(x-> System.out.println(x));
		}
	
	
	}