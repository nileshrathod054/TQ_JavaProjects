package logicalPrograms;

import java.util.Arrays;

public class MergeTwoArray {
	public static void main(String[] args) {
		int arr1[] = { 1, 3, 5, 7 };
		int arr2[] = { 2, 4, 6, 8 };

		int arr3[] = new int[arr1.length + arr2.length];

		int j = 0, k = 0;
		for (int i = 0; i < arr3.length; i++) {
			if (i % 2 == 0) {
				arr3[i] = arr1[j];
				j++;
			} else {
				arr3[i] = arr2[k];
				k++;
			}
		}
		System.out.println(Arrays.toString(arr3));
	}
}
