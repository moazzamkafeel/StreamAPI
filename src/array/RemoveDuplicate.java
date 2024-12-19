package array;

import java.util.Arrays;

public class RemoveDuplicate {
	
	   public static int removeDuplicatesSorted(int[] arr) {
	        if (arr.length == 0) {
	            return 0; // Handle empty array case
	        }
	        
	        Arrays.sort(arr);  // Sort the array

	        int j = 0; // Pointer for the position of the last unique element
	        
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] != arr[j]) {
	                j++; // Move pointer for unique elements
	                arr[j] = arr[i]; // Update the position with the new unique element
	            }
	        }
	        
	        return j + 1; // Number of unique elements
	    }

	    public static void main(String[] args) {
	        int arr[] = { 5, 5,6};
	        int length = removeDuplicatesSorted(arr);
	        System.out.println("Number of unique elements: " + length);

	        // Print the array with unique elements
	        System.out.print("Array with unique elements: ");
	        for (int i = 0; i < length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	    
	    
}
