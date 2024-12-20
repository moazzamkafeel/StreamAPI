package sorting;

public class BubbleSort {

    // Method to perform Bubble Sort O(n^2)
    public static void bubbleSort(int[] arr) {
    	
        int n = arr.length;
        boolean swapped;

        // Traverse through all array elements
        
        for (int i = 0; i < n - 1; i++) {
        	 
            swapped = false;

            // Last i elements are already in place
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {
                    // Swap if elements are in wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped in inner loop, then the array is sorted
            if (!swapped) {
                break;
            }
        }
    }

    // Method to print array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Main method to test the sorting
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Unsorted array:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
        
    }
    
}
