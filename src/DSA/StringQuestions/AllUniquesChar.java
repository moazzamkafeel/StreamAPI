package DSA.StringQuestions;

import java.util.Arrays;

public class AllUniquesChar {

	public static boolean allUnique(String str) {

		char[] charArray = str.toLowerCase().toCharArray();

		Arrays.sort(charArray);

		int left = 0, right = 1;

		while (right < charArray.length) {
			if (charArray[left] == charArray[right]) {
				return false;
			}
	
			++left;
			right++;
		}
		
	
		return true;
	}

	public static void main(String[] args) {

		String str = "oazzm";
		System.out.println(allUnique(str));
		System.out.println("Hi");
	}
}
