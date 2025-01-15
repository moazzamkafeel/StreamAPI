package DSA.StringQuestions;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        // Example input
        String[] strs = {"flower", "flow", "flight"};

        // Call the method to find the longest common prefix
        String result = longestCommonPrefixBruteForce(strs);

        // Output the result
        System.out.println("Longest Common Prefix (Brute Force): " + result);
    }

    // Method to find the longest common prefix using brute force
    public static String longestCommonPrefixBruteForce(String[] strs) {
        if (strs == null || strs.length == 0) {
            return ""; // Return an empty string if no strings are provided
        }

        String prefix = strs[0]; // Initialize prefix to the first string

        for (int i = 0; i < prefix.length(); i++) {
            char currentChar = prefix.charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() 
                		
                		|| strs[j].charAt(i) != currentChar) {
                    return prefix.substring(0, i); // Return the common prefix so far
                }
            }
        }

        return prefix; // If no mismatches found, the entire prefix is common
    }
}

