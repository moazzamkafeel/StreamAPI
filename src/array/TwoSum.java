package array;

import java.util.HashMap;
import java.util.Map;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

// O(n)

	public static int[] twoSum(int[] nums, int target) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {

			int complement = target - nums[i];

			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i

				}; // Found complement at the end
			}

			map.put(nums[i], i); // storing all array values with index

		}

		throw new IllegalArgumentException("No two sum solution");
	}

	public static void main(String[] args) {

		int[] nums = { 1, 3, 5, 7, 9, 11, 13, 15 }; // Array where the solution is at the end
		int target = 18;
		int[] result = twoSum(nums, target);
		System.out.println("Indices: " + result[0] + ", " + result[1]);

	}

}
