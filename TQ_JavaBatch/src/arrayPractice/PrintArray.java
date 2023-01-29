package arrayPractice;

import java.util.Scanner;

public class PrintArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array : ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Length of an array is : " + a.length);
		System.out.println("Enter array elements : ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();

		}
		System.out.println("Array elements are : ");
		// Accessing an array elements
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
	}
}
