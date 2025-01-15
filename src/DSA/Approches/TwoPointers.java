package DSA.Approches;

import java.util.Arrays;

public class TwoPointers {
	
//	  public static boolean isPalindrome(String s) {
//	         s = s.toLowerCase();
//	        int left = 0, right = s.length() - 1;
//	        while (left < right) {
//	            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
//	                left++;
//	            }
//	            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
//	                right--;
//	            }
//
//	            if (s.charAt(left) != s.charAt(right)) {
//	                return false;
//	            }
//	            left++;
//	            right--;
//	        }
//	        return true;
//	    }
//    public static void findMaxMin(int[] arr) {
//    	
//        int left = 0;
//        int right = arr.length - 1;
//
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//
//        while (left <= right) {
//            max = Math.max(max, Math.max(arr[left], arr[right]));
//            min = Math.min(min, Math.min(arr[left], arr[right]));
//            left++;
//            right--;
//        }
//
//        System.out.println("Maximum: " + max);
//        System.out.println("Minimum: " + min);
//        
//      
//
//    }
//
//    public static int[] twoSum(int[] arr, int target) {
//        Arrays.sort(arr); // Ensure the array is sorted
//        int left = 0;
//        int right = arr.length - 1;
//
//        while (left < right) {
//            int sum = arr[left] + arr[right];
//
//            if (sum == target) {
//                return new int[]{arr[left], arr[right]};
//            } else if (sum < target) {
//                left++;
//            } else {
//                right--;
//            }
//        }
//
//        // If no pair is found
//        return new int[]{};
//    }
//    public static void main(String[] args) {
//        int[] arr = {3, 1, 4, 1, 5, 9, 2};
//        findMaxMin(arr);
//        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true
//        System.out.println(isPalindrome("race a car")); // false
//        System.out.println(isPalindrome("")); // true
//        System.out.println(isPalindrome("   ")); // true
//        System.out.println(isPalindrome("ab@a")); // true
//        System.out.println(isPalindrome("abc")); // false
//    }
}