package array;

import java.util.Scanner;

public class ArrayEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Length of an array " + a.length);
		System.out.println("Enter array elements....");
		for (int i = 0; i <= a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Array elements are ..");

		for (int i = 0; i <= a.length - 1; i++) {
			
		}
		System.out.println(a[size]);
	}
}