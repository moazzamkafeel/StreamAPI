package DSA.StringQuestions;

import java.util.ArrayList;
import java.util.List;

public class permutationOfString {

	public static List<String> permustation(String str, String ans) {
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String ros = str.substring(0, i) 
					+ str.substring(i + 1);
			permustation(ros, ans + ch);
			list.add(ros + ans + ch);
		}
		return list;
	}

	public static void main(String[] args) {

		String str = "ab";
		List<String> list = permustation(str, "");
		System.out.println(list);

	}
}