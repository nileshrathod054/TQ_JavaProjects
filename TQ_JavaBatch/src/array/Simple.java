package array;

import java.util.Scanner;

public class Simple {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6 };

		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);

		System.out.println(a.length);

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}

		System.out.println("values from user");
		int i = 0;

		for (i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		for (i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}
