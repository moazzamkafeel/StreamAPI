package DSA.Approches;

import java.util.*;

public class SlidingWindow {
    public static void findMaxInWindow(int[] arr, int k) {
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            // Remove elements out of this window
            if (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }

            // Remove elements smaller than the current element
            while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]) {
                deque.pollLast();
            }

            // Add current element at the back of the deque
            deque.offer(i);

            // Print the maximum element of the window
            if (i >= k - 1) {
                System.out.print(arr[deque.peek()] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        System.out.println("Maximum in each window of size " + k + ":");
        findMaxInWindow(arr, k);
    }
}
