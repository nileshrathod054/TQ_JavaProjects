package assignment_28thJanException;

import java.util.Scanner;

public class Q7NumberFormatException {
	public static void main(String[] arg) {

		int num;

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("Enter any valid Integer: ");

			try {

				num = Integer.parseInt(sc.next());

				System.out.println("You entered: " + num);

				break;
			}

			catch (NumberFormatException e) {

				System.out.println("NumberFormatException occurred");
			}
		}
	}
}
