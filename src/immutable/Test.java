package immutable;

import java.util.Date;

public class Test {
	
	   public static void main(String[] args) {
		   
	        // 🔹 Test 1: Creating Immutable Objects
	        System.out.println("=== Test 1: Creating Immutable Objects ===");
	        Date birthDate = new Date();
	        ImmutableClass obj1 = new ImmutableClass(101, "Alice", birthDate);
	        ImmutableClass obj2 = new ImmutableClass(102, "Bob", new Date(2000, 5, 15));

	        System.out.println("Object 1 -> ID: " + obj1.getId() + ", Name: " + obj1.getName() + ", DOB: " + obj1.getDob());
	        System.out.println("Object 2 -> ID: " + obj2.getId() + ", Name: " + obj2.getName() + ", DOB: " + obj2.getDob());

	        // 🔹 Test 2: Attempt to Modify Immutable Fields (Not Possible)
	        System.out.println("\n=== Test 2: Attempting Modification ===");
	        // obj1.id = 200; // ❌ Compilation Error (Cannot assign a value to final field)
	        // obj1.name = "Charlie"; // ❌ Compilation Error (Cannot modify final field)
	        // obj1.dob.setTime(999999999999L); // ❌ Not possible since we return a copy

	        System.out.println("Object 1 remains unchanged -> ID: " + obj1.getId() + ", Name: " + obj1.getName() + ", DOB: " + obj1.getDob());

	        // 🔹 Test 3: Verify Date Immutability
	        System.out.println("\n=== Test 3: Verifying Date Immutability ===");
	        birthDate.setTime(999999999999L); // Attempt to modify original date object
	        System.out.println("Original Date Modified: " + birthDate);
	        System.out.println("Stored Date in ImmutableClass: " + obj1.getDob()); // Should remain unchanged

	        // 🔹 Test 4: Multiple Instances Should Have Different Data
	        System.out.println("\n=== Test 4: Multiple Instances Check ===");
	        ImmutableClass obj3 = new ImmutableClass(103, "David", new Date(2010, 3, 10));

	        System.out.println("Object 1 -> ID: " + obj1.getId() + ", Name: " + obj1.getName());
	        System.out.println("Object 2 -> ID: " + obj2.getId() + ", Name: " + obj2.getName());
	        System.out.println("Object 3 -> ID: " + obj3.getId() + ", Name: " + obj3.getName());
	        
	        System.out.println("Are obj1 and obj2 the same instance? " + (obj1 == obj2)); // Should print false
	
	   
	   }
}
