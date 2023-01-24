package array;

import java.util.Scanner;

//jagged array:  arrays within array

public class JaggedArray {

	public static void main(String[] args) {

		int arr[][] = new int[3][];

		Scanner sc = new Scanner(System.in);

		arr[0] = new int[3];
		arr[1] = new int[2];
		arr[2] = new int[3];

		// 1 2 3
		// 4 5
		// 6 7 8

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)

				arr[i][j] = sc.nextInt();

		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)

				System.out.print(arr[i][j]);

		}
		System.out.println("");

	}

}
