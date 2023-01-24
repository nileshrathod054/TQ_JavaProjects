package assignment_19thDec;

import java.util.Scanner;

public class ProductOfDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");

		int num = sc.nextInt();

		int prod = 1;

		while (num > 0) {

			int digit = num % 10;

			prod = prod * digit;

			num = num / 10;

		}

		System.out.println("Product of digits of number : " + prod);
	}

}
