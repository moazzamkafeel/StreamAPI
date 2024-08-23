package array;

public class MajorityElement {
	
	public static int majorityElement(int[] nums) {
		int count = 0;
		Integer candidate = null;

		for (int num : nums) {
			if (count == 0) {
				candidate = num;
			}
			count += (num == candidate) ? 1 : -1;
		}

		return candidate;
	}

	public static void main(String[] args) {
		int[] array = { 3, 3, 4, 2, 4, 4, 2, 4, 4 };
		System.out.println("Majority Element: " + majorityElement(array));
	}
}
