package sorting;

public class bUBBLsORT {
// Limit Exceeded in Leetcode
	public static int[] bubbleSort(int[] arr) {
		int n = arr.length;
		boolean swaped;
		for (int i = 0; i < n - 1; i++) {
			swaped = false;
			for (int j = 0; j < n - i - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swaped = true;

				}
			}
			if (!swaped) {
				break;
			}
		}

		return arr;
	}

	public static void main(String[] args) {

		int[] arr = { 78, 90, 23, 1, 34, 1 };
		int[] bubbleSort = bubbleSort(arr);
		for (int a : bubbleSort) {
			System.out.println(a);
		}

	}
}
