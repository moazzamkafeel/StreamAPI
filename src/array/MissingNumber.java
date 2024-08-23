package array;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;

        for (int num : nums) {
            arraySum += num;
        }

        return totalSum - arraySum;
    }

    public static void main(String[] args) {
        int[] array = {3, 0, 1};
        System.out.println("Missing Number: " + missingNumber(array));
    }
}

