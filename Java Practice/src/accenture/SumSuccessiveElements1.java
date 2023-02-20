package accenture;

import java.util.Scanner;

public class SumSuccessiveElements1 {
	public static int SumSuccessiveElements(int arr[], int size, int n) {
		int sum = 0;
		for (int i = (n - 1); i < size; i = i + n) {
			sum = sum + arr[i];

		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array");
		int size = sc.nextInt();
		System.out.println("Enter an elements of array");
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter a number for Sum of an array");
		int n = sc.nextInt();
		System.out.println("Sum of successive Elements is=" + SumSuccessiveElements(arr, size, n));
	}
}
