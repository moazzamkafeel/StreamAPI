package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

import DSA.StringQuestions.FindAllSubstrings;

public class Dec_15_24 {

	public static void main(String[] args) {

		String str = "mazzam";
		System.out.println(reverseString(str));

		System.out.println(palindromeString(str));

		int[] countVowelsAndConsonant = countVowelsAndConsonant(str);

		for (int count : countVowelsAndConsonant) {
			System.out.println(count);
		}

		System.out.println(removeDuplicate(str));

		String str2 = "mozzam";
		System.out.println(anagram(str, str2));

		String substring = "abcabcd";
		System.out.println(longestSubstring(substring));
	}

	// Q1
	public static String reverseString(String str) {

		String rev = "";
		for (int i = 0; i < str.length(); i++) {
			rev = str.charAt(i) + rev;
		}
		return rev;

	}

// Q2 
	public static String palindromeString(String str) {
		String rev = "";
		for (int i = 0; i < str.length(); i++) {
			rev = str.charAt(i) + rev;
		}
		if (str.equals(rev)) {

			return "This String is palindrome--> " + rev;
		} else {
			return "not palindrome";
		}

	}

	public static int[] countVowelsAndConsonant(String str) {
		int vowels = 0;
		int consonant = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'i' || ch == 'o' || ch == 'u') {

				vowels++;
			} else {

				consonant++;
			}
		}
		return new int[] { vowels, consonant };
	}

	public static String removeDuplicate(String str) {
		HashSet<Character> hashSet = new HashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (hashSet.add(ch)) {
				System.out.println("hashset");
			}
		}
		return hashSet.toString();
	}

	public static String anagram(String str, String str2) {

		if (str.length() == str2.length()) {
			char[] charArray = str.toCharArray();
			char[] charArray1 = str2.toCharArray();
			Arrays.sort(charArray);
			Arrays.sort(charArray1);
			if (Arrays.equals(charArray, charArray1)) {
				return "This String is Anafram--->" + str;
			}
		} else
			return "Length not match";
		return "This String is Anagram--->" + str;

	}

	public static int longestSubstring(String str) {
		int longest = 0;
		String lstr = "";
		ArrayList<String> arrayList = new ArrayList<String>();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String substring = str.substring(i, j);
				arrayList.add(substring);
				lstr = arrayList.stream().max(Comparator.naturalOrder()).get();
			}

		}
		return lstr.length();

	}
}