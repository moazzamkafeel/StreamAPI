package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Str {

	public static void main(String[] args) {

		java.lang.String str = "Moazzam";

		int vovels = 0;
		int consonant = 0;
		int total = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (total != ' ') {
				total++;
			}
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vovels++;
			} else if (Character.isLetter(ch)) {
				consonant++;
			}
		}

		System.out.println(vovels + "<----vovels  ----- consonant--->" + consonant);
		System.out.println("Total--->" + total);

		// Reverse
		String rev = "";

		for (int i = 0; i < str.length(); i++) {
			rev = str.charAt(i) + rev;
		}

		if (str.equals(rev)) {
			System.out.println("Palindrom Strig " + rev);
		} else
			System.out.println("Not {alindrom");

		// first Non Repeted Chracter
		for (char ch : str.toCharArray()) {
			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				System.out.println("non repeated Char --> " + ch);
				break;
			}
		}

		Stream.of(str).map(x -> x.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList())
				.forEach(System.out::println);

		Map<Character, Long> collect = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(x -> x, Collectors.counting()));
		collect.forEach((x, y) -> System.out.println(x + "---" + y));

		// Anagram

		String str2 = "linkb";
		if (str.length() == str2.length()) {
			char[] charArray = str.toCharArray();
			char[] charArray2 = str2.toCharArray();
			Arrays.sort(charArray);
			Arrays.sort(charArray2);

			if (Arrays.equals(charArray, charArray2)) {
				System.out.println("This is Anagram");
			} else
				System.out.println("not anagram");

		}

		// Substring
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));
			}
		}

		// unique character
		HashSet<Character> hs = new HashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			hs.add(str.charAt(i));
		}
		hs.forEach(x -> System.out.println("Unique Char--->  " + x));
// max
		int[] arr = { 3, 43, 23, 67};
		int max=arr[0];
		for (int i = 0; i < arr.length; i++) {
         
			if(arr[i]>max)
			{
				max =arr[i];
			}
		}
		
		System.out.println("max-->"+max);
		
		
		int num = 6766778 ;
		int count = 0;
		
		while(num>0)
		{
	    	num=num/10;
		    count++;
		}
		System.out.println(count);
		
		
		
		
		
		
		
		
	}
}