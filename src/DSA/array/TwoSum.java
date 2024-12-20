package DSA.array;

public class TwoSum {

	public static int[] twoSum(int[] arr, int target) {
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			for (int j = i; i < n + 1; j++) {
				if (arr[j] == target - arr[i]) {
					return new int[] { i, j };
				}
			}
		}
		throw new IllegalArgumentException("No Two Sum Exception");
	}

	public static void main(String[] args) {
		int arr[] = { 6, 5, 4, 3, 2 };

		int[] result = twoSum(arr, 8);

		for (int i : result) {
			System.out.println(i + "------->indexes");
		}
	}
}
