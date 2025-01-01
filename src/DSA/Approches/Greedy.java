package DSA.Approches;

public class Greedy {
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            max = Math.max(max, num);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2};
        System.out.println("Maximum: " + findMax(arr));
    }
}
