package assignment_14thJan;

import java.util.Scanner;

public class Q3ArraySorting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size = sc.nextInt();
		int[] array = new int[size];
		if (size > 0) {
			System.out.println("Enter the elements:");
			for (int i = 0; i < size; i++) {
				array[i] = sc.nextInt();
			}
			// sort first half of the array
			for (int i = 0; i <= size / 2; i++) {
				for (int j = i + 1; j <= size / 2; j++) {
					if (array[j] < array[i]) {
						int temp = array[j];
						array[j] = array[i];
						array[i] = temp;
					}
				}
			}
			// sort second half of the array
			for (int i = size / 2 + 1; i < size; i++) {
				for (int j = i + 1; j < size; j++) {
					if (array[j] > array[i]) {
						int temp = array[j];
						array[j] = array[i];
						array[i] = temp;
					}
				}
			}
			// print the sorted array
			for (int i = 0; i < size; i++) {
				System.out.println(array[i]);
			}
		} else {
			System.out.println("Array size should be greater than 0");
		}
	}

}