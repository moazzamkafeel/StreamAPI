package Basic;

public class RecursiveMethod {

	public static int recursiveFactorial(int n) {
		  if (n == 0 || n == 1) { // Base case to stop recursion
	            return 1;
	        } else if (n < 0) { // Handle invalid input like negative numbers
	            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
	        }
		
		return n * recursiveFactorial(n - 1);
	}

	public static void main(String[] args) {
		  int number = 5; // Example number
		int factorial = recursiveFactorial(number);
		System.out.println(factorial);
	}
	
}
