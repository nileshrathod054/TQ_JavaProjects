package basic;

import java.util.Scanner;

public class SwitchChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice = sc.next();
		int a = 10, b = 20;
		switch (choice) {
		case "add":
			System.out.println("Addition is " + (a + b));
			break;
		case "sub":
			System.out.println("Subtraction is " + (a - b));
			break;
		case "mul":
			System.out.println("Multiplication is " + (a * b));
			break;
		case "div":
			System.out.println("Division is " + (a / b));
			break;
		default:
			System.out.println("Wrong Choice");

		}
	}
}
