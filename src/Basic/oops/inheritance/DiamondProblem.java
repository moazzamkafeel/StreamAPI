package Basic.oops.inheritance;

public class DiamondProblem implements B, C {

	@Override
	public void display() {
		
		// Resolving the ambiguity explicitly
		B.super.display(); // Choosing B's implementation
		// or
		// C.super.display(); // Choosing C's implementation
	
	}

	public static void main(String[] args) {
		
		DiamondProblem dp=new DiamondProblem();
		
		dp.display(); // Output will depend on the explicit choice in the method
	}
}
