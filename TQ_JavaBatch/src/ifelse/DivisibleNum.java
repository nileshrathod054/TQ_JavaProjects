package ifelse;

import java.util.Scanner;

public class DivisibleNum {

	public static void main(String[] args) {

		// int num = 55;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		if (num % 5 == 0 && num % 11 == 0) {
			System.out.println("Number is divisible by 5 and 11");
		} else
			System.out.println("Number is not divisible by 5 and 11");

	}

}
