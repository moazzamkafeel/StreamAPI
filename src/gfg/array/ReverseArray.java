package gfg.array;

public class ReverseArray {

	public static void reverse(int[] arr) {

		int left = 0;
		int right = arr.length - 1;

		while (left < right) {               
			// Swap the elements at left and right indices
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;

			// Move the pointers towards the center
			left++;
			right--;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5 };

		reverse(arr);

		// Print the reversed array
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}