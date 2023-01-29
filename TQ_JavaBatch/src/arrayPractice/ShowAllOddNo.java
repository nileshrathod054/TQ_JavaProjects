package arrayPractice;

import java.util.Scanner;

public class ShowAllOddNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array : ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter array elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();

		}
		System.out.println("Odd elements in an array are : ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0)
				System.out.print(a[i] + " ");
		}
	}
}
