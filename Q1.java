package Proj1;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner (System.in);
		
		int n1, n2, n3, sum, magicNum;
		System.out.println("Enter 3 2-digit numbers:");
		
	    n1 = kb.nextInt();
	    System.out.print(" ");
	    n2 = kb.nextInt(); 
	    System.out.print(" ");
		n3 = kb.nextInt();
		System.out.println();


		
		sum = n1 + n2 + n3;
		
		 if (sum % 3 == 0 && sum % 5 != 0) {
	           	int firstDigit = n2 / 10;
	            magicNum = firstDigit * 100 + n1 + n3;
	        } 
		 else if (sum % 3 != 0 && sum % 5 == 0) {
	            int lastDigit = n2 % 10;
	            magicNum = (n1 + n3) * 10 + lastDigit;
	        } 
		 else if (sum % 3 == 0 && sum % 5 == 0) {
	            magicNum = n2 * 1000 + n1 * 10 + 1;
	        } 
		 else {
	             magicNum = n1 * 10000 + n2 * 100 + n3;
	        }

	        System.out.println("Your magic number is " + magicNum);

	        kb.close();



	


		
		
		
		}
	}

