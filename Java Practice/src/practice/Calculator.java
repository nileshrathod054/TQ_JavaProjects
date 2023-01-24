package practice;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the operation number.");
		System.out.println("1.Addition" + "\n" + "2.Subtraction" + "\n" + "3.Multiplication" + "\n" + "4.Division"
				+ "\n" + "5.Modulous");
		int n = sc.nextInt();
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		int Add = a + b;
		int Sub = a - b;
		int Mul = a * b;
		int Div = a / b;
		int Mod = a % b;
		if (n == 1) {
			System.out.println(Add);
		} else if (n == 2) {
			System.out.println(Sub);
		} else if (n == 3) {
			System.out.println(Mul);
		} else if (n == 4) {
			System.out.println(Div);
		} else if (n == 5) {
			System.out.println(Mod);
		} else {
			System.out.println("Wrong input");
		}
	}
}
