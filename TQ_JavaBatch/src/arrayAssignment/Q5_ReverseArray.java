package arrayAssignment;

import java.util.Scanner;

public class Q5_ReverseArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		int[] b = new int[10];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the value of a[" + i + "]");
			a[i] = sc.nextInt();
		}
		int j = 0;
		for (int i = b.length - 1; i >= 0; i--) {
			b[i] = a[j];
			j++;
		}
		System.out.println("Reverse array of the input array.");
		for (int i = 0; i < b.length; i++) {
			System.out.println("The value of b[" + i + "] is " + b[i]);
		}
	}
}
