package gfg.array;

public class MinMaxArray {
	
//O(n)
	
//	Time Complexity: O(n)
//	Space Complexity: O(1) 
	
    public static int[] findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
        	
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        return new int[]{min, max};
    }

    public static void main(String[] args) {
        int[] arr = {23, 4, 3, 4, 5, 5, 6, 22};

        int[] minMax = findMinMax(arr);

        System.out.println("Minimum: " + minMax[0]);
        System.out.println("Maximum: " + minMax[1]);
    }
}
