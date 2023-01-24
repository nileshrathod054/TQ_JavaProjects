package assignment_19thDec;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		// int num=151;
		int sum = 0;
		int m = num;

		while (num > 0) {
			int rem = num % 10;
			sum = sum * 10 + rem;
			num = num / 10;
		}
		if (m == sum) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println("Number is not palindrome");
		}
	}

}
