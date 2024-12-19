package DSA.array;

import java.util.ArrayList;

public class PeakElemnet {
//Step
	// 1. If (checking first index || Previous Number && last index || Next Number)

	public static ArrayList<Integer> peak(int[] arr) {

		ArrayList<Integer> peak = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			if ((i == 0 || arr[i] >= arr[i-1]) && (i == arr.length - 1 || arr[i] >= arr[i+1])) {
				peak.add(arr[i]);
			}
		}
		return peak;
	}

	
	public static void main(String[] args) {

		int[] arr = { 23, 45, 12, 6, 7, 4 };

		ArrayList<Integer> num = peak(arr);
		System.err.println(num);

	}
}
