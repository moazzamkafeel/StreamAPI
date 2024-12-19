package DSA.StringQuestions;

import java.util.Arrays;

public class Anagram {
	// Check Length
	// Covert into Char
	// Sort char
	    public static void main(String[] args) {
	        String str1 = "listen";
	        String str2 = "silent";
	        
	        boolean result = areAnagrams(str1, str2);
	        System.out.println("Are \"" + str1 + "\" and \"" + str2 + "\" anagrams? " + result);
	    }

	    public static boolean areAnagrams(String str1, String str2) {
	    	
	        // If lengths are not equal, they cannot be anagrams
	        if (str1.length() != str2.length()) {
	        	
	            return false;
	        }

	        // Convert strings to char arrays and sort them
	        char[] arr1 = str1.toCharArray();
	        char[] arr2 = str2.toCharArray();
	        Arrays.sort(arr1);
	        Arrays.sort(arr2);
	        // Compare sorted arrays
	        return Arrays.equals(arr1, arr2);
	        
	 
	    }
	}