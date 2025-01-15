package DSA_40_Days;

public class Dec_27_24 {

	 public boolean isPalindrome(int number) {
		 
 		int originalNumber = number; // Store the original numbe
	    int reversedNumber = 0; // Variable to store the reversed number

	while (number > 0) {
		int digit = number % 10; // Extract the last digit
		reversedNumber = reversedNumber * 10 + digit; // Append the digit
		number /= 10; // Remove the last digit
	}
	return originalNumber == reversedNumber;
}
	
	
	
	public static void main(String[] args) {
		
	}
}
