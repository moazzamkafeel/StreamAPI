package array;

import java.util.HashMap;

public class Practice {

	public static void main(String[] args) {

		int[] arr = { 22, 33, 33, 22, 34, 56 };
		int result = removeDuplicate(arr);
                     System.out.println(result);
	}

	public static int removeDuplicate(int[] arr) {
		int j = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[j]) {
				j++;
				arr[i] = arr[j];
			}
		}

		return arr[j];
	}
 
	// Two Sum
	public static int[] twoSum(int[] arr, int target) {

		HashMap<Integer, Integer> hashMap = new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			int complemet = target - arr[i];
		
		}
		return null;
	}
}
