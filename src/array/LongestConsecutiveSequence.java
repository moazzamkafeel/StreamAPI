package array;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
	
    public static int longestConsecutive(int[] nums) {
    	
        Set<Integer> numSet = new HashSet<>();
        
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
          
            }
        }

        return longestStreak;
    }

    public static void main(String[] args) {
        int[] array = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest Consecutive Sequence: " + longestConsecutive(array));
    }
}

