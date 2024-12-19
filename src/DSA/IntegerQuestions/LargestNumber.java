package DSA.IntegerQuestions;

public class LargestNumber {
	public static void main(String[] args) {

		int a = 10, b = 20, c = 30;

		// first method by if else statement
		if (a > b && a > c) {
			System.out.println(a + "a is largest number");
		}
		if (b > c && b > a) {
			System.out.println(b + "a is largest number");
		} else {
			System.out.println(c + "c is largest number");
		}

		// 2nd by ternery operator
//	condition ? expression_if_true : expression_if_false

		int largest = (a > b) ? (b > a ? a : b) : (c > b ? c : b);
		System.out.println(largest + " is largest number");

		// ternery Operator by 2 digit
		int d = 444, f = 76;
		int er = d > f ? d : f;

		System.out.println(er);

	}

}
