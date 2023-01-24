package array;

import java.util.*;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 array elements");
		int Arr[] = new int[5];
		for (int i = 0; i < Arr.length; i++)
			Arr[i] = sc.nextInt();
		System.out.println("Original Array: ");
		for (int j = 0; j < Arr.length; j++)
			System.out.println(Arr[j]);
		System.out.println("Reverse Array is : ");
		for (int k = Arr.length - 1; k >= 0; k--)
			System.out.print(Arr[k] + " ");
	}
}
