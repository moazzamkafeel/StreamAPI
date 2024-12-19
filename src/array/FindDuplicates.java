package array;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {

	public static List<Integer> findDuplicates(int[] nums) {

		List<Integer> duplicates = new ArrayList<>();

		int index = 0;

		for (int i = 0; i < nums.length; i++) {

			index = Math.abs(nums[i]) - 1;

			if (nums[index] < 0) {

				duplicates.add(index + 1);

			} else {

				nums[index] = -nums[index];

			}

		}

		return duplicates;
	}

	public static void main(String[] args) {
		
		int[] array = { 4, 3, 2, 7, 8, 2, 3, 1 };
		
		System.out.println("Duplicates: " + findDuplicates(array));
	}

}