package array;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		int arr[] = { 34, 45, 67, 39, 56 };
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter maximum index u want");
		int index = sc.nextInt();
		Arrays.sort(arr);

		for (int a : arr) {
			System.out.println(a);
		}

		System.out.println(arr[arr.length - index]);

	}

}
