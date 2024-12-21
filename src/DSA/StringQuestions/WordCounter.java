package DSA.StringQuestions;

public class WordCounter {
	static int i, count = 0, res;

	public static int wordCount(String str) {
		char[] c = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			c[i] = str.charAt(i);
			if (((i > 0) && (c[i] != ' ') && (c[i - 1] == ' ')) || ((c[0] != ' ') && (i == 0))) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
 String str = "My name Is Moazzam";
 System.out.println(wordCount(str));
	}
}
