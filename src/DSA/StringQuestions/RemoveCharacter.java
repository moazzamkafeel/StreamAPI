package DSA.StringQuestions;

public class RemoveCharacter {

	public static String removeChar(String str, char ch) {
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			// Append all characters except the one to remove
			if (str.charAt(i) != ch) {
				result += str.charAt(i); // Concatenate the character to the result
			}
		}

		return result;

	}

	public static void main(String[] args) {
		String input = "banana";
		char charToRemove = 'a';

		String result = removeChar(input, charToRemove);
		System.out.println("Original String: " + input);
		System.out.println("String after removing '" + charToRemove + "': " + result);
	}

}