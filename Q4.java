package Proj1;


public class Q4 {
	 public static void sortArray(int[] nums) {
	        int n = nums.length;

	        
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (nums[j] > nums[j + 1]) {
	                  
	                    int temp = nums[j];
	                    nums[j] = nums[j + 1];
	                    nums[j + 1] = temp;
	                }
	            }
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] nums = {10, 9, 8, 7, 6}; 

	        System.out.println("Original Array:");
	        printArray(nums);

	        sortArray(nums);

	        System.out.println("Sorted Array:");
	        printArray(nums);
	    }

	    public static void printArray(int[] nums) {
	        for (int num : nums) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
		 
	}

}
