package basic;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();

		// int num = 7;

		int a = 0, b = 1, temp;

		System.out.println(" " + a);

		System.out.println(" " + b);

		for (int i = 1; i < num; i++) {

			temp = a + b;

			a = b;

			b = temp;

			System.out.println(" " + temp);
		}

	}
}
