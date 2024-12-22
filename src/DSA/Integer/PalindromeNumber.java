package DSA.Integer;

public class PalindromeNumber {
	public static void main(String[] args) {
		// Predefined numbers to check
		int[] numbers = { -121, 123, 1331, 9876 };

		// Loop through the numbers and check each one
		for (int number : numbers) {
			if (isPalindrome(number)) {
				System.out.println(number + " is a palindrome.");
			} else {
				System.out.println(number + " is not a palindrome.");
			}
		}
	}

	// Separate method to check if a number is a palindrome
	public static boolean isPalindrome(int number) {
		int originalNumber = number; // Store the original number
		int reversedNumber = 0; // Variable to store the reversed number

		while (number > 0) {
			int digit = number % 10; // Extract the last digit
			reversedNumber = reversedNumber * 10 + digit; // Append the digit
			number /= 10; // Remove the last digit
		}

		return originalNumber == reversedNumber;
	}
}
