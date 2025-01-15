package DSA.Approches;

public class Recursion {
	    // 1️⃣ Direct Recursion - Factorial
	    static int directFactorial(int n) {
	        if (n == 0) return 1;
	        return n * directFactorial(n - 1);
	    }

	    // 2️⃣ Indirect Recursion - Function A calls B, and B calls A
	    static void indirectA(int n) {
	        if (n <= 0) return;
	        System.out.println("A: " + n);
	        indirectB(n - 1);
	    }
	    static void indirectB(int n) {
	        if (n <= 0) return;
	        System.out.println("B: " + n);
	        indirectA(n - 2);
	    }

	    // 3️⃣ Tail Recursion - Optimized Factorial
	    static int tailFactorial(int n, int result) {
	        if (n == 0) return result;
	        return tailFactorial(n - 1, n * result);
	    }

	    // 4️⃣ Non-Tail Recursion - Factorial (Extra Computation After Recursive Call)
	    static int nonTailFactorial(int n) {
	        if (n == 0) return 1;
	        int result = n * nonTailFactorial(n - 1);
	        return result;
	    }

	    // 5️⃣ Nested Recursion - Recursive Call as Function Argument
	    static int nestedRecursion(int n) {
	        if (n > 100) return n - 10;
	        return nestedRecursion(nestedRecursion(n + 11));
	    }

	    // 6️⃣ Tree Recursion - Fibonacci Series
	    static int treeRecursionFibonacci(int n) {
	        if (n <= 1) return n;
	        return treeRecursionFibonacci(n - 1) + treeRecursionFibonacci(n - 2);
	    }

	    // 7️⃣ Iterative Recursion (Simulating Recursion with Loop)
	    static int iterativeFactorial(int n) {
	        int result = 1;
	        for (int i = 1; i <= n; i++) {
	            result *= i;
	        }
	        return result;
	    }

	    public static void main(String[] args) {
	        int n = 5;

	        // Direct Recursion
	        System.out.println("Direct Recursion (Factorial of " + n + "): " + directFactorial(n));

	        // Indirect Recursion
	        System.out.println("\nIndirect Recursion:");
	        indirectA(n);

	        // Tail Recursion
	        System.out.println("\nTail Recursion (Factorial of " + n + "): " + tailFactorial(n, 1));

	        // Non-Tail Recursion
	        System.out.println("\nNon-Tail Recursion (Factorial of " + n + "): " + nonTailFactorial(n));

	        // Nested Recursion
	        System.out.println("\nNested Recursion (nestedRecursion(95)): " + nestedRecursion(95));

	        // Tree Recursion
	        System.out.println("\nTree Recursion (Fibonacci of " + n + "): " + treeRecursionFibonacci(n));

	        // Iterative Recursion
	        System.out.println("\nIterative Recursion (Factorial of " + n + "): " + iterativeFactorial(n));
	    }
	}