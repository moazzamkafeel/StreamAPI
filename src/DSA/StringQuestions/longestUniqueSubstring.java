package DSA.StringQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class longestUniqueSubstring {
	
// Steps
	// 1 Substring 
	// 2 check uniqu string
	//3 find maximm lenth Math.max()
	
	public static void main(String[] args) {
		String str = "abcabcdabcdef";
		System.out.println(longestUniqueSubstringBruteForce(str));
		
	}     
	// BRUTEFORCE
	// TIME COMPLICITY O(n2)
	public static int longestUniqueSubstringBruteForce(String s) {
	
		int maxLength = 0;
	    int n = s.length();

	    for (int i = 0; i < n; i++) {
	        for (int j = i + 1; j <= n; j++) {
	            String sub = s.substring(i, j);
	            if (allUnique(sub)) {
	                maxLength = Math.max(maxLength, sub.length());
	            }
	        }
	    }
	    return maxLength;
	}

	public static int longestUniqueSubstringSlidingWindow(String s) {
	    int maxLength = 0;
	    int start = 0;
	    Set<Character> seen = new HashSet<>();

	    for (int end = 0; end < s.length(); end++) {
	        char current = s.charAt(end);

	        // Shrink the window if duplicate is found
	        while (seen.contains(current)) {
	            seen.remove(s.charAt(start));
	            start++;
	        }

	        // Add current character to the set and update maxLength
	        seen.add(current);
	        maxLength = Math.max(maxLength, end - start + 1);
	    }

	    return maxLength;
	}
	
//	Sliding Window with HashMap	
//	𝑂(𝑛)
	public static int longestUniqueSubstringHashMap(String s) {
	    int maxLength = 0;
	    int start = 0;
	    HashMap<Character, Integer> charIndexMap = new HashMap<>();

	    for (int end = 0; end < s.length(); end++) {
	        char current = s.charAt(end);

	        // If the character is repeated, update the start pointer
	        if (charIndexMap.containsKey(current)) {
	            start = Math.max(start, charIndexMap.get(current) + 1);
	        }

	        // Update the character's index in the map
	        charIndexMap.put(current, end);

	        // Calculate the current window size
	        maxLength = Math.max(maxLength, end - start + 1);
	    }

	    return maxLength;
	}

	private static boolean allUnique(String s) {
	    Set<Character> set = new HashSet<>();
	    for (char c : s.toCharArray()) {
	        if (!set.add(c)) return false;
	    }
	    return true;
	}
	
}