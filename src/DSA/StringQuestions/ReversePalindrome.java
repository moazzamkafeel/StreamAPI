package DSA.StringQuestions;

public class ReversePalindrome {

	public static void main(String[] args) {

		String str = "Moazzam";
		String rev = "";

		for (int i = 0; i < str.length(); i++) {
			rev = str.charAt(i) + rev;
		}
		System.out.println(rev);
		if (str.equals(rev)) {
			System.out.println("String is palindrome--> " + rev);

		} else
			System.out.println("string is not palindrome");
	}
}