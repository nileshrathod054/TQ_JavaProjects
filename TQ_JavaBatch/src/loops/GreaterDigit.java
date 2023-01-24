package loops;

import java.util.Scanner;

public class GreaterDigit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");

		int num = sc.nextInt();

		int max = num % 10;

		num = num / 10;

		while (num > 0) {

			int rem = num % 10;

			if (rem > max) {

				max = rem;
			}
			num = num / 10;
		}
		System.out.println(max);
	}
}
