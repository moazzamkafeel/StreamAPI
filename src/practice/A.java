package practice;

import java.util.ArrayList;
import java.util.List;

public class A {

	public static void main(String[] args) {

		List<String> list = List.of("MGaurav26", "MAzam28", "FPooja23");

		List<Employee> emp = new ArrayList<>();
		;
		String gender = null;
		String name = null;
		String age = null;

		for (String str : list)
		{
			gender = String.valueOf(str.charAt(0));
			name = str.substring(1, str.length() - 2);
			age = str.substring(str.length() - 2);
			emp.add(new Employee(name, age, gender));
		}

		emp.forEach(x -> System.out.println(x));
	}
}
