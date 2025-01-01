package DSA.Approches;

public class DivideAndConquer {
	
    public static int findMax(int[] arr, int low, int high) {
        if (low == high) {
            return arr[low];
        }
        
        int mid = (low + high) / 2;
        int leftMax = findMax(arr, low, mid);
        int rightMax = findMax(arr, mid + 1, high);
        return Math.max(leftMax, rightMax);
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2};
        System.out.println("Maximum: " + findMax(arr, 0, arr.length - 1));
    }
}
