package arrayAssignment;

import java.util.Scanner;

public class Q3_IntegerInput {
	public static void main(String[] args) {

		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 integers: ");
		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter a number to check if it is present in the array: ");
		int number = sc.nextInt();
		boolean flag = false;
		for (int i = 0; i < 10; i++) {
			if (arr[i] == number) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("The number is present in the array.");
		} else {
			System.out.println("The number is not present in the array.");
		}
	}
}