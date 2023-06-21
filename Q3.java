package Proj1;

import java.util.Random;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner kb = new Scanner(System.in);
	        Random random = new Random();

	        System.out.println("Enter the number of rows: ");
	        int rows = kb.nextInt();

	        System.out.println("Enter the number of columns: ");
	        int cols = kb.nextInt();

	        int[][] array = new int[rows][cols];

	          for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                array[i][j] = random.nextInt(100) + 1;
	            }
	        }

	         System.out.println("Original Array:");
	        printArray(array);

	        System.out.println("Enter the number you want to disappear: ");
	        int target = kb.nextInt();

	       
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                if (array[i][j] == target) {
	                    array[i][j] = 0;
	                }
	            }
	        }

	         System.out.println("final array:");
	        printArray(array);

	        kb.close();
	    }

	    
	    public static void printArray(int[][] array) {
	        int rows = array.length;
	        int cols = array[0].length;

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(array[i][j] + " ");
	            }
	            System.out.println();
	        }

	}

}
