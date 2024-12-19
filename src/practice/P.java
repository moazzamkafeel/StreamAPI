package practice;

public class P {
	
	
	
//	public static int[] minMax(int[] arr) {
//		
//		
//	}

	public static void main(String[] args) {

		int[] arr = {23, 33, 44, 22, 23, 56};
		
        int max = arr[0];
        
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max){
				max=arr[i];
				}
			}
		System.out.println(max);
		
	}
}
