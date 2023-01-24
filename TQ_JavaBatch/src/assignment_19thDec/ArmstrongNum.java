package assignment_19thDec;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number.");

		int num = sc.nextInt();

		int sum = 0;

		int temp = num;

		while (num > 0) {
			int rem = num % 10;
			sum = sum + rem * rem * rem;
			num = num / 10;
		}
		if (temp == sum) {

			System.out.println(temp + " is an Armstrong Number");

		} else

			System.out.println(temp + " is not an Armstrong Number");
	}

}
