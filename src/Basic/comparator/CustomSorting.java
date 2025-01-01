package Basic.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomSorting {
	
	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "Moazzam", 120000));
		list.add(new Employee(2, "Afzal", 1200000));
		list.add(new Employee(3, "Kafeel", 10000));

		  // Natural Sorting (by ID)
        Collections.sort(list);
        System.out.println("Sorted by ID (Natural Order):");
        list.forEach(System.out::println);
        
        // Sorting by Name
        Collections.sort(list, new NameComparator());
        System.out.println("\nSorted by Name:");
        list.forEach(System.out::println);
        
        Collections.sort(list,new SalaryComparator());
       System.out.println(" Sorted By Salary");
        list.forEach(System.out::println);
        
	}
}
