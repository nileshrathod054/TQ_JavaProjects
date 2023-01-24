package basic;

import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {
		// int num1=10, num2=20;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number");

		int num1 = sc.nextInt();

		System.out.println("Enter second number");

		int num2 = sc.nextInt();

		int addition = num1 + num2;

		int subtraction = num1 - num2;

		int multiplication = num1 * num2;

		int division = num1 / num2;
		int modulus = num1 % num2;

		System.out.println("Addition =" + num1 + " + " + num2 + " = " + addition);
		System.out.println("Multiplication =" + num1 + " * " + num2 + " = " + multiplication);
		System.out.println("Division =" + num1 + " / " + num2 + " = " + division);
		System.out.println("Modulus =" + num1 + " % " + num2 + " = " + modulus);

	}
}
