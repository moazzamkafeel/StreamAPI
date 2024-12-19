package DSA.StringQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class P {

	public static void main(String[] args) {

		// BruteForce LongestSubstring
		List<String> allSubstrings = new ArrayList<>();
		HashSet<Character> hs = new HashSet<>();
		int maxLength = 0;
		String str = "abcabcdd";
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String substring = str.substring(i, j);
				allSubstrings.add(substring);
				for (char st : substring.toCharArray()) {
					if (!hs.add(st)) {
						maxLength = Math.max(maxLength, substring.length());
					}
				}
			}
		}
		allSubstrings.forEach(System.out::println);
		System.out.println(maxLength);
	}
}