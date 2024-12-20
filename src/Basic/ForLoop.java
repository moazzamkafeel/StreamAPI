package Basic;

public class ForLoop {

	public static void main(String[] args) {

		// Question 1: Print numbers from 1 to 5 using a for loop.
//for(int i=0;i<=5;i++)
//{
//	System.out.println(i);
//}
		// Question 2: Print even numbers from 2 to 10 using a for loop.

//for(int i=3;i<=10;i+=2)
//{
// System.out.println(i);
//}

		// Question 3: Calculate the sum of numbers from 1 to 5 using a for loop.
		int sum = 0;

		int num = 34;

		for (int i = 1; i <= 5; i++) {

			i += sum;

		}

		System.out.println(sum);

		// Question 4: Print the multiplication table of 3 using a for loop.
//for(int i=3;i<=30;i+=3)
//{
//	System.out.println(i);
//}
		// Question 5: Reverse a string using a for loop (e.g., input: "hello", output:
		// "olleh").

		String str = "Hello";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {

			rev = str.charAt(i) + rev;

		}

		System.out.println(rev);

		// Question 6: Print the factorial of a number entered by the user.

		int factorial = 1;

		for (int i = 2; i <= 5; i++) {

			factorial *= i;

		}

		System.out.println(factorial);

		// Question 7: Check if a number entered by the user is prime or not.

		// Question 8: Generate and print the Fibonacci series up to 10 terms.
//1st step Three variable n1,n2,sum
//2nd strep for(int i =2;i<=10;i++)                                                                                 
//3rd step body sm=n1+n2;
//4th step swap n1=n2,n2=sum;

		// Question 9: Find the largest element in an array using a for loop.

		// Question 10: Implement a simple password checker using a for loop. The
		// correct password is "java123".

		// Feel free to write the code for each question here.
		
		
// inner loop loops
		 
    for (int i = 1; i <= 5; i++) { // Outer loop: Rows (numbers 1 to 5)
		for (int j = 1; j <= 5; j++) { // Inner loop: Columns (1 to 5 times each number)
			 System.out.println(i * j + " "); // Print the product
			}
			System.out.println(); // Move to the next row
		}
    for (int i = 0; i < 10; i += 2) {
        System.out.println(i);
    }
    
	}
}