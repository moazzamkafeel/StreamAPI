package gfg.array;

import java.util.ArrayList;
import java.util.List;

public class PeakElement {
	
	public static List<Integer> findAllPeakElements(int[] nums) {
		List<Integer> peaks = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			// Check if the current element is a peak
			if ((i == 0 
					|| nums[i] >= nums[i - 1]) 
					&& (i == nums.length - 1 || 
					nums[i] >= nums[i + 1])) {
			
				peaks.add(nums[i]);
			}
		}
		return peaks;
	}

	public static void main(String[] args) {
		int[] arr1 = { 5, 10, 20, 15 };
		List<Integer> peaks1 = findAllPeakElements(arr1);
		System.out.println("Peak elements in arr1: " + peaks1); // Output: [20]

		int[] arr2 = { 10, 20, 15, 2, 23, 90, 67 };
		List<Integer> peaks2 = findAllPeakElements(arr2);
		System.out.println("Peak elements in arr2: " + peaks2); // Output: [20, 90]
	}

	public static int findPeakElement(int[] nums) {
		int left = 0, right = nums.length - 1;

		while (left < right) {
			int mid = left + (right - left) / 2;

			if (nums[mid] > nums[mid + 1]) {
				// If the middle element is greater than the right neighbor,
				// then the peak must be in the left half (including the middle element)
				right = mid;
			} else {
				// If the middle element is less than or equal to the right neighbor,
				// then the peak must be in the right half
				left = mid + 1;
			}
		}
		// Left and right will converge to the peak element
		return nums[left];
	}
}
