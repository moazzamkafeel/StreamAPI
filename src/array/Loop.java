package array;

import java.util.Arrays;

public class Loop {

	public static void main(String[] args) {

		int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
		
//		Arrays.sort(arr); // Sort the array

		int j = 0;
		
		System.out.println(arr[j]+"---> J");
		
		for (int i = 1; i < arr.length; i++) {
			System.out.println(arr[i]+"---> I");
			if (arr[i] != arr[j]) {
				j++; // Move pointer for unique elements
				arr[j] = arr[i]; // Update the position with the new unique element
			}
		}

	}
}
