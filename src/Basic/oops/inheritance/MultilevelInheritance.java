package Basic.oops.inheritance;

public class MultilevelInheritance {
// In multilevel inheritance, a class inherits from a child class, 
	//   making a chain of inheritance.
	public static void main(String[] args) {
		
		  Child child = new Child();
	      
		  child.grandFather();
		  child.parant();
		  child.child();
		  child.show(); // Same method in every class
		  
	}
}
