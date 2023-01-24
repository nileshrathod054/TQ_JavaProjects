package array;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		/*
		 * int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};//3*3
		 * 
		 * for(int i=0;i<arr.length;i++)//row {
		 * 
		 * for(int j=0;j<arr.length;j++) {
		 * 
		 * System.out.print(arr[i][j]+" "); } System.out.println("");
		 * 
		 * }
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements");
		System.out.println("Enter row");
		int row = sc.nextInt();
		System.out.println("Enter column");
		int col = sc.nextInt();
		int arr[][] = new int[row][col];

		for (int i = 0; i < row; i++)// row
		{

			for (int j = 0; j < col; j++) {

				arr[i][j] = sc.nextInt();

			}
		}

		for (int i = 0; i < row; i++)// row
		{

			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");

		}

	}

}
