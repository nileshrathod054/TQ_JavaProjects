package patterns;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Rows");

		int rows = sc.nextInt();

		for (int i = 1; i <= rows; i++) {

			for (int sp = rows - 1; sp >= i; sp--) {

				System.out.print(" ");

			}

			for (int j = 1; j <= i; j++) {

				System.out.print("*");

			}

			System.out.println("");

		}
	}

}
