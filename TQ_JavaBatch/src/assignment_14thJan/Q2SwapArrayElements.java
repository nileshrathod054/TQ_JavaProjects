package assignment_14thJan;

import java.util.Scanner;

public class Q2SwapArrayElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the first array :");
		int num1 = sc.nextInt();
		if (num1 <= 0 || num1>20) {
			System.out.println("Invalid range");
		}
		int arr1[] = new int[num1];
		System.out.println("Enter the elements in the first array ");
		for (int i = 0; i < num1; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter the number of elements in the second array :");
		int num2 = sc.nextInt();
		if (num2 <= 0|| num2>20) {
			System.out.println("Invalid range");
		}
		int arr2[] = new int[num2];
		System.out.println("Enter the elements in the second array ");
		for (int i = 0; i < num2; i++) {
			arr2[i] = sc.nextInt();
		}
		if (num1 != num2) {
			System.out.println("Unable to swap size differs");
			
		}
		for (int i = 0; i < num1; i++) {
			int temp = arr1[i];
			arr1[i] = arr2[i];
			arr2[i] = temp;
		}
		System.out.println("The first array after swapping is :");
		for (int i = 0; i < num1; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		System.out.println("The second array after swapping is :");
		for (int i = 0; i < num2; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}
