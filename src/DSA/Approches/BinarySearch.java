package DSA.Approches;

public class BinarySearch {
	
	public static int findMax(int[] arr) {
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			// Check if the middle element is the maximum
			if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
				return arr[mid];
			}

			// Check which side to search
			if (arr[mid] >= arr[left]) {
				// The left side is sorted, so the maximum must be in the right half
				left = mid + 1;
			} else {
				// The right side is sorted, so the maximum must be in the left half
				right = mid - 1;
			}
		}

		// In case array is not rotated, just return the last element
		return arr[right];
	}

	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
		System.out.println("Maximum element: " + findMax(arr));
	}
}
