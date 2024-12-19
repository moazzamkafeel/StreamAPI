package DSA.IntegerQuestions;

import java.util.Arrays;

public class IntersectionOfTwoArrays {

//	The intersection of two sets or collections is the set of 
//	elements that are common to both.	
	public static void main(String[] args) {
		
		int[] in = intersection(a,b);
		//System.out.println(Arrays.toString(in));
		System.out.println(Arrays.toString(in));
//		String[] inter = intersectStream(arr1,arr2);
//		System.out.println(Arrays.toString(inter));
	}
	static int[] a= {6,4,2,7,6};
	static int b[]= {5,66,2,7,9};
	
	
	public static int[] intersection(int[] a, int[] b) {
	    return Arrays.stream(a)
	                 .distinct()
	                 .filter(x -> 
	                 Arrays.stream(b).anyMatch(y -> y == x))
	                 .toArray();
	}
	
	
	static String[] arr1={"2","7","7","9"};
    static String[] arr2={"3","3","7","9"};
	
	public static String[] intersectStream(String[] arr1, String[] arr2){
	    return Arrays.stream(arr1)
	            .distinct()
	            .filter(x -> Arrays.asList(arr2).contains(x))
	            .toArray(String[]::new);
	}

}
