package Proj1;

public class Q6 {
	public static int findNum(int[] nums) {
        int n = nums.length;
        int totalSum = (n * (n + 1)) / 2; 
        
        for (int num : nums) {
            totalSum -= num;
        }

        return totalSum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {3, 0, 1}; 
        int missingNumber = findNum(nums);
        System.out.println("Missing Number: " + missingNumber);
	}

}
