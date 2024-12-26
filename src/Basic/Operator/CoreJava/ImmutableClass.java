package Basic.Operator.CoreJava;

import java.util.ArrayList;
import java.util.List;

public class ImmutableClass {
    public static void main(String[] args) {
    	
        List<String> skills = new ArrayList<>();
        skills.add("Java");
        skills.add("Spring");

        // Create an immutable object
        ImmutableEmployee employee = new ImmutableEmployee(1, "Alice", skills);
        System.out.println(employee);

        // Attempting to modify the original list does not affect the immutable object
        skills.add("SQL");
        System.out.println("After modifying skills list:");
        System.out.println(employee);

        // Attempting to modify the returned list will throw an exception
        try {
            employee.getSkills().add("Kotlin");
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify immutable skills list!");
        }
    }
}