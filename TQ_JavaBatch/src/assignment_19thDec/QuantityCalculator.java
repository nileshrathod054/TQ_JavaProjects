package assignment_19thDec;

import java.util.Scanner;

public class QuantityCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sum = 0;

		while (true) {

			System.out.println("Enter the quantity of Milk");

			int milk_quantity = sc.nextInt();

			System.out.println("Enter the quantity of oil");

			int oil_quantity = sc.nextInt();

			sum = milk_quantity + oil_quantity * 50;

			if (sum > 500) {

				break;

			}

		}

		System.out.println(sum);
	}

}
