package array;

import java.util.Scanner;

public class Searching {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1 4 3 5 6 ele :3
		System.out.println("Enter the size");
		int size = sc.nextInt();
		int flag = 0;
		String arr[] = new String[size];

		System.out.println("Enter array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		System.out.println("Enter the number you want to search");
		String ele = sc.next();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(ele)) {
				flag = 1;
				break;
			}
		}
		if (flag == 1)
			System.out.println("given array element present");
		else
			System.out.println("given array element not present");

	}

}
