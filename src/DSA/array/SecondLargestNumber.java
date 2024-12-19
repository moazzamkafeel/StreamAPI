package DSA.array;

import java.util.Arrays;

public class SecondLargestNumber {

	// Steps
	// length-2 and reverse loop i--
	// checking Duplicacy

	// Brute Force
	public static int secondLargestNumber(int[] arr) {
		int length = arr.length;

		Arrays.sort(arr);
		for (int i = length - 2; i >= 0; i--) {

			if (arr[i] != arr[length - 1]) { // Checking Duolicacy
				return arr[i];
			}
		}
		return 0;

	}

	public static void main(String[] args) {

		int[] arr = { 67, 89, 57, 99, 880, 45, 23, 10, 66, 666 };
		int secondLargestNumber = secondLargestNumber(arr);
		System.out.println(secondLargestNumber);

	}
}
