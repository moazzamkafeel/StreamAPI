package DSA.array;

public class MissingNumber {
	

	    public static void main(String[] args) {
	        int[] nums = {1, 2, 4, 6, 3, 7, 8}; // Example input
	        int n = nums.length + 1; // Array size + 1 (missing number)
	        int missing = findMissingNumber(nums, n);
	        System.out.println("Missing Number: " + missing);
	    }
		// Using Sum Formula
	    public static int findMissingNumber(int[] nums, int n) {
	        int totalSum = n * (n + 1) / 2; // Sum of 1 to n
	        int arraySum = 0;
	        for (int num : nums) {
	            arraySum += num;
	        }
	        return totalSum - arraySum; // Missing number
	    }
	
	    
	    // XOR (Exclusive OR) is a bitwise operator represented by the symbol ^
@SuppressWarnings("Pending")
  public static int findMissingNumberXOR(int[] nums, int n) {
	        int xorAll = 0;
	        int xorArray = 0;

	        // XOR of all numbers from 1 to n
	        for (int i = 1; i <= n; i++) {
	            xorAll ^= i;
	        }

	        // XOR of all elements in the array
	        for (int num : nums) {
	            xorArray ^= num;
	        }

	        // XOR of xorAll and xorArray gives the missing number
	        return xorAll ^ xorArray;
	    }
	}