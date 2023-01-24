package loops;

import java.util.Scanner;

public class Nestedloop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");

		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {

			System.out.println("=====================");

			for (int j = 1; j <= 10; j++) {

				int res = i * j;

				System.out.println(i + " * " + j + " = " + res);
			}
		}
	}
}
