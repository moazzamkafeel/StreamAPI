package array;

public class MaximumValue {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 3, 4, 3, 5, 3 };

		int max = arr[0];

		// Linear Time Complixity O(n)
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > max) {

				max = arr[i];

			}

		}

		System.out.println(max);
	}

}