package DSA.StringQuestions;

import java.util.ArrayList;
import java.util.List;

public class FindAllSubstrings {

	public static void main(String[] args) {
		String input = "moazzam";
		List<String> substrings = substringsBruteForce(input);
		System.out.println(substrings);
	}

	// BruteForce
	// Time Complicity O(n^2)
	public static List<String> substringsBruteForce(String str) {
		List<String> result = new ArrayList<>();
		int n = str.length();
		// Generate all substrings
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
				System.out.println(str.substring(i, j));
				result.add(str.substring(i, j));
				// System.out.println(str.charAt(i)+"---"+str.charAt(j));
			}
		}
		return result;
	}
}