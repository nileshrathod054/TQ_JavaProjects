package mock;

import java.util.Scanner;

//Take a 10 numbers from user in which five numbers are odd and even arrange them in odd even alternatively
public class ArrayEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[10];
		System.out.println("Enter the array elements");
		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The even elements are....");
		for (int i = 0; i < 10; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i] + " ");
			}
		}
		System.out.println(" ");

		System.out.println("The odd elements are....");
		for (int i = 0; i < 10; i++) {
			if (arr[i] % 2 != 0) {
				System.out.println(arr[i] + " ");
			}
		}
	}
}
