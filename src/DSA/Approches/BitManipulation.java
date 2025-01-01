package DSA.Approches;

public class BitManipulation {
	
    public static void findOddEven(int[] arr) {
        for (int num : arr) {
            if ((num & 1) == 0) {
                System.out.println(num + " is Even");
            } else {
                System.out.println(num + " is Odd");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        findOddEven(arr);
    }
}
