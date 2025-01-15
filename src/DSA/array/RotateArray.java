package DSA.array;

public class RotateArray {
	
//	    public void rotate(int[] nums, int k) {
//	        int n = nums.length;
//	        k = k % n; // Handle cases where k > n
//
//	        // Step 1: Reverse entire array
//	        reverse(nums, 0, n - 1);
//
//	        // Step 2: Reverse first k elements
//	        reverse(nums, 0, k - 1);
//
//	        // Step 3: Reverse remaining n-k elements
//	        reverse(nums, k, n - 1);
//	    }
//
//	    private void reverse(int[] nums, int left, int right) {
//	        while (left < right) {
//	            int temp = nums[left];
//	            nums[left] = nums[right];
//	            nums[right] = temp;
//	            left++;
//	            right--;
//	        }
//	    }

	  public void rotate(int[] nums, int k) {
	        int n=nums.length;
	       k = k % n; // Handle cases where k > n

		        // Step 1: Reverse entire array
		        reverse(nums, 0, n - 1);

		        // Step 2: Reverse first k elements
		        reverse(nums, 0, k - 1);

		        // Step 3: Reverse remaining n-k elements
		        reverse(nums, k, n - 1);

	    }
	  private void reverse(int[] nums, int left, int right) {
	             while(left < right) {
	               int temp = nums[left];
	                nums[left] = nums[right];
	                nums[right] = temp;    
	                left++;
	                right--;   
	           }
	      }
	  
//	    private void reverse(int[] nums, int left, int right) {
//	        while (left < right) {
//	            int temp = nums[left];
//	            nums[left] = nums[right];
//	            nums[right] = temp;
//	            left++;
//	            right--;
//	        }
//	    }
	    public static void main(String[] args) {
	        RotateArray solution = new RotateArray();
	        int[] nums = {1, 2, 3, 4, 5, 6, 7};
	        int k = 3;
	        solution.rotate(nums, k);

	        // Print rotated array
	        for (int num : nums) {
	            System.out.print(num + " ");
	        }
	    }
}