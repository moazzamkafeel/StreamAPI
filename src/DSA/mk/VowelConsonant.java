package DSA.mk;

import java.util.ArrayList;

public class VowelConsonant {

	private static int vowel;
	private static int consonant;
	static ArrayList<Character> listOfVowel = new ArrayList<>();
	static ArrayList<Character> listOfConsonant = new ArrayList<>();

	public static void main(String[] args) {

		String s = "bcDAefghI34jklMnopqrstUvWXyz";
		String s1 = s.toLowerCase();
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				listOfVowel.add(c);
				vowel++;
			} else {
				listOfConsonant.add(c);
				consonant++;
			}
		}

		System.out.println(vowel);
		System.out.println(consonant);
		System.out.println(listOfVowel);
		System.out.println(listOfConsonant);

//	

		int consonant = 0;
		int vowels = 0;

		for (int i = 0; i < s1.length(); i++) {
			var c = s1.charAt(i);
			if (c == 'a' || c == 'i' || c == 'o' || c == 'e' || c == 'u') {
				vowels++;
			} else {
				consonant++;
			}
		}
		System.out.println(consonant);

	}
}
