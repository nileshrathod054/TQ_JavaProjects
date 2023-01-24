package assignement_27thDec;

import java.util.Scanner;

public class ArithmeticOperation {

	int addition(int a, int b) {
		return a + b;
	}

	int subtraction(int a, int b) {
		return a - b;

	}

	int multiplication(int a, int b) {
		return a * b;
	}

	int division(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArithmeticOperation ao = new ArithmeticOperation();
		int choice;
		System.out.println("Enter 1: Addition");
		System.out.println("Enter 2: Subtraction");
		System.out.println("Enter 3: Multiplication");
		System.out.println("Enter 4: Division");
		System.out.println("Enter your choice");
		choice = sc.nextInt();
		if (choice == 1) {
			System.out.println("Enter first number");
			int a = sc.nextInt();
			System.out.println("Enter second number");
			int b = sc.nextInt();
			System.out.println("Addition of entered numbers : " + ao.addition(a, b));
		}
		if (choice == 2) {
			System.out.println("Enter first number");
			int a = sc.nextInt();
			System.out.println("Enter second number");
			int b = sc.nextInt();
			System.out.println("Subtraction of entered numbers : " + ao.subtraction(a, b));
		}
		if (choice == 3) {
			System.out.println("Enter first number");
			int a = sc.nextInt();
			System.out.println("Enter second number");
			int b = sc.nextInt();
			System.out.println("Multiplication of entered numbers : " + ao.multiplication(a, b));
		}
		if (choice == 4) {
			System.out.println("Enter first number");
			int a = sc.nextInt();
			System.out.println("Enter second number");
			int b = sc.nextInt();
			System.out.println("Division of entered numbers : " + ao.division(a, b));
		}

	}
}
