package arrayAssignment;

import java.util.Scanner;

public class Q8_MaxMinNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the value of a[" + i + "]");
			a[i] = sc.nextInt();
		}
//int []a= {1,2,3,4,5,6,7};
		int max = a[0];
		int min = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
			if (a[i] < min)
				min = a[i];
		}

		System.out.println("Maximum number of an array is " + max);
		System.out.println("Minimum number of an array is " + min);
	}
}
