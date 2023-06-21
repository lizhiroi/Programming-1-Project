package Proj1;

public class Q5 {
	 public static int majorityElement(int[] nums) {
	        int majority = nums[0];  
	        int count = 1;  

	        
	        for (int i = 1; i < nums.length; i++) {
	            
	            if (count == 0) {
	                majority = nums[i];
	                count = 1;
	            } 
	            else if (nums[i] == majority) {
	                
	                count++;
	            } 
	            else {
	                
	                count--;
	            }
	        }

	        return majority;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {3, 2, 3};
        int majority = majorityElement(nums);
        System.out.println("Majority Element: " + majority);

	}

}
