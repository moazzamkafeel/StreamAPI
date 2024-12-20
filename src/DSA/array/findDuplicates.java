package DSA.array;

import java.util.ArrayList;
import java.util.List;

public class findDuplicates {

	@SuppressWarnings("Pending")
	public static List<Integer> duplicate(int[] arr){
		ArrayList<Integer> res = new ArrayList<>();
		
		for(int i=0;i<arr.length -1;i++) {
			for(int j = i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j]) {
					
					if(!res.contains(arr[i])) {
						res.add(arr[i]);
					}
					break;
				}
			}
		}
		return res;
	}
	
	
	public static void main(String[] args) {
		
		
		int [] arr= {23,4,344,33,22,332,22,33};
		List<Integer> duplicate = duplicate(arr);
		System.out.println(duplicate);
		
	}
}
