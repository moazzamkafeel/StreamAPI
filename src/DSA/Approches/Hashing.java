package DSA.Approches;

import java.util.HashSet;

public class Hashing {
    public static void findOddEven(int[] arr) {
        HashSet<Integer> oddSet = new HashSet<>();
        HashSet<Integer> evenSet = new HashSet<>();

        for (int num : arr) {
            if (num % 2 == 0) {
                evenSet.add(num);
            } else {
                oddSet.add(num);
            }
        }

        System.out.println("Odd Numbers: " + oddSet);
        System.out.println("Even Numbers: " + evenSet);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        findOddEven(arr);
    }
}
