package exception;

import java.util.Scanner;

public class Divide {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd number");
		int num2 = sc.nextInt();
		int res = 0;
		try {
			res = num1 / num2;
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("You are dividing by zero");
		}
		System.out.println("Result is ..." + res);
		System.out.println("Rest of the code");
	}
}
