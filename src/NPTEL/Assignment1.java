package NPTEL;

public class Assignment1 {

	public static void main(String[] args) {
		printNumbers(1, 2, 3); // Output: 1 2 3
		printNumbers(10, 20); // Output: 10 20
		printNumbers(); //
		printNumbers(new int[] { 5, 6 }); // Output: 5 6
	}

	public static void printNumbers(int... numbers) {
		for (int number : numbers) {
			System.out.print(number + " ");
		}
		System.out.println();
	}

	public static int addNumbers(int... numbers) {
		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		return sum;
	}
}
