package DSA.array;

public class MinMax {
	
//	Time Complexity: O(n)
//	Space Complexity: O(1) 
	
	// Steps
	// max current index > max[0]
	public static int[] minMax(int[] arr) {
		int min = arr[0];
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return new int[] { min, max };
	}

	public static void main(String[] args) {
		int[] arr = { 100, 88, 99, 66, 55 };
		int[] min = minMax(arr);
		for (int m : min) {
			System.out.println(m);
		}
	}
}
