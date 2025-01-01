package Basic.Operator.CoreJava;

public class TestImmutibility {
																																																																																																																																																																																																																																																													
	public static void main(String[] args) {
	
		EMPImmutable emp1 = new EMPImmutable(101, "John Doe", "Engineering");

		// Print the Emp object
		System.out.println(emp1);

		// Access fields using getters
		System.out.println("ID: " + emp1.getId());
		System.out.println("Name: " + emp1.getName());
		System.out.println("Department: " + emp1.getDepartment());

		// Verify immutability
		// Attempting to change fields directly would result in a compile-time error.
		// Uncommenting the following line would show an error:
		// emp1.id = 102;

		// Verify logical equality
		EMPImmutable emp2 = new EMPImmutable(101, "John Doe", "Engineering");
		System.out.println("emp1 equals emp2: " + emp1.equals(emp2)); // Should be true

		// Verify hashCode consistency
		System.out.println("emp1 hashCode: " + emp1.hashCode());
		System.out.println("emp2 hashCode: " + emp2.hashCode()); // Should match emp1's hashCode

		// Verify uniqueness of different objects
		EMPImmutable emp3 = new EMPImmutable(102, "Jane Smith", "Marketing");
		System.out.println("emp1 equals emp3: " + emp1.equals(emp3)); // Should be false
	
		
	}
}
