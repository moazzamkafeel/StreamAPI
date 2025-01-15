package DSA.IntegerQuestions;

import java.util.Arrays;

public class MissingNumberSort {
    
    public static int findMissingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length; // If no number is missing in between, return n
    }

    public static void main(String[] args) {
        int[] nums = {3, 0, 1,99};
        System.out.println(findMissingNumber(nums)); // Output: 2
    }

}
