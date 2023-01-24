package assignment_19thDec;

import java.util.Scanner;

public class SumOfFact {

	public static void main(String[] args) {
		
		// int n = 5;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int n = sc.nextInt();
		
		int fact = 1, sum = 0;

		for (int i = 1; i <= n; i++) {

			fact = fact * i;

			sum = sum + fact;

		}

		System.out.println(sum);
	}

}
