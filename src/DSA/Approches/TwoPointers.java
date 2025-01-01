package DSA.Approches;

public class TwoPointers {
    public static void findMaxMin(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (left <= right) {
            max = Math.max(max, Math.max(arr[left], arr[right]));
            min = Math.min(min, Math.min(arr[left], arr[right]));
            left++;
            right--;
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2};
        findMaxMin(arr);
    }
}

