package arrayAssignment;

import java.util.Scanner;

public class Q4_TypeOfNo {
	public static void main(String ar[]){

		Scanner sc = new Scanner(System.in);

		int n, I, p = 0, c = 0, o = 0, e = 0, z = 0;

		for (I = 1; I <= 20; I++){

			System.out.println("Enter a number");

			n = sc.nextInt();

			if (n > 0)

				p++; // count of positive no's.

			if (n < 0)

				c++; // count of negative no's.

			if (n % 2 == 0)

				e++; // count of even no's.

			if (n % 2 != 0)

				o++; // count of odd no's

			if (n == 0)

				z++; // count of zeros

		}

		System.out.println("Number of positive numbers : " + p);

		System.out.println("Number of negative numbers : " + c);

		System.out.println("Number of odd numbers : " + o);

		System.out.println("Number of even numbers : " + e);

		System.out.println("Number of zero's : " + z);

	}
}
