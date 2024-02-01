package DSA.IntegerQuestions;

public class CountNumber {
	public static void main(String[] args) {

		int a = 46789;
		int count = 0;

		while (a > 0) {
			a = a / 10;
			count++;
		}
		System.out.println(count);

	}

	private static int m1(int a) {
		int count = 0;
		a = a / 10;
		count++;
		return count;
	}

}
