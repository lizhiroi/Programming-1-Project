package Proj1;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

        System.out.println("Joker: ");
        int joker = kb.nextInt();

        System.out.println("Number: ");
        int number = kb.nextInt();

        System.out.println("Enter numbers: ");
        
        for (int i = 0; i < number; i++) {
            int input = kb.nextInt();
            int result = (input < joker) ? 0 : (input - joker);
       
            System.out.print(result + " ");
        }

        kb.close();

	}

}
