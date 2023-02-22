package array;

import java.util.Arrays;
import java.util.Scanner;

public class Merge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size 1st array");
		int size1 = sc.nextInt();
		int k = 0;

		int arr1[] = new int[size1];
		for (int i = 0; i < size1; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter the size of 2nd array");
		int size2 = sc.nextInt();

		int arr2[] = new int[size1];

		for (int j = 0; j < size2; j++) {
			arr2[j] = sc.nextInt();
		}

		int arr3[] = new int[size1 + size2];

		for (k = 0; k < size1; k++) {
			arr3[k] = arr1[k];
		}

		for (int m = 0, l = k; m < arr2.length && l < arr3.length; m++, l++) {

			arr3[l] = arr2[m];

		}

		for (int i = 0; i < arr3.length; i++) {
			System.out.println("arr[" + i + "]" + arr3[i]);
		}

		System.out.println("--------");
		Arrays.fill(arr3, 2, 5, 0);

		for (int i = 0; i < arr3.length; i++) {
			System.out.println("arr[" + i + "]" + arr3[i]);
		}

	}

}
