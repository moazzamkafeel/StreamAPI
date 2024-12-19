package DSA.array;

public class ReverseArray {

	public static int[] reverseArrayBruteForce(int[] array) {
		int lengthOfArray = array.length;
		int[] rev = new int[lengthOfArray];
		
		for (int i = 0; i < lengthOfArray; i++) {
			
			rev[i] = array[lengthOfArray - 1 - i];
			
		}
		return rev;
	}

	public static void main(String[] args) {
		int arr[] = { 12, 34, 44, 55, 65, 67, 99 };
		int[] rev = reverseArrayBruteForce(arr);
		for (int num : rev) {
			System.out.println(num);
		}
	}
}
